package jasypt.test;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.PasswordEncryptor;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;
import org.jasypt.util.text.TextEncryptor;

/**
 * @author JCooky
 * @since 2015-07-08
 */
public class Main {
  public static void main(String[] args) {
    PasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
    String encryptedPassword = passwordEncryptor.encryptPassword(args[0]);

    BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
    textEncryptor.setPassword(encryptedPassword);
    String myEncryptedText = textEncryptor.encrypt(args[1]);

    System.out.println(myEncryptedText);
  }
}
