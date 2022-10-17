public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(0, 1);
        int i;
        int j;
        double w = 1.0 / (n * 2.0);
        double y = 1.0 / (n * 2.0);
        for (j = 1; j <= n; j++) {
            double x = 1.0 / (n * 2.0);

            for (i = 1; i <= n; i++) {
                if (i % 2 > 0 && j % 2 > 0) {
                    StdDraw.filledSquare(x, y, w);
                } else if (i % 2 > 0 && j % 2 == 0) {
                    StdDraw.square(x, y, w);
                } else if (i % 2 == 0 && j % 2 == 0) {
                    StdDraw.filledSquare(x, y, w);
                } else if (i % 2 == 0 && j % 2 > 0) {
                    StdDraw.square(x, y, w);
                }
                x += (w * 2.0);
            }
            y += (w * 2.0);
        }

    }

}