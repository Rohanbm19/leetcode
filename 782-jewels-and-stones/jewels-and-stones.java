class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int[] arr =new int[128];
        for(int i=0;i<jewels.length();i++ ){
            arr[jewels.charAt(i)]=1;
        }
        for (int i = 0; i < stones.length(); i++) {
    if (arr[stones.charAt(i)] == 1) {
        count++;
    }
}
return count;
    }
}