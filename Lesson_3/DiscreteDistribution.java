public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 1; i <= args.length - 1; i++) {
            a[i - 1] = Integer.parseInt(args[i]);
        }
        int[] cumSumArr = new int[a.length];
        int cumSum = 0;
        for (int i = 0; i < cumSumArr.length; i++) {
            cumSum += a[i];
            cumSumArr[i] = cumSum;
        }
        String line = "";
        for (int x = 0; x < m; x++) {
            double r = Math.random();
            r = r * cumSum;
            int j = (int) r;
            for (int i = 0; i < cumSumArr.length; i++) {
                if (j < cumSumArr[i]) {
                    line += i + 1 + " ";
                    break;
                }
            }


        }
        System.out.println(line);
    }
}
