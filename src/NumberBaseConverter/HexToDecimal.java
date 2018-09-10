package NumberBaseConverter;

import java.util.ArrayList;

public class HexToDecimal {

    private String input; // will need to change data type

    private int decimalOutput;

    public HexToDecimal(String input){
        this.input = input;
    }

    public void convertHexToDecimal(){
        ArrayList<Integer> list = new ArrayList<>();
        int dummyDecimal = 0;
        String dummyInput = input;
        int dummyInputLength = dummyInput.length();
        int counter = 0;
        while (counter < dummyInput.length()) {
            char leftMost = dummyInput.charAt(dummyInputLength - 1);
            switch(leftMost){
                case 'A':   dummyDecimal = 10;
                    break;
                case 'B':   dummyDecimal = 11;
                    break;
                case 'C':   dummyDecimal = 12;
                    break;
                case 'D':   dummyDecimal = 13;
                    break;
                case 'E':   dummyDecimal = 14;
                    break;
                case 'F':   dummyDecimal = 15;
                    break;
                default:    dummyDecimal = Character.getNumericValue(leftMost);
                    break;
            }
            list.add(dummyDecimal);
            counter++;
            dummyInputLength--;
        }
        int listLength = list.size();
        counter = 0;
        dummyDecimal = 0;
        int powerOf16 = 0;
        while (counter < listLength){
            powerOf16 = (int) Math.pow(16, counter);
            dummyDecimal += list.get(counter) * powerOf16;
            counter++;
        }

        decimalOutput = dummyDecimal;
    }

    public int getDecimalOutput(){
        return decimalOutput;
    }

    public String getInput(){
        return  input;
    }

    public void setInput(String input){
        this.input = input;
    }

}
