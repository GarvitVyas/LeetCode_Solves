class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*(nums.length)];
        int i;
        int k = nums.length;
        for(i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[k] = nums[i];
            k++;
        }  
 
        return ans;
    }
}