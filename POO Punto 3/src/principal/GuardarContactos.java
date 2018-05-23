package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Frame;

public class GuardarContactos {
	
	public void guardarcontactos(BufferedReader br,BufferedWriter bw) {
		
		int numero = 0,telefono=0;
		String line = "",nombre="",email="";
		Object[] opciones =  {"Nombre", "Telefono", "Email"};
		JFrame frame = new JFrame();
		
		try {
			
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero del contacto desea modificar"));
		}catch(NumberFormatException error) {
			error.printStackTrace();
		}
		
		Object decision = JOptionPane.showInputDialog(null, 
						"Elija el dato del contacto que desea cambiar: ", 
						"Tipo de dato", 
						JOptionPane.QUESTION_MESSAGE, 
						null,
						opciones,
						"Nombre");
		
		while(((line = br.readLine()) != String.valueOf(numero)) && line != null){}
		
		if(line == String.valueOf(numero)) {
			
			if(decision == "Telefono") {
				
				try {
					telefono = Integer.parseInt(JOptionPane.showInputDialog(frame, "Inserte el telefono del contacto nuevo"));
						
					} catch(NumberFormatException error) {
						error.printStackTrace();
					}
				
				br.readLine(); //Pasa a la linea donde se listan telefonos
				
				bw.write("Telefono: " +telefono);
				bw.flush();
				
			}
			
			if(decision == "Nombre") {
				
				nombre = JOptionPane.showInputDialog(frame,"Coloque el nombre del contacto nuevo: ");
				
				br.readLine();
				br.readLine();
				
				if(nombre.matches(".*\\d+.*") == true) {
					nombre = JOptionPane.showInputDialog(frame, "Coloco un nombre invalido, insertelo de nuevo");
				}
				
			bw.write(nombre);
			bw.flush();
			
			}
			
			if(decision == "Email") {
				email = JOptionPane.showInputDialog(frame,"Coloque el email del contacto nuevo: ");
				
				while(email.contains("@") == false || email.contains(" ")) {
					email =	JOptionPane.showInputDialog(frame, "Coloco un email invalido, insertelo de nuevo");
				}
				
				br.readLine();
				br.readLine();
				br.readLine();
				
			bw.write(email);
			bw.flush();
			}
		
		}
		else {
			JOptionPane.showMessageDialog(null, "No se encontro ese usuario");
			System.exit(0);
		}
		}catch(IOException error) {
			error.printStackTrace();
		}
	}
}
