class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
        int[] ascii = new int[127];
        Arrays.fill(ascii,0);
        for(int i=0; i<s.length(); i++){
            ascii[s.charAt(i)]=ascii[s.charAt(i)]+1;
        }
        for(int j=0; j<t.length(); j++){
            if(ascii[t.charAt(j)]==0)
            return false;
            else{
                ascii[t.charAt(j)]=ascii[t.charAt(j)]-1;
            }
        }
     return true;

    }
}
