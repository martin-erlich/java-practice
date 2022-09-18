public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 1; i <= args.length - 1; i++) {
            a[i - 1] = Integer.parseInt(args[i]);

        }

    }
}
