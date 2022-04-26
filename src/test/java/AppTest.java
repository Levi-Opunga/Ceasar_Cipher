import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void encrypt_returnencrypted_string(){
        Encrypt samleEncryption  = new Encrypt();
        String expected = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        assertEquals(expected,samleEncryption.encrypter("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG".toLowerCase(), 23));
    }
    @Test
    public void decrypt_returnencrypted_string(){
        Decrypt samleDecryption  = new Decrypt();
        String expected = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        assertEquals(expected,samleDecryption.decrypter("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD".toLowerCase(), 23));
    }

}