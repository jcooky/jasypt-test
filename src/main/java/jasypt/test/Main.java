package jasypt.test;

import org.jasypt.util.password.BasicPasswordEncryptor;
import org.jasypt.util.password.PasswordEncryptor;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.jasypt.util.text.StrongTextEncryptor;

/**
 * @author JCooky
 * @since 2015-07-08
 */
public class Main {
  public static void main(String[] args) {
    BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
    String encryptedPassword = passwordEncryptor.encryptPassword(args[0]);

    BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
    textEncryptor.setPassword(encryptedPassword);
    String myEncryptedText = textEncryptor.encrypt(args[1]);

    System.out.println(myEncryptedText);
  }
}
