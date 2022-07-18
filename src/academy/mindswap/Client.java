package academy.mindswap;

import java.util.ArrayList;

public class Client {

    private final String NAME;
    private final int PERSONAL_ID;

    private ArrayList<Bank> myBankList = new ArrayList<>();
    private ArrayList<Card> myCardsList = new ArrayList<>();

    public Client(String name, int personalId) {
        this.NAME = name;
        this.PERSONAL_ID = personalId;
    }

    public void setBank(Bank bank) {
        myBankList.add(bank);
    }

    public void createMyDebitAccount(String bankName) {
        for (Bank bank : myBankList) {
            if (bank.getNAME().equals(bankName)) {
                bank.createDebitAccount(PERSONAL_ID);
            }
        }
    }

    public void createMyCreditAccount(String bankName) {
        for (Bank bank : myBankList) {
            if (bank.getNAME().equals(bankName)) {
                bank.createCreditAccount(PERSONAL_ID);
            }
        }
    }

    public void askForMyDebitCard(String bankName) {
        for (Bank bank : myBankList) {
            if (bank.getNAME().equals(bankName)) {
                bank.askForDebitCard(PERSONAL_ID, bankName);
            }
        }
    }

    public void askForMyCreditCard(String bankName) {
        for (Bank bank : myBankList) {
            if (bank.getNAME().equals(bankName)) {
                bank.askForCreditCard(PERSONAL_ID, bankName);
            }
        }
    }

    public void payWithCreditCard (float amountToPay, String bankName) {
        for (Card card : myCardsList) {
            if (card.getBANK_NAME().equals(bankName)) {
                card.pay(amountToPay, );
            }
        }
    }

    public void payWithDebitCard (float amountToPay, String bankName) {

    }
}
