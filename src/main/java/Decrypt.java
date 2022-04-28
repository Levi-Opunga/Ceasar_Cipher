import java.io.Console;
import java.util.Scanner;
public class Decrypt {
    public static void main() {
        Scanner myTerminalInput = new Scanner(System.in);
        System.out.println("Enter the key shift you want to use to decrypt:");
        int shiftKey = Integer.parseInt(myTerminalInput.nextLine());
        if (shiftKey > 25) {
            System.out.println("Invalid key shift");
            shiftKey = Integer.parseInt(myTerminalInput.nextLine());
        }
//subract to get shift from the right
        shiftKey = 26 - shiftKey;
        System.out.println("=======================================================================================================");

        System.out.println("Enter the string you want to decrypt:");

        String inputString = myTerminalInput.nextLine();
        inputString = inputString.toLowerCase();
        decrypter(inputString, shiftKey);
    }

    public static String decrypter(String inputString, int shiftKey) {
        String originalString = inputString.toUpperCase();
        char[] enteredString = new char[inputString.length()];

        for (int j = 0; j <= inputString.length() - 1; j++) {

            enteredString[j] = inputString.charAt(j);
        }
        ;
        int k = 0;
        for (char singleElement : enteredString) {
            for (char alphabet : App.alphabets) {
                if (' ' == singleElement) {

                    enteredString[k] = ' ';
                    k++;
                    break;
                }
                if (alphabet == singleElement) {
                    int indexInList = new String(App.alphabets).indexOf(alphabet);
                    int value = ((indexInList - shiftKey)) % 26;
                    if (value < 0) {
                        singleElement = App.alphabets[App.alphabets.length + value];
                    } else {
                        singleElement = App.alphabets[value];
                    }
                    enteredString[k] = singleElement;
                    k++;
                    break;
                }
            }
        }
        String finalString = new String(enteredString);
        System.out.println("=======================================================================================================");
        System.out.println("The Encrypted message was: " + originalString);
        System.out.println("Your Decrypted message: " + finalString.toUpperCase());
        System.out.println("=======================================================================================================");
        return finalString.toUpperCase();
    }
}






