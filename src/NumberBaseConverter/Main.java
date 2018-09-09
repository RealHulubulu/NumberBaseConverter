package NumberBaseConverter;

public class Main {

    public static void main(String[] args) {

        System.out.println("Testing Inputs");

        BinaryToHex binaryToHex = new BinaryToHex(11101); // works for first 4 digits, not next 4
        System.out.println();
        binaryToHex.binaryToHex();
        System.out.println(binaryToHex.getHexOutput());


    }
    }
