public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int aSq = a * a;
        int b = Integer.parseInt(args[1]);
        int bSq = b * b;
        int c = Integer.parseInt(args[2]);
        int cSq = c * c;

        boolean positve = a > 0 && b > 0 && c > 0;

        boolean isRigthTriangle;
        isRigthTriangle = aSq + bSq == cSq;
        isRigthTriangle = isRigthTriangle || aSq + cSq == bSq;
        isRigthTriangle = isRigthTriangle || bSq + cSq == aSq;

        System.out.println(isRigthTriangle && positve);
    }

}
