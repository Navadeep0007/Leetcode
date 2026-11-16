class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[] expected=heights.clone();
        int count=0;
        Arrays.sort(expected);
        for(int i=0;i<n;i++){
            if(heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }
}
//1051. Height Checker

// otpimal
class Solution {
    public int heightChecker(int[] heights) {
        int[] freq = new int[101];
        int count = 0;
        int k = 1;

        for (int x : heights) {
            freq[x]++;
        }

        for (int i = 0; i < heights.length; i++) {
            while (freq[k] == 0) {
                k++;
            }

            if (heights[i] != k) {
                count++;
            }

            freq[k]--;
        }

        return count;
    }
}