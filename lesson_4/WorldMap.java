public class WorldMap {
    public static void main(String[] args) {
        int w = StdIn.readInt();
        int h = StdIn.readInt();
        StdDraw.setCanvasSize(w, h);
        double W = w * 1.0;
        double H = h * 1.0;
        StdDraw.setXscale(0.0, W);
        StdDraw.setYscale(0.0, H);
        while (!StdIn.isEmpty()) {
            String region = StdIn.readString();
            int sides = StdIn.readInt();
            int i;
            double[] xs = new double[sides];
            double[] ys = new double[sides];
            for (i = 0; i < sides; i++) {
                double x = StdIn.readDouble();
                double y = StdIn.readDouble();
                xs[i] = x;
                ys[i] = y;
            }
            StdDraw.polygon(xs, ys);
        }
    }
}
