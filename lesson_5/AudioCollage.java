public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            double tone = a[i] * alpha;
            b[i] = tone;
        }
        return b;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        int l = a.length;
        double[] b = new double[l];
        for (int i = l - 1; i > -1; i--) {
            int j = (l - 1) - i;
            b[j] = a[i];
        }
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        int total = a.length + b.length;
        double[] c = new double[total];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = a.length; i < total; i++) {
            int j = i - a.length;
            c[i] = b[j];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        int al = a.length;
        int bl = b.length;
        if (al < bl) {
            double[] c = new double[bl];
            for (int i = 0; i < al; i++) {
                double tone = a[i] + b[i];
                c[i] = tone;
            }
            for (int i = al; i < bl; i++) {
                c[i] = 0.0 + b[i];
            }
            return c;
        } else if (al > bl) {
            double[] c = new double[al];
            for (int i = 0; i < bl; i++) {
                double tone = a[i] + b[i];
                c[i] = tone;

            }
            for (int i = bl; i < al; i++) {
                c[i] = 0.0 + a[i];
            }
            return c;
        } else {
            double[] c = new double[al];
            for (int i = 0; i < al; i++) {
                c[i] = a[i] + b[i];
            }
            return c;
        }
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        int newLen = (int) (a.length / alpha);
        double[] b = new double[newLen];
        for (int i = 0; i < newLen; i++) {
            int j = (int) (i / alpha);
            b[i] = a[j];
        }
        return b;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        String[] files = new String[] { "piano.wav", "beatbox.wav", "singer.wav",
                "chimes.wav", "buzzer.wav" };
        // String[] files = new String[] { "piano.wav", "beatbox.wav" };
        for (int k = 0; k < (files.length - 1); k++) {
            // read two arrays
            String path = files[k];
            double[] a = StdAudio.read(path);
            path = files[k + 1];
            double[] b = StdAudio.read(path);
            // create one array per effect
            double[] amplify = amplify(a, 0.5);
            double[] reverse = reverse(a);
            double[] merge = merge(a, b);
            double[] mix = mix(a, b);
            double[] speed = changeSpeed(a, 1.5);
            // creae the final array before playing
            // declare duration in secs
            int duration = 50;
            duration = duration * 2;
            double[] finalArray = new double[duration];
            // one iteration per effect
            for (int j = 0; j < 5; j++) {
                for (int i = 0; i < (duration / 5); i++) {
                    int index = (i + (j * (duration / 5)));
                    if (j == 0) {
                        finalArray[index] = Math.max(-1.0, Math.min(1.0, amplify[i]));
                    } else if (j == 1) {
                        finalArray[index] = Math.max(-1.0, Math.min(1.0, reverse[i]));
                    } else if (j == 2) {
                        finalArray[index] = Math.max(-1.0, Math.min(1.0, merge[i]));
                    } else if (j == 3) {
                        finalArray[index] = Math.max(-1.0, Math.min(1.0, mix[i]));
                    } else {
                        finalArray[index] = Math.max(-1.0, Math.min(1.0, speed[i]));
                    }

                }
            }
            for (int i = 0; i < 50; i++) {
                System.out.println(finalArray[i]);
            }
            StdAudio.play(finalArray);
        }
    }
}