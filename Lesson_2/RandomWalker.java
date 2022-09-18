public class RandomWalker {

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = -1;
        while (Math.abs(x) + Math.abs(y) <= m) {
            // for (int j = 0; j < 5; j++) {
            double prob = Math.random();
            String output = "(" + x + "," + y + ")";
            System.out.println(output);
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
        System.out.println("Steps = " + steps);
    }
}
