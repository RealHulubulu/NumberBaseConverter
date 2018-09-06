package NumberBaseConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Here is test input 111111");

        DecimalBinaryHexConverter decimalToBinaryToDecimal = new DecimalBinaryHexConverter(111111);
        System.out.println();
        System.out.println(decimalToBinaryToDecimal.binaryToDecimal());
        System.out.println(decimalToBinaryToDecimal.decimalToBinary());

    }
    }
