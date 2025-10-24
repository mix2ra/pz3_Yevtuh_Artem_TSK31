package lab03;

public class Task5 {
    public static void main(String[] args) {
        printResults(10, 2);
        printResults(14, 5);
        printResults(15, 2);
        printResults(5, 0);
        printResults(5, -1);
    }

    public static double calculateSum(int k, double s) {
        if (k >= 35 || k <= 0) {
            throw new IllegalArgumentException("Invalid k: " + k + " (must be 0 < k < 35)");
        }
        if (s <= 0) {
            throw new IllegalArgumentException("Invalid s: " + s + " (must be > 0)");
        }

        double sum = 0;
        for (int i = 1; i <= k; i++) {
            double value = Math.sqrt(s * (1.0 / (i * i)));
            sum += Math.log10(value);
        }
        return sum;
    }

    static void printResults(int k, double s) {
        System.out.print("k:" + k + " s:" + s + " result: ");
        try {
            System.out.println(calculateSum(k, s));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
