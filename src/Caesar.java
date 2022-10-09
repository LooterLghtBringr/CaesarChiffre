public class Caesar {
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    String inputText = "";
    int shiftNumber;
    Method method;
    String outputText = "";

    public Caesar(String inputText, int shiftNumber, Method method) {
        this.inputText = inputText;
        this.shiftNumber = shiftNumber;
        this.method = method;

        if (method == method.ENCRYPT)
        {
            Encrypt();
        }
        else if(method == method.DECRYPT)
        {
            Decrypt();
        }
    }

    public void Encrypt(){
        System.out.println("Plain text to encrypt " + inputText);

        for (int i = 0; i < inputText.length(); i++){
            int indexOfNewChar = alphabet.indexOf(inputText.charAt(i)) + shiftNumber;

            //if the index overflows the length of the alphabet start from the beginning again
            if (indexOfNewChar >= alphabet.length())
                indexOfNewChar -= alphabet.length();

            //concatenate the shifted chars
            outputText += alphabet.charAt(indexOfNewChar);
        }

        System.out.println("Encrypted plain text " + outputText);
    }

    public void Decrypt(){
        System.out.println("Encrypted text " + inputText);

        for (int i = 0; i < inputText.length(); i++){
            int indexOfNewChar = alphabet.indexOf(inputText.charAt(i)) - shiftNumber;

            //if the index underflows the length of the alphabet start from the end again
            if (indexOfNewChar <= 0)
                indexOfNewChar += alphabet.length();

            //concatenate the shifted chars
            outputText += alphabet.charAt(indexOfNewChar);
        }

        System.out.println("Decrypted cipher text " + outputText);
    }
}
