import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;

public class EncryptionKey extends App {
    static String s  = "1Hbfh667adfDEJ78";
   
    private static final String ALGORITHM = "AES";
    private static final String KEY = s;

    private Key encryptedKey;

    public EncryptionKey() throws Exception {
        Key key = new SecretKeySpec(KEY.getBytes("UTF-8"), ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedByteValue = cipher.doFinal(KEY.getBytes("UTF-8"));
        this.encryptedKey = new SecretKeySpec(Base64.encodeBase64(encryptedByteValue), ALGORITHM);
    }

    public Key getEncryptedKey() {
        return this.encryptedKey;
    }
}