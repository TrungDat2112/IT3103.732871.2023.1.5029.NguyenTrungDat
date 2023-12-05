package lab01;
import javax.swing.JOptionPane;
public class ChoosingOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Nguyen Trung Dat - 20215029. Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null, "You've been choosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}
