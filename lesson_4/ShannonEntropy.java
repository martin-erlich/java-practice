public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[m + 1];
        double count = 0;
        double entropy = 0.0;

        while (!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            a[value] += 1;
            count += 1;
        }

        for (int i = 1; i <= m; i++) {
            double p = 0;
            if (a[i] != 0) {
                p = -(a[i] / count * (Math.log(a[i] / count) / Math.log(2)));
            }
            entropy += p;
        }
        StdOut.printf("%.4f", entropy);
    }
}