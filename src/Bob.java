import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversation = true;
        while (continueConversation) {
            System.out.println("Enter your message to Bob:");
            String message = scanner.nextLine();
            if (message.endsWith("?")) {
                System.out.println("Sure.");
            } else if (message.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (message.trim().isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Do you want to continue? (y/n)");
            String continueOption = scanner.nextLine();
            if (continueOption.equalsIgnoreCase("n")) {
                continueConversation = false;
            }
        }
    }
}
