package balanced_number;

public class Main {
    public static String balancedNum(long number) {
        String numStr = Long.toString(number);
        int len = numStr.length();
        int mid = len / 2;

        int leftSum = numStr.substring(0, len % 2 == 0 ? mid - 1 : mid)
                .chars().map(c -> c - '0').sum();
        int rightSum = numStr.substring(mid + 1).chars().map(c -> c - '0').sum();

        return leftSum == rightSum ? "Balanced" : "Not Balanced";
    }

    public static void main(String[] args) {
        System.out.println(balancedNum(7));
        System.out.println(balancedNum(295591));
        System.out.println(balancedNum(959));
        System.out.println(balancedNum(27102983));
    }
}