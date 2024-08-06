package org.example.model;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string1 = String.join("", word1);
        String string2 = String.join("", word2);

        return string1.equals(string2);
    }

}
