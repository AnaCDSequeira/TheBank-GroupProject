package academy.mindswap;

public abstract class Card {

    private final int CARD_ID;
    private final String BANK_NAME;

    public Card(int personalId, String bankName) {
        this.CARD_ID = personalId;
        this.BANK_NAME = bankName;
    }

    public void pay(float amountToPay, Bank bank) {

    }

    public String getBANK_NAME() {
        return BANK_NAME;
    }
}
