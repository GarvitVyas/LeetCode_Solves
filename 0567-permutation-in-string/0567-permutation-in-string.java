class Solution {
    public boolean checkInclusion(String s1, String s2) {
         int[] arr = new int[26];
    for (char c: s1.toCharArray()) arr[c-'a']++;
    int left = 0, right = 0;
    while(right < s2.length()) {
        char c = s2.charAt(right++);
        arr[c-'a']--;
        while(arr[c-'a'] < 0) {
            char c2 = s2.charAt(left++);
            arr[c2-'a']++;
        }
        if (right-left == s1.length()) return true;
    }
    return false;
    }
}