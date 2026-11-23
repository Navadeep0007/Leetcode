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

// optimal solution(binary search)
class Solution {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        int j = num;

        while(i <= j) {
            int mid = i + (j - i) / 2;
            long sq = (long) mid * mid;

            if(sq == num) {
                return true;
            }
            else if(sq < num) {
                i = mid + 1;
            }
            else {
                j = mid - 1;
            }
        }
        return false;
    }
}
