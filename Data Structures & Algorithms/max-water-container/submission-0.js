class Solution {
    /**
     * @param {number[]} heights
     * @return {number}
     */
    maxArea(heights) {
        let l = 0;
        let r = heights.length - 1;
        let area = 0;
        while (l < r) {
            let breadth = r - l;
            let length = Math.min(heights[l], heights[r]);
            let calArea= breadth * length;
            area = Math.max(area, calArea);
            if (heights[l] < heights[r]) {
                l++;
            } else if (heights[l] > heights[r]) {
                r--;
            } else {
                l++;
            }
        }
        return area;
    }
}
