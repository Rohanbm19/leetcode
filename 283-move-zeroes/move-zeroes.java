class Solution {
    public void moveZeroes(int[] nums) {
        int i, pos=0;
        for(i=0;i<nums.length;i++)
        {
        if(nums[i]!=0)
        {
            nums[pos]=nums[i];
          pos++;
        }
        
        }
while(pos<nums.length)
{
    nums[pos]=0;
    pos++;
}


    }
}