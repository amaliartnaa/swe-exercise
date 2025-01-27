package adding_two_negabinary_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
        int n = Math.max(arr1.length, arr2.length);
        List<Integer> result = new ArrayList<>();

        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) sum += arr1[i--];
            if (j >= 0) sum += arr2[j--];

            result.add(sum & 1);
            carry = -(sum >> 1);
        }

        while (result.size() > 1 && result.get(result.size() - 1) == 0) {
            result.remove(result.size() -1);
        }

        Collections.reverse(result);

        int[] resultArray = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            resultArray[k] = result.get(k);
        }

        return resultArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1 ,1};
        int[] arr2 = {1, 0, 1};

        Main solution = new Main();
        int[] result = solution.addNegabinary(arr1, arr2);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
