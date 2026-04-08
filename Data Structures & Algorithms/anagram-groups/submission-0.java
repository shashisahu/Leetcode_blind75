class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(int i=0; i<strs.length; i++){
            String sortedStr = sortString(strs[i]);
            /*if(!map.containsKey(sortedStr)){
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(sortedStr,l);
            } else{
                List<String> sl =map.get(sortedStr);
                sl.add(strs[i]);
                map.put(sortedStr, sl);
            } */
            map.computeIfAbsent(sortedStr , k->new ArrayList<>()).add(strs[i]);
        }
        for(List<String> stList : map.values()){
            res.add(stList);
        }
       return res; 
    }
    
    public String sortString(String str){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
