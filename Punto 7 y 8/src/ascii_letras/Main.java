package ascii_letras;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
	String valor;
		
	valor = JOptionPane.showInputDialog(null,"Ingrese un caracter"); 
	
	char valorchar = valor.charAt(0);
	
	int valorint = (int) valorchar;
	
	JOptionPane.showMessageDialog(null, "El valor es: " + valorint);
	
	}

}
