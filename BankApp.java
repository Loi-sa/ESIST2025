import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(412435, 7452, "Chris Sandoval", 32000));
        accounts.add(new Account(264863, 1349, "Marc Yim", 1000));

        int userId=0;
        int userPin=0;
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter User ID: ");
            userId = scanner.nextInt();
            System.out.print("Enter PIN: ");
            userPin = scanner.nextInt();

            for (Account account : accounts) {
                if (account.getId() == userId && account.getPin() == userPin) {
                    loggedIn = true;
                    System.out.println("Login Successful!");
                    break;
                }
            }

            if (!loggedIn) {
                System.out.println("Invalid User ID or PIN. Please try again.");
            }
        }

        while (loggedIn) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Cash-in");
            System.out.println("3. Money Transfer");
            System.out.println("4. Logout");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    for (Account account : accounts) {
                        if (account.getId() == userId) {
                            System.out.println("Current Balance: " + account.getBalance());
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter amount to cash-in: ");
                    int cashInAmount = scanner.nextInt();
                    for (Account account : accounts) {
                        if (account.getId() == userId) {
                            account.setBalance(account.getBalance() + cashInAmount);
                            System.out.println("Cash-in successful. New balance: " + account.getBalance());
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter recipient's User ID: ");
                    int recipientId = scanner.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    int transferAmount = scanner.nextInt();
                    for (Account sender : accounts) {
                        if (sender.getId() == userId) {
                            for (Account recipient : accounts) {
                                if (recipient.getId() == recipientId) {
                                    if (sender.getBalance() >= transferAmount) {
                                        sender.setBalance(sender.getBalance() - transferAmount);
                                        recipient.setBalance(recipient.getBalance() + transferAmount);
                                        System.out.println("Transfer successful.");
                                    } else {
                                        System.out.println("Insufficient funds.");
                                    }
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Logging out...");
                    loggedIn = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

    }

}

class Account {
    int id;
    int pin;
    String name;
    int balance;

    public Account(int id, int pin, String name, int balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
