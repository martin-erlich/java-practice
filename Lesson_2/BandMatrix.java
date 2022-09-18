public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int p = 0;
        for (int i = n; i > 0; i--) {
            String line = "";
            int c = 0;
            for (int j = n; j > 0; j--) {
                // while (line.length() < n) {
                if (p == c) {
                    line += "*  ";
                } else if (Math.abs(c - p) <= width) {
                    line += "*  ";
                } else {
                    line += "0  ";
                }
                c++;
            }
            System.out.println(line);
            p++;
        }
    }
}