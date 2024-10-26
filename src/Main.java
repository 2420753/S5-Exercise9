import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {

        String[] userArray = new String[5];

        System.out.print("Enter your first word: ");
        userArray[0] = stdin.nextLine();

        System.out.print("Enter your second word: ");
        userArray[1] = stdin.nextLine();

        System.out.print("Enter your third word: ");
        userArray[2] = stdin.nextLine();

        System.out.print("Enter your fourth word: ");
        userArray[3] = stdin.nextLine();

        System.out.print("Enter your fifth word: ");
        userArray[4] = stdin.nextLine();

        // Asks second user to enter a word to search
        System.out.print("Second players turn, Enter a word to search: ");
        String searchWord = stdin.nextLine();

        // Check's if the second user has found the word, if found it will print, otherwise it will print that the word has not been found!
        for (int i = 0; i < userArray.length; i++) {
            if (userArray[i].equals(searchWord)) {
                System.out.println("Second user has found the word: " + searchWord);
            } else {
                System.out.println("Second user has not found the word");
                break;
            }
        }
    }
}