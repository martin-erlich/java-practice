public class ActivationFunction {
    public static double heaviside(double x) {
        if (x < 0) {
            return 0;
        } else if (x == 0.0) {
            return 0.5;
        } else {
            return 1;
        }
    }

    public static double sigmoid(double x) {
        return 1 / (1 + Math.exp(x * -1));
    }

    public static double tanh(double x) {

        double num = Math.exp(x) - Math.exp(x * -1);
        double den = Math.exp(x) + Math.exp(x * -1);
        return num / den;
    }

    public static double softsign(double x) {
        return x / (1 + Math.abs(x));
    }

    public static double sqnl(double x) {
        if (x <= -2) {
            return -1;
        } else if (x < 0) {
            return x + (Math.pow(x, 2) / 4);
        } else if (x < 2) {
            return x - (Math.pow(x, 2) / 4);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println("heaviside(" + x + ") = " + heaviside(x));
        System.out.println("  sigmoid(" + x + ") = " + sigmoid(x));
        System.out.println("     tanh(" + x + ") = " + tanh(x));
        System.out.println(" softsign(" + x + ") = " + softsign(x));
        System.out.println("     sqnl(" + x + ") = " + sqnl(x));
    }
}