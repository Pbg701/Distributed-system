import java.util.Scanner;

public class tokenRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes you want in the ring:");
        int n = sc.nextInt(); // Number of nodes in the ring
        System.out.println("Ring Formed is as below: ");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
        int choice = 0;
        do {
            System.out.println("Enter Sender:");
            int sender = sc.nextInt(); // Sender node
            System.out.println("Enter Receiver:");
            int receiver = sc.nextInt(); // Receiver node
            System.out.println("Enter Data to send:");
            String data = sc.next(); // Data to be sent
            int token = 0;
            System.out.println("Token Passing:");
            for (int i = token; (i % n) != sender; i = (i + 1) % n) {
                System.out.print(i + " -> ");
            }
            System.out.println(" " + sender); // Token passed to sender
            System.out.println("Sender " + sender + " sending data: " + data); // Sender sending data
            for (int i = (sender + 1) % n; i != receiver; i = (i + 1) % n) {
                System.out.println("Data forwarded by " + i); // Data forwarded by intermediate nodes
            }
            System.out.println("Receiver " + receiver + " received data: " + data); // Receiver receiving data
            token = sender; // Update token position
            System.out.println("Token is now at node: " + token); // Token position updated
            System.out.println("Do you want to continue? Press 1 for Yes and 0 for No:");
            choice = sc.nextInt(); // User choice to continue or exit
        } while (choice == 1);
        System.out.println("Exiting the program."); // Exit message

    }
}
