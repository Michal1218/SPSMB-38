public class MatUtils {
    public static int s(int a) {

        return a + a;
    }

    public static int v(int a) {
        return s(a) + a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sCyr(int r) {
        return Math.PI * r * r;
    }

    public static int factorial(int f) {
        int fa = 1;
        for (int i = f; i > 0; i++) {
            fa = fa * i;
        }
        return fa;
    }

    public static boolean isEven(int sd) {
        if (sd % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean primeNumber(int prvocislo) {

    }
}