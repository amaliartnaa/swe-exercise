package strong_number;

public class Main {
    public static String isStrongNumber(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return (sum == original) ? "STRONG!!!!" : "Not Strong !!";
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        System.out.println(isStrongNumber(1));
        System.out.println(isStrongNumber(145));
        System.out.println(isStrongNumber(123));
        System.out.println(isStrongNumber(150));
    }
}
