class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int zeroIndex = 0;
        int maxProduct = 1;

        for (int i=0;i<nums.length;i++) {
            if (nums[i]==0) {
                zeroCount++;
                zeroIndex = i;
            } else {
                maxProduct *= nums[i];
            }
        }

        int[] ans = new int[nums.length];
        if (zeroCount == 1) {
            ans[zeroIndex] = maxProduct;
            return ans;
        }

        if (zeroCount >= 2) {
            return ans;
        }

        for (int i=0;i<nums.length;i++) {
            ans[i] = maxProduct / nums[i];
        }
        return ans;
    }
}  
