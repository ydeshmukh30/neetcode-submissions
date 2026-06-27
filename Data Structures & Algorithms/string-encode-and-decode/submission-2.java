class Solution {

    public String encode(List<String> strs) {
        String ans = "*";
        for(int i=0;i<strs.size();i++) {
            ans = ans + strs.get(i).length() + "*" + strs.get(i) + "*";
        }
        System.out.println(ans);
        return ans;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            if (str.charAt(i) == '*') {
                i++;
                continue;
            }
            // 1. Find the next '#' delimiter to isolate the length string
            int delimiterPos = str.indexOf('*', i);
            
            System.out.println(delimiterPos);
            System.out.println(i);
            System.out.println(str.substring(i, delimiterPos));
            // 2. Parse the length of the original string
            int length = Integer.parseInt(str.substring(i, delimiterPos));
            
            // 3. Move the pointer right past the '#' delimiter
            i = delimiterPos + 1;
            
            // 4. Extract the actual string using the known length
            String originalStr = str.substring(i, i + length);
            ans.add(originalStr);
            
            // 5. Jump the pointer right past the extracted string
            i += length;
        }
        return ans;
    }
}
