public class CMYKtoRGB {
    public static void main(String[] args) {
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        double white = 1 - k;
        double redD = 255 * white * (1 - c);
        double greenD = 255 * white * (1 - m);
        double blueD = 255 * white * (1 - y);
        int red = (int) redD;
        int green = (int) greenD;
        int blue = (int) blueD;
        System.out.println("red = " + red + "\ngreen = " + green + "\nblue = " + blue);

    }
}
