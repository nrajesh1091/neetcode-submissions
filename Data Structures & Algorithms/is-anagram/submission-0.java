class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> str = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            str.put(a, str.getOrDefault(a, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char a = t.charAt(i);
            if (str.getOrDefault(a, 0) > 0) {
                str.put(a, str.getOrDefault(a, 0) - 1);
            } else {
                return false;
            }
        }
        for (char a : str.keySet()) {
            if (str.get(a) > 0) {
                return false;
            }
        }
        return true;
    }
}
