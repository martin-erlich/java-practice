public class Minesweeper {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        boolean[][] grid = new boolean[n + 2][m + 2];
        int[][] count = new int[n + 2][m + 2];
        int c = 0;
        while (c < k) {
            int x = (int) (n * Math.random()) + 1;
            int y = (int) (m * Math.random()) + 1;

            if (!grid[x][y]) {
                grid[x][y] = true;
                c++;
            }

        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (!grid[i][j]) {
                    for (int a = i - 1; a <= i + 1; a++) {
                        for (int b = j - 1; b <= j + 1; b++) {
                            if (grid[a][b]) {
                                count[i][j]++;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (!grid[i][j]) {
                    System.out.print(count[i][j] + "  ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}