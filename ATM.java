import java.util.*;

// Class representing a bank account
class Acct {
    private double bal; // bal = account balance

    // Constructor to initialize balance
    public Acct(double bal) {
        this.bal = bal;
    }

    // Method to deposit money
    public void dep(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("₹" + amt + " deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void wd(double amt) {
        if (amt > bal) {
            System.out.println("Insufficient balance.");
        } else if (amt <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else {
            bal -= amt;
            System.out.println("₹" + amt + " withdrawn.");
        }
    }

    // Method to check balance
    public void chk() {
        System.out.printf("Current Balance: ₹%.2f\n", bal);
    }
}

// Class representing the ATM
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Scanner for user input
        Acct a = new Acct(1000);                 // Initialize account with ₹1000

        while (true) {
            // Display ATM menu
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();               // Read user choice

            switch (ch) {
                case 1:
                    a.chk();                     // Call check balance method
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double d = sc.nextDouble();  // Read deposit amount
                    a.dep(d);                    // Call deposit method
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double w = sc.nextDouble();  // Read withdrawal amount
                    a.wd(w);                     // Call withdraw method
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;                      // Exit program
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
