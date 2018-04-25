import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double z = 0;
		
		do {
			
			z = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero mayor o igual a 0 "));
			
		}while(z<0);
		
		JOptionPane.showMessageDialog(null, + z + " :Correcto");
		
		}
}