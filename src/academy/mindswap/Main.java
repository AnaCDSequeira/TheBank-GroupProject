package academy.mindswap;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("André", 1234);
        Bank activeBank = new Bank("ActiveBank");
        client1.setBank(activeBank);
        client1.createMyDebitAccount("ActiveBank");
        client1.createMyCreditAccount("ActiveBank");
        System.out.println(activeBank.getBankAccounts());

        client1.createMyDebitAccount("ActiveBank");
        client1.createMyCreditAccount("ActiveBank");
    }
}
