import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        //User inputs the text to encrypt/decrypt
        System.out.println("Enter text to encrypt/decrypt");
        String text = scanner.nextLine();

        //User inputs the key which shifts the characters
        System.out.println("Enter number that the plain text shall be shifted");
        int shiftNumber = Integer.parseInt(scanner.nextLine());

        //User inputs wether he wants to encrypt or decrypt
        System.out.println("Enter 0 for ENCRYPT or 1 for DECRYPT");
        int methodSwitch = Integer.parseInt(scanner.nextLine());
        Method method = methodSwitch == 0 ? Method.ENCRYPT : Method.DECRYPT;

        //call the class which performs the encryption/decryption
        Caesar caesar = new Caesar(text, shiftNumber, method);
    }
}