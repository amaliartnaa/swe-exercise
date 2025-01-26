package diagonal_traverse;

import java.util.*;

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, List<Integer>> diagonalMap = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int diagonalKey = i + j;
                diagonalMap.putIfAbsent(diagonalKey, new ArrayList<>());
                diagonalMap.get(diagonalKey).add(mat[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int key = 0; key < m + n - 1; key++) {
            List<Integer> diagonal = diagonalMap.get(key);
            if (key % 2 == 0) {
                Collections.reverse(diagonal);
            }
            result.addAll(diagonal);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}

public class Main {
}
