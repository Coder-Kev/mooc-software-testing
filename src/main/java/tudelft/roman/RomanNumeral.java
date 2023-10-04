package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static Map<Character, Integer> map;

    static {
        map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int convert(String s) {

        int convertedNumber = 0;
        for(int i = 0; i < s.length(); i++) {
            char romanChar = s.charAt(i);
            if (map.containsKey(romanChar)) {
                int currentNumber = map.get(romanChar);
                char nextChar = i + 1 < s.length() ? s.charAt(i + 1) : ' ';
                int nextNumber = map.getOrDefault(nextChar, 0);

                if (currentNumber >= nextNumber)
                    convertedNumber += currentNumber;
                else
                    convertedNumber -= currentNumber;
            }
        }

        return convertedNumber;

    }
}
