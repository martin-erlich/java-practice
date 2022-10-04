public class ShannonEntropy {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        double h = 0.0;
        double log = Math.log(2);
        for (int i = 0; i < m; i++) {
            int x = StdIn.readInt();
            double px = 1/
//            Px = sentence.count(chr(character_i))/len(sentence)
            h += (x * log * x);
//            StdOut.println(x);
        }
        h = h * -1;
        StdOut.println(h);
    }
}