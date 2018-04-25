import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	int count = 0;
	int valor = 0;
	
	ArrayList<Integer> lista = new ArrayList<Integer>();
	
	do {
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros, un -1 finalizara la operacion"));
		count++;
		lista.add(valor);
		
	}while(valor != -1);

	JOptionPane.showMessageDialog(null, "Se introdujeron: " + count + " valores en total");
	System.out.println("Los valores introducidos en orden fueron: " + lista);
	
	}

}
