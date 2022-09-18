public class GeneralizedHarmonic {

    public static void main(String[] args) {
        double i = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = 0;
        for (double n = i; n > 0; n--) {
            t += (1 / Math.pow(n, r));
        }
        System.out.println(t);
    }
}