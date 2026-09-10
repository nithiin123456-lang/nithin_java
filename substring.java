class Solution {
    public int lengthOfLongestSubstring(String s) {

        String str = "";
        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (str.contains("" + ch)) {
                str = str.substring(str.indexOf(ch) + 1);
            }

            str = str + ch;

            if (str.length() > max) {
                max = str.length();
            }
        }

        return max;
    }
}
