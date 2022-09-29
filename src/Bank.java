public class Bank {

    private BankAccount accounts[]; // contas bancárias
    private int last; // último índice do banco inserido
    private int maxAccounts;

    public Bank() {
        maxAccounts = 100;
        accounts = new BankAccount[maxAccounts]; // banco com, no máximo, 100 contas bancárias
        last = 0;
    }

    public BankAccount addAccount(BankAccount account) {
        if (this.last <= this.maxAccounts) {
            this.accounts[this.last] = account;
            this.last += 1;
            return account;
        }
        return null;
    }

    public double getTotalBalance() {
        int saldoTotal = 0;
        for (BankAccount account : this.accounts) {
            if (account != null)
                saldoTotal += account.getBalance();
        }
        return saldoTotal;
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount account : this.accounts) {
            if (account != null && account.getAccountNumber() == accountNumber)
                return account;
        }
        return null;
    }

    public BankAccount getMaximum() {
        BankAccount maiorSaldo = this.accounts[0];
        for (BankAccount account : this.accounts) {
            if (account != null && account.getBalance() > maiorSaldo.getBalance())
                maiorSaldo = account;
        }
        return maiorSaldo;
    }

    public int count(int limit) {
        int countContas = 0;
        for (BankAccount account : this.accounts) {
            if (account != null && account.getBalance() >= limit)
                countContas += 1;
        }
        return countContas;
    }

}
