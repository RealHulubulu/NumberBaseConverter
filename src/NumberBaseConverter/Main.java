package NumberBaseConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Testing Inputs");

        DecimalBinaryHexConverter decimalBinaryHexConverter = new DecimalBinaryHexConverter(111);
        System.out.println();
        System.out.println(decimalBinaryHexConverter.binaryToDecimal());
        System.out.println(decimalBinaryHexConverter.decimalToBinary());
        System.out.println(decimalBinaryHexConverter.decimalToHex());


    }
    }
