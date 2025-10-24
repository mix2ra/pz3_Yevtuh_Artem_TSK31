package lab03;

public class Task10 {
    public static void main(String[] args) {
        printResults(-2, 5);   // t < 0
        printResults(4, 5);    // t >= 0
        printResults(0, 3);    // t = 0
        printResults(9, 0);    // помилка (n <= 0)
        printResults(1, -2);   // помилка (n < 0)
    }

    public static double calculateX(double t, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid n: " + n);
        }

        double sum = 0;
        if (t < 0) {
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(t, 2) * i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                sum += Math.sqrt(t) * i;
            }
        }
        return sum;
    }

    static void printResults(double t, int n) {
        System.out.print("t:" + t + " n:" + n + " result:");
        try {
            System.out.println(calculateX(t, n));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}