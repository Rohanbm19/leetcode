class Solution {
    public int[] plusOne(int[] digits) {
        int i,newarray[];
        for(i=digits.length-1;i>=0;i--)
        if(digits[i]<9)
        {
            digits[i]++;
        
        return digits;
        }
        else
        {
            digits[i]=0;
        }
        newarray= new int[digits.length+1];
        newarray[0]=1;
        return newarray;
    }
}