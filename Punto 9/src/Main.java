import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
	double precio = 0;
	
	precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto"));
	
	precio = precio + (precio * 0.21);
	
	JOptionPane.showMessageDialog(null,"El precio con un Iva de 21% aplicado es: " + precio);
	
	}
}
