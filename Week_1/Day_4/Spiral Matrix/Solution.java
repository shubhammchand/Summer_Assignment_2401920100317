import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> v = new ArrayList<>();

        int top = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right) {

            for (int k = left; k <= right; k++) {
                v.add(matrix[top][k]);
            }
            top++;

            for (int k = top; k <= bottom; k++) {
                v.add(matrix[k][right]);
            }
            right--;

            if (top <= bottom) {
                for (int k = right; k >= left; k--) {
                    v.add(matrix[bottom][k]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int k = bottom; k >= top; k--) {
                    v.add(matrix[k][left]);
                }
                left++;
            }
        }

        return v;
    }
}
