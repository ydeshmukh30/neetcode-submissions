class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i=0;i<nums.length;i++) {
            set.add(nums[i]);
        }

        for (int i=0;i<nums.length;i++) {
            int curr = nums[i];
            int seq = 0;
            while (set.contains(curr)) {
                curr++;
                seq++;
            }
            res = Math.max(res,seq);
        }

        return res;
    }
}
