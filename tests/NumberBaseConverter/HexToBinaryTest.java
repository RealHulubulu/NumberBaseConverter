package NumberBaseConverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class HexToBinaryTest {

    @Test
    public void convertHexToBinary() {

        HexToBinary testHexToBinary = new HexToBinary("F");
        testHexToBinary.convertHexToBinary();
        assertEquals(1111, testHexToBinary.getBinaryOutput());

    }

    //@Test
    //public void getBinaryOutput() {
    //}

    //@Test
    //public void getInput() {
    //}

    //@Test
    //public void setInput() {
    //}
}