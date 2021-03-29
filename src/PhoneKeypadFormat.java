import java.util.HashMap;

public class PhoneKeypadFormat {
    public static void main(String[] args) {
        System.out.println(getFormattedString("44.33.555.555.666.0.9.666.777.555.3"));   // HELLO WORLD
        System.out.println(getFormattedString("7.777.444.66.222.33"));    // PRINCE
    }

    private static String getFormattedString(String input) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "");
        map.put(2, "ABC");
        map.put(3, "DEF");
        map.put(4, "GHI");
        map.put(5, "JKL");
        map.put(6, "MNO");
        map.put(7, "PQRS");
        map.put(8, "TUV");
        map.put(9, "WXYZ");
        map.put(0, " ");

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            int j = i;
            while (j < input.length() && input.charAt(j) == current) {
                j++;
            }
            if (map.get(Character.getNumericValue(input.charAt(i))) != null) {
                ans.append(map.get(Character.getNumericValue(input.charAt(i))).charAt(j - i - 1));
                i = j;
            }
        }
        return ans.toString();
    }
}

