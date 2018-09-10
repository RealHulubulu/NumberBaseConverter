package NumberBaseConverter;

import java.util.ArrayList;

public class BinaryToDecimal {

    private int input; // will need to change data type

    private int decimalOutput;

    public BinaryToDecimal(int input){ // will need to change input data type to general type or String b/c hex input
        this.input = input;
    }

    //binary to decimal converter
    public void convertBinaryToDecimal(){

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

    public int getInput(){
        return  input;
    }

    public void setInput(int input){
        this.input = input;
    }

}
