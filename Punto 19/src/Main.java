import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int entero, longitud = 0;
		do {
		entero = Integer.parseInt(JOptionPane.showInputDialog("Coloque un numero entero positivo"));
		}while(entero < 0);
		
		longitud = String.valueOf(entero).length();
			System.out.println("La longitud de este entero es de: " +longitud);
		
		}
	}


