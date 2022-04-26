import java.io.Console;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] cipherAlphabet = {'d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'a', 'b', 'c' };
        System.out.println("the cipher");
        int i = 0;
        while (i <= alphabets.length - 1) {
            System.out.println("Normal:" + alphabets[i] + "   " + "Caesar:" + cipherAlphabet[i]);
            i++;
        }
        Console myTerminalInput = System.console();
        String one = myTerminalInput.readLine();
        char[] enteredString = new char[one.length()];

        for (int j = 0; j <= one.length() - 1; j++) {

            enteredString[j] = one.charAt(j);
        }
        ;
        int k = 0;
        for (char singleElement : enteredString) {
            for (char alphabet : alphabets) {
                if(' ' == singleElement){

                    enteredString[k] = ' ';
                    k++;
                 break;
                }
                if (alphabet == singleElement) {
                    int indexInList = new String(alphabets).indexOf(alphabet);
                    singleElement = cipherAlphabet[indexInList];
                    enteredString[k] = singleElement;
                    k++;
                    break;
                }
            }
        }
        System.out.println(enteredString);

    }
}

