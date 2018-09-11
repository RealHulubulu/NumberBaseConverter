package NumberBaseConverter;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class BinaryToDecimalTest {

    @Test
    public void convertBinaryToDecimal() {
        BinaryToDecimal binaryToDecimal = new BinaryToDecimal(1111);
        binaryToDecimal.convertBinaryToDecimal();
        assertEquals(15, binaryToDecimal.getDecimalOutput());
    }

    @Test
    public void getDecimalOutput() throws NoSuchFieldException, IllegalAccessException {
        //given
        final BinaryToDecimal testBinaryToDecimal = new BinaryToDecimal(1111);
        final Field field = testBinaryToDecimal.getClass().getDeclaredField("decimalOutput");
        field.setAccessible(true);
        field.set(testBinaryToDecimal, 15);

        //when
        final int result = testBinaryToDecimal.getDecimalOutput();

        //then
        assertEquals("field wasn't retrieved properly", result, 15);
    }

    @Test
    public void getInputForBinaryToDecimal() throws NoSuchFieldException, IllegalAccessException {

        final BinaryToDecimal testBinaryToDecimal = new BinaryToDecimal(1111);
        final Field field = testBinaryToDecimal.getClass().getDeclaredField("input");
        field.setAccessible(true);
        field.set(testBinaryToDecimal, 1111);


        final int result = testBinaryToDecimal.getInput();


        assertEquals("field wasn't retrieved properly", result, 1111);
    }

    @Test
    public void setInputForBinaryToDecimal() throws NoSuchFieldException, IllegalAccessException {
        //given
        final BinaryToDecimal testBinaryToDecimal = new BinaryToDecimal(0);

        //when
        testBinaryToDecimal.setInput(10);

        //then
        final Field field = testBinaryToDecimal.getClass().getDeclaredField("input");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(testBinaryToDecimal), 10);
    }

}