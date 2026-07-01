class Solution {
    public boolean isPalindrome(String s) {
        String str = "";

        for (int i=0;i<s.length();i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                str = str + (s.charAt(i));
            }
        }
        str = str.toLowerCase();

        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
