import java.util.Scanner;

public class Confidentiality {

    // Encrypt function
    public static String encrypt(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            encrypted.append((char)(input.charAt(i) + 3));
        }
        return encrypted.toString();
    }

    // Decrypt function
    public static String decrypt(String input) {
        StringBuilder decrypted = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            decrypted.append((char)(input.charAt(i) - 3));
        }
        return decrypted.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        char ch;

        System.out.println("\t\tConfidentiality");
        do {
            System.out.println("\t\tChoose operation");
            System.out.println("\t\t1. Encryption");
            System.out.println("\t\t2. Decryption");
            System.out.println("\t\t3. Exit");
            System.out.print("\t\tChoice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("\t\tInput String: ");
                    String encryptStr = scanner.nextLine();
                    System.out.println("\t\tEncrypted String: " + encrypt(encryptStr));
                    break;
                case 2:
                    System.out.print("\t\tInput String: ");
                    String decryptStr = scanner.nextLine();
                    System.out.println("\t\tDecrypted String: " + decrypt(decryptStr));
                    break;
                case 3:
                    System.out.println("\t\tExiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\tInvalid choice.");
                    break;
            }

            System.out.print("\n\t\tDo you want to continue (Y/N): ");
            ch = scanner.nextLine().charAt(0);

        } while (ch == 'y' || ch == 'Y');

        scanner.close();
    }
}
