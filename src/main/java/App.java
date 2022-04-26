import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class App {
    public static char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    public static Console myTerminalInput = System.console();
    private static boolean rerun;

    public static void main(String[] args) {

  Start();


    }
    public static void Start () {


        if (rerun) {
            System.out.println("App has been RESTARTED please select a valid option 1 or 2");
        } else {
            System.out.println("Which of the following would you like to do?");
        }

        System.out.println("=======================================================================================================");
        System.out.println("1 Encrypt message");
        System.out.println("2 Decrypt message");
        System.out.println("=======================================================================================================");

        System.out.println("Pick the option using the number");
        int selection = Integer.parseInt(myTerminalInput.readLine());
        if (selection == 1) {
            Encrypt.main();
        } else if (selection == 2) {
            Decrypt.main();
        } else { System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            System.out.println("INVALID CHOICE RERUNNING APPLICATION");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            rerun = true;


            Start();

        }
    }

}

