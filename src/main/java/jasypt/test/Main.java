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
    String r = null;
    if ("strong".equals(args[0])) {
      r = encryptStrong(args[1], args[2]);
    } else {
      r = encryptBasic(args[1], args[2]);
    }

    System.out.println(r);
  }

  private static String encryptStrong(String password, String text) {
    PasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
    String encryptedPassword = passwordEncryptor.encryptPassword(password);

    StrongTextEncryptor textEncryptor = new StrongTextEncryptor();
    textEncryptor.setPassword(encryptedPassword);
    String myEncryptedText = textEncryptor.encrypt(text);

    return myEncryptedText;
  }

  private static String encryptBasic(String password, String text) {
    PasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
    String encryptedPassword = passwordEncryptor.encryptPassword(password);

    BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
    textEncryptor.setPassword(encryptedPassword);
    String myEncryptedText = textEncryptor.encrypt(text);

    return myEncryptedText;
  }
}
