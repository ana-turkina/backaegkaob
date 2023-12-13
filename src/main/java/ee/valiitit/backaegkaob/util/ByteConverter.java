package ee.valiitit.backaegkaob.util;

import java.nio.charset.StandardCharsets;

public class ByteConverter {

    public static byte[] stringToByteArray(String string) {
        if (string == null) {
            return null;
        }
        return string.getBytes(StandardCharsets.UTF_8);
    }

    public static String byteArrayToString(byte[] bytes) {
        if (bytes == null) {
            return "";
        }
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
