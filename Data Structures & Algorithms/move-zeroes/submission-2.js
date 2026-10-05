class Solution {
    /**
     * @param {number[]} nums
     * @return {void} Do not return anything, modify nums in-place instead.
     */
    moveZeroes(nums) {
        let l =0 ;
        let r= 1;
        while(l<r && r < nums.length){
              if(nums[r]===0 && nums[l]===0){
                r++;
              } else if(nums[r]!==0 && nums[l]===0){
                [nums[r] ,nums[l]]= [nums[l] , nums[r]];
                l++;
                r++;
              } else if(nums[r]===0 && nums[l]!==0 ){
                 r++;
                 l++
              }else if(nums[r]!==0 && nums[l]!==0 ){
                 r++;
                 l++
              }
        }
    }
}
