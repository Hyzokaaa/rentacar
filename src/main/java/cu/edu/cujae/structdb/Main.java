package cu.edu.cujae.structdb;

import cu.edu.cujae.structdb.gui.GuiManager;

public class Main {

    public static void main(String[] args) {
        // Para probar otros temas sustituir el paramétro de init()
        // Si quieres verlos todos pones com.formdev.flatlaf.intellijthemes.materialthemeuilite. y usas el IntelliSense
        GuiManager.init(new com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme());
    }
}