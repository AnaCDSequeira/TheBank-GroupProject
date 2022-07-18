package academy.mindswap;

public class DebitAccount extends Account {


    public DebitAccount(int personalId) {
        super(personalId);
        minLimit = 0;
    }

}
