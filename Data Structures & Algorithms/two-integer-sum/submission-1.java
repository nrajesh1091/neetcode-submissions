class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer , Integer> num = new HashMap();
         int[] arr = new int[2];
         for(int i=0  ; i < nums.length ;i++){
            num.put(nums[i],i);
         }
         for(int i=0 ; i< nums.length; i ++){
            if(num.get(target-nums[i])!=null){
             int d = num.get(target-nums[i]);
             if(d!=i){
                arr[0]=i;
                arr[1]= d;
                break;
             }
            }
         }
         return arr;
    }
}
