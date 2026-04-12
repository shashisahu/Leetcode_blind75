class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen =0;

        for(int right =0 ; right< s.length(); right++){
            Character c = s.charAt(right);
            if(map.containsKey(c)){
                //duplicate -> dont shirk 1 by 1 jump directly to lastseen [a b c b]
                int lastseenIndex = map.get(c);
                left = Math.max(left, lastseenIndex +1);
            }
            map.put(c,right);

            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
