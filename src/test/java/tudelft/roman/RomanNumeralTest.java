package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class RomanNumeralTest {

   // private RomanNumeral roman;
    //@BeforeEach
    //public void initialize() {
      //  this.roman = new RomanNumeral();
    //}

    @Test
    public void singleNumber() {
        RomanNumeral roman = new RomanNumeral();
        int result =  roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
       RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("V");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        RomanNumeral roman = new RomanNumeral();
        int result = roman.convert("XLIV");
        Assertions.assertEquals(44, result);
    }
}
