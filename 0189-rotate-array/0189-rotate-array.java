class Solution {
    public void roatearray(int arr[],int i,int j)
    {   
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    
    public void rotate(int[] nums, int k) {
        int start = 0;
        int end = nums.length-1;
        k = k%nums.length;
        
        roatearray(nums, nums.length-1-k+1, nums.length-1);
        roatearray(nums, 0, nums.length-1-k);
        roatearray(nums,0,nums.length-1);
    }
}
