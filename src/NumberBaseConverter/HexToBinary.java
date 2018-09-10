package NumberBaseConverter;

public class HexToBinary {

    private String input;
    private int binaryOutput;

    public HexToBinary(String input){
        this.input = input;
    }

    public void convertHexToBinary() {
        HexToDecimal hexToDecimal = new HexToDecimal(input);
        hexToDecimal.convertHexToDecimal();
        DecimalToBinary decimalToBinary = new DecimalToBinary(hexToDecimal.getDecimalOutput());
        decimalToBinary.convertDecimalToBinary();
        binaryOutput = decimalToBinary.getBinaryOutput();
    }

    public int getBinaryOutput(){
        return binaryOutput;
    }

    public String getInput(){
        return  input;
    }

    public void setInput(String input){
        this.input = input;
    }

}
