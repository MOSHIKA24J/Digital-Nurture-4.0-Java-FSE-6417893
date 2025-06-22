import java.util.Scanner;

public class FinancialForecasting {

    static double forecastRecursive(double value, double growth, int years) {
        if (years == 0) return value;
        return forecastRecursive(value * (1 + growth), growth, years - 1);
    }

    static double forecastIterative(double value, double growth, int years) {
        for (int i = 0; i < years; i++) {
            value *= (1 + growth);
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting value (₹): ");
        double start = sc.nextDouble();

        System.out.print("Enter annual growth rate (in %): ");
        double rate = sc.nextDouble() / 100;

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double resultRecursive = forecastRecursive(start, rate, years);
        double resultIterative = forecastIterative(start, rate, years);

        System.out.printf("\nPredicted (Recursive): ₹%.2f\n", resultRecursive);
        System.out.printf("Predicted (Iterative): ₹%.2f\n", resultIterative);

        sc.close();
    }
}
