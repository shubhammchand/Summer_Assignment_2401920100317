import java.util.Stack;

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;

        for (int i = 0; i <= heights.length; i++) {
            int curr = 0;

        
            if (i == heights.length) {
                curr = -1;
            } else {
                curr = heights[i];
            }

            while (!st.isEmpty() && heights[st.peek()] >= curr) {
                
                int h = heights[st.pop()];

                
                int w = st.isEmpty() ? i : i - st.peek() - 1;

                System.out.println("h " + h + " w " + w);

                ans = Math.max(ans, h * w);
            }

            st.push(i);
        }

        return ans;
    }
}
