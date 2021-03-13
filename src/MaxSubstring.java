public class MaxSubstring {
    private static int getMaxStringLength(String string) {
        if (string.length() == 0) {
            return 0;
        }

        int currentSubstringLength = 0;
        int maxSubstringLength = 0;
        char memoryChar = Character.toLowerCase(string.charAt(0));

        for (int i = 0; i < string.length(); i++) {
            char currentChar = Character.toLowerCase(string.charAt(i));

            if (memoryChar == currentChar) {
                currentSubstringLength++;

                if (maxSubstringLength < currentSubstringLength) {
                    maxSubstringLength = currentSubstringLength;
                }
            } else {
                memoryChar = currentChar;
                currentSubstringLength = 1;
            }
        }

        return maxSubstringLength;
    }

    public static void main(String[] args) {
        String s = "аааббдеггГгв";

        System.out.println(getMaxStringLength(s));
    }
}
