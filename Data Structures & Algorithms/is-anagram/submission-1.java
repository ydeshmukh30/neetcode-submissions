class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new TreeMap<>();
        Map<Character, Integer> tMap = new TreeMap<>();

        for (int i=0;i<s.length();i++) {
            Character c = s.charAt(i);

            if(sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c,1);
            }
        }

        for (int i=0;i<t.length();i++) {
            Character c = t.charAt(i);

            if(tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : sMap.entrySet()) {
            if(!tMap.containsKey(entry.getKey()) || 
                !tMap.get(entry.getKey()).equals(entry.getValue())){
                 return false;   
            }
        }


        for (Map.Entry<Character, Integer> entry : tMap.entrySet()) {
            if(!sMap.containsKey(entry.getKey()) || 
                !sMap.get(entry.getKey()).equals(entry.getValue())){
                 return false;   
            }
        }
        return true;
    }
}
