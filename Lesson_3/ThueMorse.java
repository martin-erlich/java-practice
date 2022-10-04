public class ThueMorse {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int len = (int) Math.pow(2, n);
        String[] strArray = new String[len];
        strArray[0] = "0";
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < Math.pow(2, j); i++) {
                int buffer = (int) Math.pow(2, j);
                if (strArray[i].equals("0")) {
                    strArray[i + buffer] = "1";
                } else {
                    strArray[i + buffer] = "0";
                }
            }
        }
        int[] seq = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            seq[i] = Integer.parseInt(strArray[i]);
        }
        int seqLen = seq.length;
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                int y = i;
                int x = j;
                while (x >= seqLen) {
                    x -= seqLen;
                }
                while (y >= seqLen) {
                    y -= seqLen;
                }
                if (seq[y] == seq[x]) {
                    line += "+  ";
                } else {
                    line += "-  ";
                }
            }
            System.out.println(line);
        }
    }
}