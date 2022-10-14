class Solution {
    public String reverseWords(String s) {
         char[] result = s.toCharArray();
        int i=0;
        int j;
        
        for(j=0;j<result.length;j++)
        {
            if(result[j]==' ')
            {
                reverseme(result,i,j-1);
                i = j+1;
            }
        }
        reverseme(result,i,result.length-1);
        return new String(result);
    }
    
    public void reverseme(char[] s, int i,int j)
    {
        while(i<=j)
        {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}