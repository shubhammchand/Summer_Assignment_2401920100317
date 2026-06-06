class Solution {
    public boolean isPalindrome(String s) {
        String cs = s.toLowerCase().replaceAll("[^a-z0-9]","");
        char [] chars = cs.toCharArray();
        if (chars.length ==0)return true;
        int l = 0;
        int r = chars.length - 1;
        do {
            if (chars[l]!= chars[r])return false;
        } while (l++ < r--);
       return true;
    }
}
