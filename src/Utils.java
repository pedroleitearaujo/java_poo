import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Utils {

    public void errorMessage() {
        JOptionPane.showMessageDialog(null, "Digite um valor valido!!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public int showIntJOptionPane(String message) {
        try {
            String input = JOptionPane.showInputDialog(null, message);
            if (this.isEmpty(input))
                return -1;
            return Integer.parseInt(input);
        } catch (Exception e) {
            this.errorMessage();
            return this.showIntJOptionPane(message);
        }
    }

    public Double showDoubleJOptionPane(String message) {
        try {
            String input = JOptionPane.showInputDialog(null, message);
            if (input == null || (input != null && ("".equals(input))))
                return -1.0;
            return Double.parseDouble(input);
        } catch (Exception e) {
            this.errorMessage();
            return this.showDoubleJOptionPane(message);
        }
    }

    public String showStringJOptionPane(String message) {
        return JOptionPane.showInputDialog(null, message);
    }

    public String showSelectionJOptionPane(Object[] possibilities) {
        return (String) JOptionPane.showInputDialog(
                null,
                "Seleciona uma conta",
                "Contas Salvas",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                0);
    }

    public void showMessageJOptionPane(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public boolean isEmpty(Object value) {
        if (value == null || (value != null && ("".equals(value))))
            return true;
        return false;
    }

}
