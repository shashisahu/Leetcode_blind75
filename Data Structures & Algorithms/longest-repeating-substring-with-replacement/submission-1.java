class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int right =0;
        Deque<Character> dq = new ArrayDeque<>();
        Map<Character, Integer> map = new HashMap<>();
        int maxFreq=0;

        for(int i=0; i<s.length();i++){
            int freq = map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),freq+1);
            dq.addLast(s.charAt(i));
            maxFreq = Math.max(maxFreq,freq+1);

            if(dq.size()- maxFreq > k){
                char c = dq.peekFirst();
                map.put(c, map.get(c)-1);
                dq.removeFirst();
            }

        }
       return dq.size(); 
    }
}
