package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        // checking boundary cases
        int wordLength = 0;
        if (str == null || str.length() == 0){
            return wordLength;
        }
        char[] chars = str.toCharArray();
        // also checking boundary cases
        if (chars.length == 1 && chars[0] != ' ') {
            return 1;
        }

        int leng = str.length()-1;

        while(leng != 0 && chars[leng] == ' ') {
            leng --;
        }
        while (leng >= 0 && chars[leng] != ' ') {
            leng--;
            wordLength++;
        }
        return wordLength;
    }
}
