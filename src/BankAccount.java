public class BankAccount {

    private int accountNumber;
    private String password;
    private String owner;
    private double balance;

    public BankAccount(int accountNumber, String password, String owner, double balance) {

        this.setAccountNumber(accountNumber);

        if (password == null) // se ainda não houver uma senha
            password = "123"; // cria uma senha-padrão
        else
            setPassword(password);

        if (owner == null) // Se não houver nome criado, utiliza um nome-padrão
            owner = "Nome não-informado";
        else
            setOwner(owner);

        setBalance(balance);
    }

    public void showBankAccount() {
        System.out.println("-------------------");
        System.out.println("Numero da conta: " + this.getAccountNumber());
        System.out.println("Senha: " + this.getPassword());
        System.out.println("Dono: " + this.getOwner());
        System.out.println("Saldo: " + this.getBalance());
        System.out.println("-------------------");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
