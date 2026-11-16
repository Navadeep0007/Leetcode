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