package NumberBaseConverter;

import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.*;

public class DecimalToHexTest {

    @Test
    public void convertDecimalToHex() {
        DecimalToHex decimalToHex = new DecimalToHex(15);
        decimalToHex.convertDecimalToHex();
        assertEquals("F", decimalToHex.getHexOutput());
    }

    @Test
        public void getHexOutput() throws NoSuchFieldException, IllegalAccessException {
            //given
            final DecimalToHex testDecimalToHex = new DecimalToHex(15);
            final Field field = testDecimalToHex.getClass().getDeclaredField("hexOutput");
            field.setAccessible(true);
            field.set(testDecimalToHex, "F");

            //when
            final String result = testDecimalToHex.getHexOutput();

            //then
            assertEquals("field wasn't retrieved properly", result, "F");
        }



    @Test
    public void getInput() throws NoSuchFieldException, IllegalAccessException {

        final DecimalToHex testDecimalToHex = new DecimalToHex(15);
        final Field field = testDecimalToHex.getClass().getDeclaredField("input");
        field.setAccessible(true);
        field.set(testDecimalToHex, 15);


        final int result = testDecimalToHex.getInput();


        assertEquals("field wasn't retrieved properly", result, 15);
    }


    @Test
    public void setInputForDecimalToHex() throws NoSuchFieldException, IllegalAccessException {
        //given
        final DecimalToHex decimalToHex = new DecimalToHex(0);

        //when
        decimalToHex.setInput(10);

        //then
        final Field field = decimalToHex.getClass().getDeclaredField("input");
        field.setAccessible(true);
        assertEquals("Fields didn't match", field.get(decimalToHex), 10);
    }

}