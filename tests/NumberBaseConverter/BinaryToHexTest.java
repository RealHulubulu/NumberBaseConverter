package NumberBaseConverter;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryToHexTest {

    @Test
    public void convertBinaryToHex() {
        BinaryToHex testBinaryToHex = new BinaryToHex(1111);
        testBinaryToHex.convertBinaryToHex();
        assertEquals("F", testBinaryToHex.getInput());
    }

    //@Test
    //public void getHexOutput() {
    //}

    //@Test
    //public void getInput() {
    //}

    //@Test
    //public void setInput() {
    //}
}