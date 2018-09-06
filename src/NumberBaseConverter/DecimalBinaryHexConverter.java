package NumberBaseConverter;
import java.util.ArrayList;
import java.util.*;

public class DecimalBinaryHexConverter {

    private int input;

    private DecimalBinaryHexConverter(int input){
        this.input = input;
        //this.binary = binary;
    }

    public int decimalToBinary(){
        return input%2;
    }

    public int binaryToDecimal(){

        ArrayList<Integer> list = new ArrayList<>();
        int dummyDecimal = 0;

        while (input > 0) {
            int rightDigit = input % 10;
            list.add(rightDigit);
            input = input / 10;
        }
        int listLength = list.size();
        int counter = 0;
        while (listLength > 0){
            if (list.get(counter) == 1) {
                dummyDecimal += (int) Math.pow(2, counter);
            }
            counter++;
            listLength--;
        }

        return dummyDecimal;
    }


}
