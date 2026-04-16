class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        Stack<Character> st = new Stack<>();

        for(int i=0; i< s.length();i++){
            if(map.containsKey(s.charAt(i)))
            st.push(map.get(s.charAt(i)));
            else{
                if(st.isEmpty() || st.pop() != s.charAt(i))
                return false;
            }
        }
        return st.isEmpty();
    }
}
