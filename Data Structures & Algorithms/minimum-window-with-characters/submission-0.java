class Solution {

/*
1. Frequency map for t
2. Required = map.size()
3. Intialize start, left,right,minLen,formedWindowchar and window map
4. Iterate s: right ->length
5. Put in window: & check win.get(c) == map.get(c) -> formedWindowchar++
6. if formedwindowchar = required: update min length
6. Form minLength / start =left
7.SHRINK : while(left<right && formed == required)-> c = s.charAt(left)-> remove form window -> check if window.get(c) < map.get(c) -> formed--
8. left++


*/
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i< t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1);
        }

        int left =0;
        int required = map.size();
        int formedChar = 0;
        Map<Character,Integer> window = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int start =0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            window.put(c, window.getOrDefault(c,0)+1);
            //check if this char is preent in map then check same frequency 
            if(map.containsKey(c) && window.get(c) == map.get(c))
            formedChar++;

           while( left <= i && formedChar == required){
            
            if(minLength > (i - left)+1){
                minLength = i - left+1;
                start = left;
            }

            //shrink
            char leftc = s.charAt(left);
            // reduced this char count in window(window will always have this as we travered first)
            window.put(leftc, window.get(leftc)-1);
            // imp to check in map if this leftC is present in map then 
            if(map.containsKey(leftc) && window.get(leftc) < map.get(leftc)){
                formedChar--;
            }
                left++;
           }

        }
        System.out.print(start +","+minLength);
      return minLength == Integer.MAX_VALUE ? "" : s.substring(start,start+minLength);
    }
}
