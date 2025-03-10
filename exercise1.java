import javax.swing.*;

public class EncryptDecrypt {
    
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encryptedText.append((char) (c + 3));
        }
        return encryptedText.toString();
    }
    
    public static String decrypt(String text) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            decryptedText.append((char) (c - 3));
        }
        return decryptedText.toString();
    }
    
    public static void main(String[] args) {
        while (true) {
            String[] options = {"Encrypt", "Decrypt", "Exit"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an operation", "Confidentiality",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            
            if (choice == 2 || choice == -1) break;
            
            String input = JOptionPane.showInputDialog("Enter String:");
            if (input == null) break;
            
            String result = (choice == 0) ? encrypt(input) : decrypt(input);
            
            JOptionPane.showMessageDialog(null, "Result: " + result);
        }
    }
}
