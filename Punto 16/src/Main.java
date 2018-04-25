import java.util.Objects;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	
		String password = "Tato515";
		String poo;
		
		int i = 3;
		
		while(i <= 3 && i>=0) {
	
			poo = JOptionPane.showInputDialog("Coloque la contraseña");
			
			if (Objects.equals(password, poo)) {
				System.out.println("Acceso Concedido");
				System.exit(0);
			}
			
			else {
				System.out.println("Incorrecto, tiene " + i + " intentos adicionales");
			}
			
			i--;
		}
		
		System.out.println("Baneado de Steam");

	}
}
	
