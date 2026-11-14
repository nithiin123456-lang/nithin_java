
import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = matrix[i][0];
            int col = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            boolean isMax = true;

            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][col] > min) {
                    isMax = false;
                    break;
                }
            }

            if (isMax) {
                result.add(min);
            }
        }

        return result;
    }
}
