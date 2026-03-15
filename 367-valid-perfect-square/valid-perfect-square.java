class Solution {
    public boolean isPerfectSquare(int num) {
     int odd=1;
     while(num>0)
     {
         num=num-odd;
        odd=odd + 2;
     }
     if(num==0)
     {
        return true;
     }
     else
     {
        return false;
     }
    
    }
}