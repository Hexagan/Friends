package principal;

import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class BuscaContactoPorTelefono {
	
	public void buscacontactoportelefono(BufferedReader br) {
	int numero=0,decision=100;
	String line="";
	
	try {
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque el numero de telefono del contacto"));
	
	do {		
			line=br.readLine();
			
			if(line == null)
			{
				JOptionPane.showMessageDialog(null,"No se encontro el contacto especificado");
				System.exit(0);
			}
			
			if(line.equals(String.valueOf(numero))) {
				System.out.println("Contacto encontrado");
				decision = Integer.parseInt(line);
			}
			
			
		
	}while(decision != numero);
		
	System.out.println("Nombre: " + br.readLine()); //Nombre
	System.out.println("Email: " + br.readLine()); //Email
	
	}catch(IOException error) {
		error.printStackTrace();
	}
	}
}
