class Solution {
    /**
     * @param {string} word1
     * @param {string} word2
     * @return {string}
     */
    mergeAlternately(word1, word2) {
        let output ="" ; 
         let w1 = 0;
         let w2 = 0;
   
         while(output.length<((word1.length)+(word2.length))){
            if(w1<word1.length){
                output+= word1[w1];
                w1++;
            }
            if(w2<word2.length){
                output+= word2[w2];
                w2++
            }
         }
         return output;
    }
}
