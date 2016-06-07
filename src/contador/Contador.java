
package contador;
public class Contador {

    public static void main(String[] args) {
        Gui.ContadorGui windows = new Gui.ContadorGui();
        windows.setTitle("Simulador de Contador Manual ");
        windows.setVisible(true);
        windows.setLocationRelativeTo(null);
    }
    
}
