import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a string:");
        String str = scanner.nextLine();

        System.out.println("Please choose the following options:");
        System.out.println("1 = Encrypt the string.");
        System.out.println("2 = Decrypt the string.");

        int choice = scanner.nextInt();

        // Using switch case statements
        switch(choice) {
            case 1:
                // Encrypt the string
                String encryptedString = encryptDecrypt(str, 3);
                System.out.println("Encrypted string: " + encryptedString);
                break;

            case 2:
                // Decrypt the string
                String decryptedString = encryptDecrypt(str, -3);
                System.out.println("Decrypted string: " + decryptedString);
                break;

            default:
                System.out.println("Error: Invalid option.");
                break;
        }

        scanner.close();
    }

    // Method to encrypt or decrypt a string
    private static String encryptDecrypt(String str, int shift) {
        StringBuilder result = new StringBuilder();
       for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                result.append((char) ((c - base + shift + 26) % 26 + base));
            } else {
                result.append(c); // Non-letter characters are not changed
            }
        }
        return result.toString();
    }
}
