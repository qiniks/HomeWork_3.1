public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void  deposit(double sum){
        System.out.println("Deposit " + sum);
        amount = amount + sum;
        System.out.println("Current amount: " + amount);
    }

    public void withDraw(int sum) throws LimitException {
        if(sum > amount){
            throw new LimitException("Error.", amount);
        }else {
            System.out.println("Withdraw " + sum);
            amount = amount - sum;
            System.out.println("Current amount: " + amount);
        }
    }
}
