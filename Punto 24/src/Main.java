import javax.swing.JOptionPane;

public class Main {
	
	public static void main (String[] args) {
		double base = 1;
		double result;
	
		double add = Double.parseDouble(JOptionPane.showInputDialog("Indique un numero al azar"));
		result = base + add;

		JOptionPane.showMessageDialog(null, "El resultado de la suma de 1 y su valor es: " + result);
		
	}

}
