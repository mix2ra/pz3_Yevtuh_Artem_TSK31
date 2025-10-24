package lab03;

public class Task15 {
    public static void main(String[] args) {
        printResult(0.001);
        printResult(0.00001);
        printResult(1e-7);
    }

    public static double calculateSum(double eps) {
        if (eps <= 0) {
            throw new IllegalArgumentException("epsilon must be > 0");
        }

        double sum = 0;
        int i = 1;

        while (true) {
            double term = Math.pow(-1, i + 1) / (i * (i + 1.0) * (i + 2.0));

            if (Math.abs(term) < eps) {
                break; // досягнуто потрібну точність
            }

            sum += term;
            i++;
        }

        return sum;
    }

    public static void printResult(double eps) {
        try {
            double result = calculateSum(eps);
            System.out.printf("ε = %.10f → сума = %.10f%n", eps, result);
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}
