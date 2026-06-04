import java.util.Scanner;

class ATM {
    double balance = 1000;

    void deposit(double amount) {

    if(amount <= 0) {
        System.out.println("Invalid Amount! Please enter a positive value.");
    } else {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}

    void withdraw(double amount) {

    if(amount <= 0) {
        System.out.println("Invalid Amount! Please enter a positive value.");
    }
    else if(amount > balance) {
        System.out.println("Insufficient Balance");
    }
    else {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Amount: ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 4);

        sc.close();
    }
}