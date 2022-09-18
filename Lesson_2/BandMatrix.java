public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        int p = 0;
        for (int i = n; i > 0; i--) {
            String line = "";
            int c = 0;
            while (line.length() < n) {
                if (p == c) {
                    line = line + '*';
                } else if (Math.abs(c - p) <= width) {
                    line = line + '*';
                } else {
                    line = line + '0';
                }
                c++;
            }
            System.out.println(line);
            p++;
        }
    }
}

// def BandMatrix(n,width):
// print(f'for n = {n} and width = {width}: ')
// print('')
// p = 0
// for i in range(n):
// line = ''
// c = 0
// while len(line) < n:
// if p == c:
// line += '*'
// elif abs(c-p) <= width:
// line += '*'
// else:
// line += '0'
// c += 1
// print(line)
// p += 1