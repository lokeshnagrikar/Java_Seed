package assignment;

import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    private String customerName;
    private double balance;
    private String city;

    private static int nextAccountNumber = 1;

    public BankAccount() {
        this.accountNumber = nextAccountNumber++;
    }

    public BankAccount(String customerName, double balance, String city) {
        this();
        this.customerName = customerName;
        this.balance = balance;
        this.city = city;
    }

    public void createAccount(String customerName, double balance, String city) {
        this.customerName = customerName;
        this.balance = balance;
        this.city = city;
    }

    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void transferAmount(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.depositAmount(amount);
            System.out.println("Transfer successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: " + balance);
        System.out.println("City: " + city);
    }

    public void displayAccountDetailsByCity(String city) {
        if (this.city.equalsIgnoreCase(city)) {
            displayAccountDetails();
        }
    }

    public void displayAccountDetailsByAccountNumber(int accountNumber) {
        if (this.accountNumber == accountNumber) {
            displayAccountDetails();
        }
    }
}

public class AccountD {
    private ArrayList<BankAccount> accounts;

    public AccountD() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String customerName, double balance, String city) {
        BankAccount account = new BankAccount(customerName, balance, city);
        accounts.add(account);
        System.out.println("Account created successfully. Account Number: " + account.accountNumber);
    }

    public void displayAllAccountDetails() {
        for (BankAccount account : accounts) {
            account.displayAccountDetails();
            System.out.println();
        }
    }

    public void displayAccountDetailsByCity(String city) {
        for (BankAccount account : accounts) {
            account.displayAccountDetailsByCity(city);
        }
    }

    public void displayAccountDetailsByAccountNumber(int accountNumber) {
        for (BankAccount account : accounts) {
            account.displayAccountDetailsByAccountNumber(accountNumber);
        }
    }

    public static void main(String[] args) {
        AccountD bank = new AccountD();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Transfer Amount");
            System.out.println("5. Display All Account Details");
            System.out.println("6. Display Account Details by City");
            System.out.println("7. Display Account Details by Account Number");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.next();
                    System.out.print("Enter initial balance: ");
                    double balance = scanner.nextDouble();
                    System.out.print("Enter city: ");
                    String city = scanner.next();
                    bank.createAccount(customerName, balance, city);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int accountNumber = scanner.nextInt();
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    for (BankAccount account : bank.accounts) {
                        if (account.accountNumber == accountNumber) {
                            account.withdrawAmount(withdrawAmount);
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.nextInt();
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    for (BankAccount account : bank.accounts) {
                        if (account.accountNumber == accountNumber) {
                            account.depositAmount(depositAmount);
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter sender account number: ");
                    int senderAccountNumber = scanner.nextInt();
                    System.out.print("Enter receiver account number: ");
                    int receiverAccountNumber = scanner.nextInt();
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = scanner.nextDouble();
                    for (BankAccount sender : bank.accounts) {
                        if (sender.accountNumber == senderAccountNumber) {
                            for (BankAccount receiver : bank.accounts) {
                                if (receiver.accountNumber == receiverAccountNumber) {
                                    sender.transferAmount(receiver, transferAmount);
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    break;
                case 5:
                    bank.displayAllAccountDetails();
                    break;
                case 6:
                    System.out.print("Enter city: ");
                    String cityName = scanner.next();
                    bank.displayAccountDetailsByCity(cityName);
                    break;
                case 7:
                    System.out.print("Enter account number: ");
                    int accNum = scanner.nextInt();
                    bank.displayAccountDetailsByAccountNumber(accNum);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}