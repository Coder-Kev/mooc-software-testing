package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest2 {


    @Test
    public void invalidLetters() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("ILU");
        Assertions.assertEquals(49, result);
    }

}
