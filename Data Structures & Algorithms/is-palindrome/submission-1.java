class Solution {
    public boolean isPalindrome(String st) {
        String s = st.replaceAll("[^a-zA-Z0-9]",""); // ^ -> not these chars
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
