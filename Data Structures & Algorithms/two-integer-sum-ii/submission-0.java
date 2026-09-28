class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r = 0;
        int l = numbers.length -1;
        int[] output = new int[2];
        while (l > r) {
            if (numbers[l] + numbers[r] > target) {
                l--;
            }
            else if (numbers[l] + numbers[r] < target) {
                r++;
            }
            else if (numbers[l] + numbers[r] == target) {
                output[0] = r+1;
                output[1] = l+1;
                return output;
            }
        }
        return output;
    }
}
