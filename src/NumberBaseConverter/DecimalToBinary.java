package NumberBaseConverter;

import java.util.ArrayList;

public class DecimalToBinary {

    private int input;
    private int binaryOutput;

    public DecimalToBinary(int input){
        this.input = input;
    }

    public void decimalToBinary(){

        ArrayList<Integer> list = new ArrayList<>();
        int dummyBinary = 0;
        int dummyInput = input;
        while (dummyInput > 0) {
            int remainderInBinary = dummyInput % 2;
            list.add(remainderInBinary);
            dummyInput = dummyInput / 2;
        }
        int listLength = list.size();
        int counter = 0;
        dummyBinary = 0;
        while (counter < list.size()){
            dummyBinary += list.get(counter) * (int)Math.pow(10, counter);
            counter++;
        }

        binaryOutput = dummyBinary;

    }


    public int getBinaryOutput(){
        return binaryOutput;
    }

    public int getInput(){
        return  input;
    }

    public void setInput(int input){
        this.input = input;
    }

}
