import java.util.Scanner;

public class token {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter token you want in this ring: ");
        int n = sc.nextInt();
        System.out.print("Ring formed is at below :");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        int choice = 0;
        do {
            System.out.println("Enter Sender :");
            int sender = sc.nextInt();
            System.out.println("Enter Receiver :");
            int receiver = sc.nextInt();
            System.out.println("Enter data to send :");
            int data = sc.nextInt();
            int token = 0;
            System.out.println("Token passing :");
            for (int i = token; i < sender; i++) {
                System.out.println(i + " -> ");
            }
            System.out.println("" + sender);
            System.out.println("sender" + sender + "sending data" + data);
            for (int i = sender + 1; i != receiver; i = (i + 1) % n) {
                System.out.println("data forword by " + i);
            }
            System.out.println("receiver" + receiver + "received data" + data);
            token = sender;
            System.out.println("Token is now at node" + token);
            System.out.println("Do you want to continue? Press 1 for Yes and 0 for No:");
            choice = sc.nextInt(); // User choice to continue or exit
        } while (choice == 1);
    }
}
