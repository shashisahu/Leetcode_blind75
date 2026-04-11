class Solution {
    public int maxArea(int[] h) {
        int left = 0;
        int right = h.length -1;
        int max_water = 0;
        while(left<right){
            int water = Math.min(h[left], h[right]) * (right - left);
            max_water = Math.max(max_water, water);

            if(h[left] == h[right]){
                left++;right--;
            }else if(h[left] < h[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_water;
    }
}
