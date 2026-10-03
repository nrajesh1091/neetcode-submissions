class Solution {
    /**
     * @param {character[]} s
     * @return {void} Do not return anything, modify s in-place instead.
     */
    reverseString(s) {
        let l=0;
        let r  = s.length-1;

        while(l<=r){
            let d  = s[r];
            s[r]= s[l];
            s[l]=d;
            l++;
            r--;
        }
        return s;
    }
}
