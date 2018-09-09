package NumberBaseConverter;

import java.util.ArrayList;

public class DecimalToHex {

    private int input; // will need to change data type
    private String hexOutput;

    public DecimalToHex(int input){ // will need to change input data type to general type or String b/c hex input
        this.input = input;

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

    public int getInput(){
        return  input;
    }

    public void setInput(int input){
        this.input = input;
    }

}
