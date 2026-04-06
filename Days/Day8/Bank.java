    package Days.Day8;

import java.util.Scanner;

class Savings {
    void deposit(int bal) {
        System.out.println("Savings: Deposited " + bal);
    }

    void withdraw(int bal) {
        System.out.println("Savings: Withdrew " + bal);
    }
}

class Current {
    void deposit(int bal) {
        System.out.println("Current: Deposited " + bal);
    }

    void withdraw(int bal) {
        System.out.println("Current: Withdrew " + bal);
    }
}

class FixedDeposit {
    void deposit(int bal) {
        System.out.println("Fixed Deposit: Created with " + bal);
    }
}

public class Bank {
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
                    Savings s = new Savings();
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
                    Current c = new Current();
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
                    FixedDeposit fd = new FixedDeposit();
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