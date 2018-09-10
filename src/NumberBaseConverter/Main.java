package NumberBaseConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Testing Inputs");

        BinaryToHex binaryToHex = new BinaryToHex(11101); // works for first 4 digits, not next 4
        System.out.println();
        binaryToHex.convertBinaryToHex();
        System.out.println(binaryToHex.getHexOutput());

        System.out.println();
        HexToDecimal hexToDecimal = new HexToDecimal("1D");
        hexToDecimal.convertHexToDecimal();
        System.out.println(hexToDecimal.getDecimalOutput());

        System.out.println();
        DecimalToBinary decimalToBinary = new DecimalToBinary(13);
        decimalToBinary.convertDecimalToBinary();
        System.out.println(decimalToBinary.getBinaryOutput());

        System.out.println();
        HexToBinary hexToBinary = new HexToBinary("1D");
        hexToBinary.convertHexToBinary();
        System.out.println(hexToBinary.getBinaryOutput());


    }
    }
