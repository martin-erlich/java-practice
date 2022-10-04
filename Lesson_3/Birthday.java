public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int t = Integer.parseInt(args[1]);
        int[] count = new int[n];
        for (int i = 0; i < t; i++) {
            boolean[] repeat = new boolean[n];
            int people = 0;
            while (true) {
                int bd = (int) (Math.random() * n);
                if (repeat[bd]) {
                    break;
                } else {
                    repeat[bd] = true;
                }
                people++;
            }
            count[people]++;

        }
        int numerator = 0;
        for (int j = 0; j < count.length; j++) {
            numerator += count[j];
            double fraction = (double) numerator / t;
            System.out.println((j+1)  + "\t"   + count[j] + "\t" + fraction);
            if (fraction > 0.5) {
                break;
            }


        }

    }
}
