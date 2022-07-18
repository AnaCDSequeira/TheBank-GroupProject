package academy.mindswap;

public abstract class Print {
    public static final String EXISTING_CREDIT_ACCOUNT = "You already have a credit account here. Please choose another bank.";
    public static final String EXISTING_DEBIT_ACCOUNT = "You already have a debit account here. Please choose another bank.";

    public static final String NON_EXISTING_CREDIT_ACCOUNT = "We can't give you a credit card if you don't have an account.";
    public static final String NON_EXISTING_DEBIT_ACCOUNT = "We can't give you a debit card if you don't have an account.";


    public static void message(String message) {
        System.out.println(message);
    }
}
