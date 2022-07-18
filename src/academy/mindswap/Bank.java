package academy.mindswap;

import java.util.ArrayList;

import static academy.mindswap.Print.*;

public class Bank {

    private final String NAME;

    private ArrayList<Account> bankAccounts = new ArrayList<>();

    public Bank(String name) {
        this.NAME = name;
    }


    public void createDebitAccount(int clientPersonalId) {
        if (hasDebitAccount(clientPersonalId)) {
            Print.message(EXISTING_DEBIT_ACCOUNT);
            return;
        }

        DebitAccount debitAccount = new DebitAccount(clientPersonalId);
        bankAccounts.add(debitAccount);
    }

    public void createCreditAccount(int clientPersonalId) {
        if (hasCreditAccount(clientPersonalId)) {
            Print.message(EXISTING_CREDIT_ACCOUNT);
            return;
        }

        CreditAccount creditAccount = new CreditAccount(clientPersonalId);
        bankAccounts.add(creditAccount);
    }

    public void askForDebitCard(int clientPersonalId, String bankName) {
        if (hasDebitAccount(clientPersonalId)) {
            Print.message(NON_EXISTING_DEBIT_ACCOUNT);
            return;
        }

        DebitCard debitCard = new DebitCard(clientPersonalId, bankName);
    }

    public void askForCreditCard(int clientPersonalId, String bankName) {
        if (hasCreditAccount(clientPersonalId)) {
            Print.message(NON_EXISTING_CREDIT_ACCOUNT);
            return;
        }

        CreditCard creditCard = new CreditCard(clientPersonalId, bankName);
    }

    private boolean hasCreditAccount(int clientPersonalId) {
        for (Account account : bankAccounts) {
            if (account.getACCOUNT_ID() == clientPersonalId && account instanceof CreditAccount) {
                return true;
            }
        }
        return false;
    }

    private boolean hasDebitAccount(int clientPersonalId) {
        for (Account account : bankAccounts) {
            if (account.getACCOUNT_ID() == clientPersonalId && account instanceof DebitAccount) {
                return true;
            }
        }
        return false;
    }

    public int getBankAccounts() {
        return bankAccounts.get(1).getACCOUNT_ID();

    }

    public String getNAME() {
        return NAME;
    }

    p
}
