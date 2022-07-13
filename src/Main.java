public class Main {
    public static void main(String[] args) throws LimitException {
        BankAccount user = new BankAccount();
        user.deposit(20000);
        while (true){
            try{
                user.withDraw(6000);
            }catch (LimitException e){
                user.withDraw((int) e.getRemainingAmount());
                break;
            }
        }
    }
}