import java.util.*;
public class HashingExample {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string:\n");
            String input = scanner.nextLine();
            scanner.close();

            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            System.out.println("The MD5 hash of the input string is: " + hexString.toString());

            System.out.println("The available algorithms are:");
            Set<String> algorithms = Security.getAlgorithms("MessageDigest");
            System.out.println(algorithms);

        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: Algorithm not found");
        }
    }
}
