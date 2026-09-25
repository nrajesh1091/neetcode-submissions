class Solution {
    /**
     * @param {number[]} nums
     * @return {boolean}
     */
    hasDuplicate(nums) {
        let hasMap={}
        
        for(let i=0; i<nums.length ; i++){
            if(hasMap[nums[i]]){
                return true
            }else{
                hasMap[nums[i]] = true
            }
        }
        return false
    }
}
