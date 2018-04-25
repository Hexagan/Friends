

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		

	int valor = Integer.parseInt((JOptionPane.showInputDialog("Ingrese un valor ASCII")));
	char valorchar = (char) valor;
	JOptionPane.showMessageDialog(null, "El valor es: " + valorchar);
	
	}

}
