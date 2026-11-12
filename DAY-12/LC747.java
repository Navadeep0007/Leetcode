class Solution {
    public int dominantIndex(int[] nums) {
        int max=-1;
        int second=-1;
        int index=-1;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                second = max;
                max=nums[i];
                index=i;
            } else if(nums[i]>second){
                second=nums[i];
            }
        }
        if(max>=2*second){
            return index;
        }
        return -1;
    }
}

//747. Largest Number At Least Twice of Others