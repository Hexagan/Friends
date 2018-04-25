import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt((JOptionPane.showInputDialog("Ingrese un número entero")));
		
		if(numero % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "Es un número par");
		}
		else {
			JOptionPane.showMessageDialog(null, "Es un número impar");
			
		}

	}

}
