package NumberBaseConverter;
import java.util.ArrayList;
import java.util.*;

public class DecimalBinaryHexConverter {

    private int input; // will need to change data type
    private String hexOutput;
    private int binaryOutput;
    private int decimalOutput;

    public DecimalBinaryHexConverter(int input){ // will need to change input data type to general type or String b/c hex input
        this.input = input;

    }

    /*
    //decimal to binary converter
    public void decimalToBinary(){
        binaryOutput = input%2;
    }
    public int getBinaryOutput(){
        return binaryOutput;
    }

    //decimal to hex converter
    public void decimalToHex(){

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
        hexOutput = dummyHex;
    }

    public String getHexOutput(){
        return hexOutput;
    }
    */
/*
    //binary to decimal converter
    public void binaryToDecimal(){

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

        decimalOutput = dummyDecimal;
    }

    public int getDecimalOutput(){
        return decimalOutput;
    }

*/
/*
    public void binaryToHex(){ // need to finish this method

        ArrayList<Integer> list = new ArrayList<>();
        String dummyHex = "";
        int dummyInput = input;
        int rightMostBit = 0;
        int arrayInput = 0;
        int length = (int) (Math.log10(dummyInput) + 1); // input must be greater than 0
        while (length > 0) {
            for (int i = 0; i<4; i++) {
                rightMostBit = dummyInput % 10;
                arrayInput += rightMostBit * (int)Math.pow(10, i);
                dummyInput = dummyInput / 10;
            }

            list.add(arrayInput);
            length = (int) (Math.log10(dummyInput) + 1);
            arrayInput = 0;
        }
        int listLength = list.size();
        int counter = 0;
        while (counter < list.size()){
            arrayInput = list.get(listLength - 1);

            BinaryToDecimal binaryToDecimal = new BinaryToDecimal(arrayInput);
            binaryToDecimal.binaryToDecimal();
            arrayInput = binaryToDecimal.getDecimalOutput();
            DecimalToHex decimalToHex = new DecimalToHex(arrayInput);
            decimalToHex.decimalToHex();

            //DecimalBinaryHexConverter decimalBinaryHexConverter = new DecimalBinaryHexConverter(arrayInput);
            //decimalBinaryHexConverter.binaryToDecimal();
            //arrayInput = decimalBinaryHexConverter.getDecimalOutput();
            //decimalBinaryHexConverter.setInput(arrayInput);
            //decimalBinaryHexConverter.decimalToHex();
            dummyHex += decimalToHex.getHexOutput();
            counter++;
            listLength--;
        }
        hexOutput = dummyHex;
    }

    public String getHexOutput(){
        return hexOutput;
    }

    public int getInput(){
        return  input;
    }

    public void setInput(int input){
        this.input = input;
    }
*/

}
