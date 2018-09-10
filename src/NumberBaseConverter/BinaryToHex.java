package NumberBaseConverter;

import java.util.ArrayList;

public class BinaryToHex {

    private int input;
    private String hexOutput;

    public BinaryToHex(int input){
        this.input = input;
    }

    public void convertBinaryToHex(){ // need to finish this method

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
            binaryToDecimal.convertBinaryToDecimal();
            arrayInput = binaryToDecimal.getDecimalOutput();
            DecimalToHex decimalToHex = new DecimalToHex(arrayInput);
            decimalToHex.convertDecimalToHex();

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

}
