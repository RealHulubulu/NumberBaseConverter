package NumberBaseConverter;

import org.junit.Test;

import static org.junit.Assert.*;
import java.lang.reflect.Field;


public class DecimalToBinaryTest {

    @Test
    public void decimalToBinary() {
        DecimalToBinary decimalToBinary = new DecimalToBinary(15);
        decimalToBinary.convertDecimalToBinary();
        assertEquals(1111, decimalToBinary.getBinaryOutput());

    }

    //@Test
    //public void getBinaryOutput() {
    //}

    @Test
    public void getBinaryOutput() throws NoSuchFieldException, IllegalAccessException {
        //given
        final DecimalToBinary testDecimalToBinary = new DecimalToBinary(15);
        final Field field = testDecimalToBinary.getClass().getDeclaredField("binaryOutput");
        field.setAccessible(true);
        field.set(testDecimalToBinary, 1111);

        //when
        final int result = testDecimalToBinary.getBinaryOutput();

        //then
        assertEquals("field wasn't retrieved properly", result, 1111);
    }

    //@Test
    //public void getInput() {
    //}

    @Test
    public void getInput() throws NoSuchFieldException, IllegalAccessException {

        final DecimalToBinary testDecimalToBinary = new DecimalToBinary(15);
        final Field field = testDecimalToBinary.getClass().getDeclaredField("input");
        field.setAccessible(true);
        field.set(testDecimalToBinary, 15);


        final int result = testDecimalToBinary.getInput();


        assertEquals("field wasn't retrieved properly", result, 15);
    }







    //@Test
    //public void setInput() {
    //}

    @Test
    public void setInputForDecimalToBinary() throws NoSuchFieldException, IllegalAccessException {
        //given
        final DecimalToBinary decimalToBinary = new DecimalToBinary(1);

        //when
        decimalToBinary.setInput(10);

        //then
        final Field field = decimalToBinary.getClass().getDeclaredField("input");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(decimalToBinary), 10);
    }
}