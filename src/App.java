import java.util.ArrayList;

public class App {

    public static void main(String[] args) throws Exception {
        Bank bank = new Bank();
        HandleNumber handleNumber = new HandleNumber();

        ArrayList<BankAccount> bankAccounts = new ArrayList<BankAccount>();

        do {

            if (bankAccounts.size() < 1)
                handleNumber.newHandleNumber("Digite um valor qual deseja selecionar \n1 - Adicionar Conta");
            else
                handleNumber.newHandleNumber(
                        "Digite um valor qual deseja selecionar \n1 - Adicionar Conta\n2 - Visualizar Contas");

            switch (handleNumber.getHandleNumber()) {
                case 1:
                    handleNumber.newHandleNumber(
                            "Digite um valor qual deseja selecionar \n1 - Adicionar Conta\n2 - Visualiza Contas");
                    break;

                default:
                    break;
            }

            bankAccounts.add(bank.addAccount(new BankAccount(1, "123456", "Pedro Leite", 10000)));

            bankAccounts.get(0).showBankAccount();

        } while (handleNumber.getHandleNumber() != 0);

        // BankAccount secondBankAccount = new BankAccount(3, "654321", "Felipe Leite",
        // 25150);
        // bank.addAccount(secondBankAccount);
        // System.out.println("Conta inserida!!!");
        // secondBankAccount.showBankAccount();

        // System.out.println("Total de " + bank.getTotalBalance() + " em todas
        // contas.");
        // System.out.println("-------------------");

        // for (int i = 0; i < 4; i++) {
        // BankAccount searchBankAccount = bank.find(i);
        // if (searchBankAccount != null) {
        // System.out.println("Conta com o numero " + i + " encontrada!!!");
        // searchBankAccount.showBankAccount();
        // } else
        // System.out.println("Conta com o numero " + i + " nao encontrada!!!");
        // }

        // BankAccount highestBankAccount = bank.getMaximum();
        // System.out.println("Conta com o maior saldo: ");
        // highestBankAccount.showBankAccount();

        // System.out.println("Quantidade de contas com o limite maior ou igual a 1000:
        // " + bank.count(1000));
        // System.out.println("Quantidade de contas com o limite maior ou igual a 15000:
        // " + bank.count(15000));

        // String teste = JOptionPane.showInputDialog(null, "Teste");
        // JOptionPane.showMessageDialog(null, teste);

    }

}
