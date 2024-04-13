package Tasks7.day7;

import java.nio.charset.StandardCharsets;

public class ByteArrayFromString {
    public static void main(String[] args) {
        // Original string
        String str = "Hello, World!";

        // Getting byte array from string
        byte[] byteArray = str.getBytes(StandardCharsets.UTF_8);

        // Displaying the byte array
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
    }
}

