package String_3;

/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not
an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */

class CountYZ {
    static int countYZ(String str) {
        String[] arr = str.replaceAll("[^a-zA-Z]+", " ").split(" ");

        int count = 0;
        for (String s : arr) {
            if (s.toLowerCase().endsWith("z") || s.toLowerCase().endsWith("y")) {
                ++count;
            }
        }

        return count;
    }
}
