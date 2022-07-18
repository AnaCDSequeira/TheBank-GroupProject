package academy.mindswap;

public abstract class Account {

    private int balance;

    private Card card;

    private final int ACCOUNT_ID;


    protected int minLimit = 0;

    public Account(int personalId) {
        this.ACCOUNT_ID = personalId;
        this.balance = 0;
    }

    public int getACCOUNT_ID() {
        return ACCOUNT_ID;
    }
}
