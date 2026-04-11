class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();

        for(int i=0 ; i<nums.length; i++){
            set.add(nums[i]);
        }
        int res=0;
        for(int j=0 ; j<nums.length; j++){
            int curr = nums[j];
            if(!set.contains(curr-1)){
                int count = 1;
                while(set.contains(curr+1)){
                    count++;
                    curr++;
                }
                res = Math.max(res,count);
            }
            
        }

      return res;  
    }
}
