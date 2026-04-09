class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int res[] = new int[k];
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> bucket[] =  new ArrayList[nums.length + 1];
        for(int j : map.keySet()){
            int val = map.get(j);
            if(bucket[val]==null){
                bucket[val] = new ArrayList<>();
            }
            bucket[val].add(j);
        }

        List<Integer> result = new ArrayList<>();
       for(int l=nums.length ; l>=0 && result.size()<k; l--){
        if(bucket[l]!=null)
        result.addAll(bucket[l]);
       }

       return result.stream().mapToInt(i->i).toArray();
    }
}
