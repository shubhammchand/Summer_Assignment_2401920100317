class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();

        int first = 0;
        int last = 0;
        int n = s.length();

        while (last < n) {
            while (last < n && a[last] != ' ')
                last++;

            reverse(a, first, last - 1);

            last++;
            first = last;
        }

        return new String(a);
    }

    public void reverse(char[] a, int first, int last) {
        while (first < last) {
            char temp = a[last];
            a[last] = a[first];
            a[first] = temp;

            first++;
            last--;
        }
    }
}
