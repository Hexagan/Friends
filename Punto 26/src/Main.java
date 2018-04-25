import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> cadena = new ArrayList<String>();
		
		
		do {
		cadena.add(JOptionPane.showInputDialog("Coloque una cadena de caracteres, no colocar nada finalizara la operacion"));
		
		}while(cadena.contains("") == false);
	
		System.out.println("La cadena resultante es: " + cadena);
	}

}
