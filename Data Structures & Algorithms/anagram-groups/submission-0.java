class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (int i=0;i<strs.length;i++){
            char[] chars = strs[i].toCharArray();

            Arrays.sort(chars);

            String sorted = new String(chars);
            
            if (!anagramMap.containsKey(sorted)) {
                List<String> anaList = new ArrayList<>();
                anaList.add(strs[i]);
                anagramMap.put(sorted, anaList);
            } else {
                anagramMap.get(sorted).add(strs[i]);
            }
        }

        List<List<String>> answer = new ArrayList<>();

        for (Map.Entry<String, List<String>> entry : anagramMap.entrySet()) {
            answer.add(entry.getValue());
        }
        return answer;
    }
}
