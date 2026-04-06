import java.util.Scanner;

class SavingsAccount {
    void deposit(int bal) {
        System.out.println("Savings: Deposited " + bal);
    }

    void withdraw(int bal) {
        System.out.println("Savings: Withdrew " + bal);
    }
}

class CurrentAccount {
    void deposit(int bal) {
        System.out.println("Current: Deposited " + bal);
    }

    void withdraw(int bal) {
        System.out.println("Current: Withdrew " + bal);
    }
}

class FixedDepositAccount {
    void deposit(int bal) {
        System.out.println("Fixed Deposit: Created with " + bal);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Bal = 1000;
        int choice;

        while (true) {
            System.out.println("\n1. Savings\n2. Current\n3. Fixed Deposit\n4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    SavingsAccount s = new SavingsAccount();
                    System.out.print("1. Deposit 2. Withdraw: ");
                    int opt = sc.nextInt();
                    if (opt == 1) {
                        System.out.print("Amount: ");
                        Bal += sc.nextInt();
                    } else {
                        System.out.print("Amount: ");
                        Bal -= sc.nextInt();
                    }
                    s.deposit(Bal);
                    break;
                case 2:
                    CurrentAccount c = new CurrentAccount();
                    System.out.print("1. Deposit 2. Withdraw: ");
                    opt = sc.nextInt();
                    if (opt == 1) {
                        System.out.print("Amount: ");
                        Bal += sc.nextInt();
                    } else {
                        System.out.print("Amount: ");
                        Bal -= sc.nextInt();
                    }
                    c.deposit(Bal);
                    break;
                case 3:
                    FixedDepositAccount fd = new FixedDepositAccount();
                    System.out.print("Amount: ");
                    Bal = sc.nextInt();
                    fd.deposit(Bal);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Current Balance: " + Bal);
        }
    }
}
