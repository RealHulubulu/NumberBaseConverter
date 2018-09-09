package NumberBaseConverter;

public class DecimalToBinary {

    private int input;
    private int binaryOutput;

    public DecimalToBinary(int input){
        this.input = input;
    }

    public void decimalToBinary(){
        binaryOutput = input%2;
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
