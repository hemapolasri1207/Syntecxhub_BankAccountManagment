import java.util.HashMap;
import java.util.Scanner;

// Bank Account Class
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        } else {
            System.out.println("Invalid Amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance or Invalid Amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Main Class
public class BankAccountManagmnent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // HashMap to store accounts
        HashMap<String, BankAccount> accounts = new HashMap<>();

        while (true) {
            System.out.println("\n--- Bank Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        System.out.println("Account already exists!");
                        break;
                    }

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    accounts.put(accNo, new BankAccount(accNo, name));
                    System.out.println("Account Created Successfully!");
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        System.out.print("Enter Amount to Deposit: ");
                        double amount = sc.nextDouble();
                        accounts.get(accNo).deposit(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        System.out.print("Enter Amount to Withdraw: ");
                        double amount = sc.nextDouble();
                        accounts.get(accNo).withdraw(amount);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    accNo = sc.nextLine();

                    if (accounts.containsKey(accNo)) {
                        accounts.get(accNo).displayBalance();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}