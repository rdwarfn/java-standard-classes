package programmer.zaman.now.classes;

import java.util.Base64;

public class Base54App {
    public static void main(String[] args) {
        String original = "Ridwan Arifin";

        String encoded = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println(encoded);

        byte[] bytes = Base64.getDecoder().decode(encoded);
        String decoded = new String(bytes);
        System.out.println(decoded);
    }
}
