class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int r = i + 1;
            int l = nums.length - 1;
            List<Integer> lst = new ArrayList<>();

            while (r < l) {
                if (nums[i] + nums[r] + nums[l] > 0) {
                    l--;
                } else if (nums[i] + nums[r] + nums[l] < 0) {
                    r++;
                } else {
                      output.add(
                        Arrays.asList(nums[i], nums[l], nums[r])
                    );
                    l--;
                    r++;

                    // Skip duplicates
                    while (r < l && nums[r] == nums[r - 1]) {
                        r++;
                    }

                    while (r < l && nums[l] == nums[l + 1]) {
                        l--;
                    }
                }
            }
        }
        return output;
    }
}
