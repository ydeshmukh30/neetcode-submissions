class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
                for (int num : nums) {
                    m.put(num, m.containsKey(num) ? m.get(num) + 1 : 1);
                }
                int[] ans = new int[k];

                PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(k, Map.Entry.comparingByValue());
                for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                    pq.offer(entry);
                    if (pq.size() > k) {
                        pq.poll();
                    }
                }
                for (int i = k - 1; i >= 0; i--) {
                    ans[i] = Objects.requireNonNull(pq.poll()).getKey();
                }
                return ans;
    }
}
