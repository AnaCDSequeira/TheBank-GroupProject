package academy.mindswap;

public class CreditAccount extends Account {

    public CreditAccount(int personalId) {
        super(personalId);
        minLimit = -100;
    }
}
