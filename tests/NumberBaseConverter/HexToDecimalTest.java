package NumberBaseConverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class HexToDecimalTest {

    @Test
    public void convertHexToDecimal() {

        HexToDecimal testHexToDecimal = new HexToDecimal("F");
        testHexToDecimal.convertHexToDecimal();
        assertEquals(15, testHexToDecimal.getDecimalOutput());

    }

    //@Test
    //public void getDecimalOutput() {
    //}

    //@Test
    //public void getInput() {
    //}

    //@Test
    //public void setInput() {
    //}
}