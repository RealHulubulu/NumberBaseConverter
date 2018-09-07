package NumberBaseConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Testing Inputs");

        DecimalBinaryHexConverter decimalBinaryHexConverter = new DecimalBinaryHexConverter(11);
        System.out.println();
        decimalBinaryHexConverter.binaryToDecimal();
        System.out.println(decimalBinaryHexConverter.getDecimalOutput());
        decimalBinaryHexConverter.decimalToBinary();
        System.out.println(decimalBinaryHexConverter.getBinaryOutput());
        decimalBinaryHexConverter.decimalToHex();
        System.out.println(decimalBinaryHexConverter.getHexOutput());


    }
    }
