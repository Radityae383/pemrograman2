import UTS_Gui.LoginPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main_Tes {
    public static void main(String[] args) {
        // Set Look & Feel Nimbus
        try{
            for(UIManager.LookAndFeelInfo info: UIManager.getInstalledLookAndFeels()){
                if("Nimbus".equals(info.getName())){
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e){}

        SwingUtilities.invokeLater(() -> new LoginPanel().setVisible(true));
    }
}
