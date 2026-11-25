class Solution {
    public boolean checkString(String s) {
        boolean flag=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                flag= true;
            }else if(flag){
                return false;
            }
        }
        return true;
    }
}
//2124. Check if All A's Appears Before All B's

//more optimal and easy:

class Solution {
    public boolean checkString(String s) {
        return !s.contains("ba");
    }
}