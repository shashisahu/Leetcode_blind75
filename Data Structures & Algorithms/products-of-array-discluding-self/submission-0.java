class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];
         int product = 1;
        for(int i=0;i<n;i++){
            product = product * nums[i];
            prefix[i] = product;
        }
          int postProd =1;
        for(int j=n-1; j>=0; j--){
            postProd = postProd * nums[j];
            postfix[j] = postProd;
        }

        int res[] = new int[n];
        
        for(int k =0; k<n; k++){  
            int pre = (k==0) ? 1 : prefix[k-1];
            int pos = (k==n-1) ? 1 : postfix[k+1];
            res[k] = pre * pos;
           
        }
      return res;  
    }
}  
