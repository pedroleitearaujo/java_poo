import javax.swing.JOptionPane;

public class Utils {

    public int showIntJOptionPane(String message) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(null, message + "\n0 - Cancelar"));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um valor valido!!", "Erro", JOptionPane.ERROR_MESSAGE);
            return this.showIntJOptionPane(message);
        }
    }
}
