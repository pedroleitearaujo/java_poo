public class App {

  public static void main(String[] args) throws Exception {
    ATM atm = new ATM(new Bank(), 5);
    HandleNumber handleNumber = new HandleNumber();
    Utils utils = new Utils();

    do {
      int accountNumber = 0;
      String password = "";
      String owner = "";
      double balance = 0;

      handleNumber.newHandleNumber(
          "Digite um valor qual deseja selecionar: "
              + "\n1 - Adicionar Conta "
              + "\n2 - Visualizar Contas "
              + "\n3 - Consultar Saldo "
              + "\n4 - Sacar "
              + "\n5 - Depositar "
              + "\n6 - Soma de todas contas "
              + "\n7 - Conta com maior saldo "
              + "\n8 - Conta com menor saldo "
              + "\n9 - Saldo médio das contas "
              + "\n0 - Cancelar");

      switch (handleNumber.getHandleNumber()) {
        case 1:
          // accountNumber = utils.showIntJOptionPane("Digite um numero para a conta.");
          // password = utils.showStringJOptionPane("Digite uma senha para a conta.");
          // owner = utils.showStringJOptionPane("Digite o nome do responsavel da
          // conta.");
          // balance = utils.showIntJOptionPane("Digite o saldo para a conta.");

          // atm.getBank().addAccount(new BankAccount(accountNumber, password, owner,
          // balance));
          atm.getBank().addAccount(new BankAccount(123, "12345", "pedro", 10000));
          atm.getBank().addAccount(new BankAccount(1233, "345", "teste", 2000));
          // System.out.println(doGetBalance(atm, 123));
          break;
        case 2:
          String showBankAccounts = "";
          for (int i = 0; i < atm.getBank().getBankAccounts().size(); i++) {
            showBankAccounts += "Numero da Conta: " + atm.getBank().getBankAccounts().get(i).getAccountNumber()
                + " -- Dono: " + atm.getBank().getBankAccounts().get(i).getOwner();

            if (i != (atm.getBank().getBankAccounts().size() - 1))
              showBankAccounts += "\n";
          }
          utils.showMessageJOptionPane(showBankAccounts);
          break;
        case 3:
          accountNumber = utils.showIntJOptionPane("Digite o numero da conta que deseja consultar o saldo.");
          utils.showMessageJOptionPane("O saldo da conta é: " + atm.getBalance(accountNumber));
          break;
        case 4:
          doDepositOrWithdraw(atm, "withdraw");
          break;
        case 5:
          doDepositOrWithdraw(atm, "deposit");
          break;
        case 6:
          utils.showMessageJOptionPane("O valor da soma de todas contas é " + atm.getBank().getSumBalanceAccounts());
          break;
        case 7:
          utils.showMessageJOptionPane(
              "A conta com o maior saldo:\n" + atm.getBank().getAccountBiggestBalance().showBankAccount());
          break;
        case 8:
          utils.showMessageJOptionPane(
              "A conta com o maior saldo:\n" + atm.getBank().getAccountLowestBalance().showBankAccount());
          break;
        case 9:
          utils.showMessageJOptionPane("A média de saldo das contas é: " + atm.getBank().getAverageBalance());
          break;
      }

      // bankAccounts.get(0).showBankAccount();

    } while (handleNumber.getHandleNumber() != 0);

  }

  static void doDepositOrWithdraw(BankAccountOperation bao, String type) throws Exception {
    Utils utils = new Utils();
    int accountNumber = utils.showIntJOptionPane("Digite o numero da conta que deseja fazer o deposito.");
    double value = utils
        .showDoubleJOptionPane("Digite o valor do deposito. \nSaldo Atual: " + bao.getBalance(accountNumber));
    bao.getClass().getDeclaredMethod(type, int.class, double.class).invoke(bao, accountNumber, value);
  }

}
