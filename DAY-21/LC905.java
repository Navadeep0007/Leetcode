class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n =nums.length;
        int[] arr= new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}

//905. Sort Array By Parity



class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n =nums.length;
        int i=0;
        int j=n-1;
        //Two pointers approach
       while(i<j){
        if(nums[i]%2>nums[j]%2){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        if(nums[i]%2==0){
            i++;
        }
        if(nums[j]%2!=0){
            j--;
        }
       }
       return nums;
    }
}