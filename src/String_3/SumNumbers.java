package String_3;

/*
Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row.
(Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
 */

class SumNumbers {
    static int sumNumbers(String str) {
        int sum = 0;
        String[] arr = str.split("[^0-9]+");
        for(String s : arr) {
            if(s.length() > 0)
                sum += Integer.parseInt(s);
        }

        return sum;
    }
}
