import java.io.Console;
import java.util.Locale;
import java.util.Scanner;
public class Encrypt {
    static int shiftKey;

    public static String main() {
        Scanner myTerminalInput = new Scanner(System.in);

        System.out.println("Enter the key shift you want to use:");
        shiftKey = Integer.parseInt(myTerminalInput.nextLine());
        if (shiftKey > 25) {
            System.out.println("Invalid key shift");
            shiftKey = Integer.parseInt(myTerminalInput.nextLine());
        }
//subtract fron 26 in order to get shift from the right
        shiftKey = 26 - shiftKey;
        System.out.println("=======================================================================================================");
        System.out.println("Enter the string you want to encrypt:");
        String inputString = myTerminalInput.nextLine();
        inputString = inputString.toLowerCase();
        encrypter(inputString, shiftKey);
        return inputString;
    }

    public static String encrypter(String inputString, int shiftKey) {
        String originalString = inputString.toUpperCase();
        char[] enteredString = new char[inputString.length()];
        for (int j = 0; j <= inputString.length() - 1; j++) {
            enteredString[j] = inputString.charAt(j);
        };
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
                    singleElement = App.alphabets[Math.abs((indexInList + shiftKey) % 26)];
                    enteredString[k] = singleElement;
                    k++;
                    break;
                }
            }
        }
        String finalString = new String(enteredString);
        System.out.println("=======================================================================================================");
        System.out.println("Your original message: " + originalString);
        System.out.println("Your encrypted message: " + finalString.toUpperCase());
        System.out.println("=======================================================================================================");
        return finalString.toUpperCase();
    }
}




