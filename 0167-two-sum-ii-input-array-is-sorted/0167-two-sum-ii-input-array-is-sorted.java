class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int[] res = new int[2];
    
       
        while(start<=end)
        {
                if(numbers[start]+numbers[end]==target)
                {
                    break;
                }
            if(numbers[start]+numbers[end]>target)
            {
                end--;
            }
            else
            {
                start++;
            }
        }
        return new int[]{start+1,end+1};
           
    }
}