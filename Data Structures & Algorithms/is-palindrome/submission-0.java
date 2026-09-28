class Solution {
    public boolean isPalindrome(String s) {
        int r = 0;

        String result = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = result.length() - 1;
        System.out.println(result);
        while (r <= l) {
            if (result.charAt(r) != result.charAt(l)) {
                return false;
            }
            r++;
            l--;
        }
        return true;
    }
}
