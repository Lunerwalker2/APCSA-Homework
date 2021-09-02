public class CashRegister {

    public static final double QUARTER_VALLUE = 0.25;
    public static final double DIME_VALUE = 0.1;
    public static final double NICKEL_VALUE = 0.05;
    public static final double PENNY_VALUE = 0.01;


    private double purchase;
    private double payment;


    public CashRegister(){
        purchase = 0;
        payment = 0;
    }

    public void recievePayment(int dollars, int quarters, int dimes, int nickels, int pennies){
        payment = dollars + quarters * QUARTER_VALLUE + dimes * DIME_VALUE + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
    }

    public void recordPurchase(double amount){
        purchase += amount;
    }


    public double giveChange(){
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public void enterDollars(int dollars){
        payment += dollars;
    }

    public void enterQuarters(int quarters){
        payment += quarters * QUARTER_VALLUE;
    }

    public void enterDimes(int dimes){
        payment += dimes*DIME_VALUE;
    }

    public void enterNickels(int nickels){
        payment += nickels*NICKEL_VALUE;
    }

    public void enterPennies(int pennies){
        payment += pennies*PENNY_VALUE;
    }
}
