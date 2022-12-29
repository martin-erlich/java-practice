public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, n);
        int i;
        int j;
        double w = 0.5;
        double y = 0.5;
        for (j = 1; j <= n; j++) {
            double x = 0.5;

            for (i = 1; i <= n; i++) {
                if (i % 2 > 0 && j % 2 > 0) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x, y, w);
                } else if (i % 2 > 0 && j % 2 == 0) {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    StdDraw.filledSquare(x, y, w);
                } else if (i % 2 == 0 && j % 2 == 0) {
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(x, y, w);
                } else if (i % 2 == 0 && j % 2 > 0) {
                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    StdDraw.filledSquare(x, y, w);
                }
                x += (w * 2.0);
            }
            y += (w * 2.0);
        }
    }
}