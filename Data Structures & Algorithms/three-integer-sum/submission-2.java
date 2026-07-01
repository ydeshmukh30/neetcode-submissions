class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0;i<nums.length-2;i++) {
            int l = i+1, r = nums.length - 1;
            while (l < r) {
                int curSum = nums[l] + nums[r];

                if (curSum + nums[i] > 0) {
                    r--;
                } else if (curSum + nums[i] < 0) {
                    l++;
                } else {
                    if (!res.contains(List.of(nums[i],nums[l],nums[r]))) {
                        res.add(List.of(nums[i],nums[l],nums[r]));
                    }
                    l++;
                }
            }
        }
        return res;
    }
}
