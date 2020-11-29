package Part_1;

public class Solution {

    /**
     * Determines if String str2 is a suffix of String str1.
     * Returns false if one of them is null.
     * @param str1 given string
     * @param str2 possible suffix
     * @return if str2 is a suffix of str1
     */
    public boolean solution(String str1, String str2) {
        if (str1 == null || str2 == null) return false;

        return str1.endsWith(str2);
    }

    public boolean solution2(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        if (str2.length() > str1.length()) return false;

        int startIdx = str1.length() - str2.length();
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) != str1.charAt(startIdx + i)) return false;
        }

        return true;
    }
}
