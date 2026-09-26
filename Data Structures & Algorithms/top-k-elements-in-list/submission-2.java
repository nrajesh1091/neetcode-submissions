class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] lst = new List[nums.length + 1];
        for (int j = 0; j < lst.length; j++) {
            lst[j] = new ArrayList();
        }
        Map<Integer, Integer> map = new HashMap();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> m  : map.entrySet()) {
            lst[m.getValue()].add(m.getKey());
        }
        int index = 0;
        int[] res = new int[k];
        for (int j = lst.length - 1; j > 0; j--) {
            for (int i : lst[j]) {
                res[index++] = i;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
