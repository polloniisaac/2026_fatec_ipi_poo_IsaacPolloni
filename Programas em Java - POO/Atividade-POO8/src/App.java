import javax.swing.SwingUtilities;
import gui.MenuForm;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MenuForm().setVisible(true));
    }
}
