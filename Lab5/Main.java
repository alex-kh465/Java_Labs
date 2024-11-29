// Define the interface
interface BankInterface {
    double getBalance();
    double getInterestRate();
}

// Implement BankA class
class BankA implements BankInterface {
    private double balance;

    public BankA(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return 7.0; // Interest rate for BankA
    }
}

// Implement BankB class
class BankB implements BankInterface {
    private double balance;

    public BankB(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return 7.4; // Interest rate for BankB
    }
}

// Implement BankC class
class BankC implements BankInterface {
    private double balance;

    public BankC(double balance) {
        this.balance = balance;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double getInterestRate() {
        return 7.9; // Interest rate for BankC
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Instantiate objects of each bank
        BankA bankA = new BankA(10000);
        BankB bankB = new BankB(150000);
        BankC bankC = new BankC(200000);

        // Display balance and interest rate for each bank
        System.out.println("BankA:");
        System.out.println("Balance: " + bankA.getBalance());
        System.out.println("Interest Rate: " + bankA.getInterestRate() + "%\n");

        System.out.println("BankB:");
        System.out.println("Balance: " + bankB.getBalance());
        System.out.println("Interest Rate: " + bankB.getInterestRate() + "%\n");

        System.out.println("BankC:");
        System.out.println("Balance: " + bankC.getBalance());
        System.out.println("Interest Rate: " + bankC.getInterestRate() + "%\n");
    }
}
