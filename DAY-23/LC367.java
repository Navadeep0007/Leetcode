class Solution {
    public boolean isPerfectSquare(int num) {
        for(long i=1;i<=num/i;i++){
            if(i*i==num){
                return true;
            }
        }
        return false;
    }
}

// Brute Force Approach
// 367. Valid Perfect Square