
public class IntegerToRoman {
    public static void main(String[] args) {
        int num = 3749;

        String k = intToRoman(num);
        System.out.println(k);
    }

    public static String intToRoman(int num) {
        StringBuilder output = new StringBuilder();
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] integers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < symbols.length; i++) {
            while (num - integers[i] >= 0) {
                output.append(symbols[i]);
                num -= integers[i];
            }
        }
        return output.toString();
    }

}
