class Solution {
    /**
     * @param {number[]} nums1
     * @param {number} m
     * @param {number[]} nums2
     * @param {number} n
     * @return {void} Do not return anything, modify nums1 in-place instead.
     */
    merge(nums1, m, nums2, n) {
        let index = nums1.length - 1;
        while (index > -1) {
            if (m && nums1[m - 1] > nums2[n - 1]) {
                nums1[index] = nums1[m - 1];
                m--;
            } else {
                if (n > 0) {
                    nums1[index] = nums2[n - 1];
                    n--;
                }
            }
            console.log("else ", n);
            index--;
        }
    }
}
