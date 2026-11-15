class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int []arr=new int[50];
        for(int i=lowLimit;i<=highLimit;i++){
            int n =i;
            int sum=0;
            while(n>0){
                sum+=n%10;
                n=n/10;
            }
            arr[sum]++;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

//1742. Maximum Number of Balls in a Box