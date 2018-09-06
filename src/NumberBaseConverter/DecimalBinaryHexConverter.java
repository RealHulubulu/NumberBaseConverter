package NumberBaseConverter;
import java.util.ArrayList;
import java.util.*;

public class DecimalBinaryHexConverter {

    private int input;

    public DecimalBinaryHexConverter(int input){
        this.input = input;

    }

    //decimal to binary converter
    public int decimalToBinary(){
        return input%2;
    }

    //decimal to hex converter
    public String decimalToHex(){

        ArrayList<Integer> list = new ArrayList<>();
        String dummyHex = "";
        int dummyInput = input;
        while (dummyInput > 0) {
            int remainderInHex = dummyInput % 16;
            list.add(remainderInHex);
            dummyInput = dummyInput / 16;
        }
        int listLength = list.size();
        int counter = 0;
        while (counter < list.size()){
            if (list.get(listLength -1) > 9) {
                switch (list.get(listLength -1)){
                    case 10: dummyHex += "A";
                        break;
                    case 11: dummyHex += "B";
                        break;
                    case 12: dummyHex += "C";
                        break;
                    case 13: dummyHex += "D";
                        break;
                    case 14: dummyHex += "E";
                        break;
                    case 15: dummyHex += "F";
                        break;
                }
            }else{
                dummyHex += list.get(listLength -1);
            }
            counter++;
            listLength--;
        }
        return dummyHex;
    }

    //binary to decimal converter
    public int binaryToDecimal(){

        ArrayList<Integer> list = new ArrayList<>();
        int dummyDecimal = 0;
        int dummyInput = input;
        while (dummyInput > 0) {
            int rightDigit = dummyInput % 10;
            list.add(rightDigit);
            dummyInput = dummyInput / 10;
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
