public class GreatCircle {
    public static void main(String[] args) {
        double r = 6371.0;
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        double sin1 = Math.sin(Math.toRadians((x2 - x1) / 2.0));
        double sin2 = Math.sin(Math.toRadians((y2 - y1) / 2.0));
        double cos1 = Math.cos(Math.toRadians(x1));
        double cos2 = Math.cos(Math.toRadians(x2));
        double trigCalc = sin1 * sin1 + cos1 * cos2 * sin2 * sin2;
        double squareRoot = Math.sqrt(trigCalc);
        double result = 2 * r * Math.asin(squareRoot);
        System.out.println(result + " kilometers");

    }

}
