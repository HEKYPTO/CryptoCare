package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashGenerator {

    public static String hash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = digest.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating hash: " + e.getMessage());
        }
    }

//    public static void main(String[] args) {
//        String input = "Hello, World!";
//        String hash = hash(input);
//        System.out.println("SHA-256 Hash: " + hash);
//    }
}
