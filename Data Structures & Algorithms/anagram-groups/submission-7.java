class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList();

        Map<String, List<String>> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            int[] chrts = new int[26];
            List<String> str = new ArrayList();
            for (int j = 0; j < strs[i].length(); j++) {
                chrts[strs[i].charAt(j) - 'a']++;
            }
            String strarr = Arrays.toString(chrts);
            map.computeIfAbsent(strarr, k -> new ArrayList<>()).add(strs[i]);
        }
  
        for (List<String> str : map.values()) {
            output.add(str);
        }
        return output;
    }
}