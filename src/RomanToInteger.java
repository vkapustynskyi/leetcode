
public class RomanToInteger {
    public static void main(String[] args) {
        String input = "MCMXCIV";

        int k = romanToInt(input);
        System.out.println(k);
    }

    private static int romanToInt(String s) {
        int output = 0;
        int lastIndex = 0;
        char[] input = s.toCharArray();
        char[] symbols = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] integers = new int[]{1, 5, 10, 50, 100, 500, 1000};
        for (int i = input.length - 1; i >= 0; i--) {
            for (int j = 0; j < symbols.length; j++) {
                if (input[i] == symbols[j]) {
                    if (j < lastIndex) {
                        output -= integers[j];
                    } else {
                        output += integers[j];
                    }
                    lastIndex = j;
                }
            }
        }
        return output;
    }
}
