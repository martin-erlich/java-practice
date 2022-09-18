public class RandomWalkers {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double t = Integer.parseInt(args[1]);
        double totalSteps = 0;
        int x = 0;
        int y = 0;
        int steps = 0;
        for (int j = 0; j < t; j++) {
            while (Math.abs(x) + Math.abs(y) < m) {

                double prob = Math.random();
                if (prob <= 0.25) {
                    x++;
                } else if (prob <= 0.5) {
                    x--;
                } else if (prob <= 0.75) {
                    y++;
                } else {
                    y--;
                }
                steps++;
            }
            totalSteps += steps;
        }
        double averageSteps = totalSteps / t;
        System.out.println("average number of steps = " + averageSteps);
    }
}
