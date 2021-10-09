package ru.dataart.academy.java;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 5 (mdncb)
     * amam -> 2 (am)
     */

    public static int getLengthOfLongestSubstring(String checkString) {
        //Task implementation
        int max = 0;
        String substr = "";
        if(checkString.length()==1) {
            return 1;
        }
        for(int j=0;j<checkString.length();j++) {
            for (int i = j; i < checkString.length(); i++) {
                if (substr.contains(checkString.substring(i, i + 1))) {
                    if (max < substr.length())
                        max = substr.length();
                    substr = "";
                } else {
                    substr += checkString.substring(i, i + 1);
                    System.out.println(substr);
                }
            }
        }
        return max;
    }
}
