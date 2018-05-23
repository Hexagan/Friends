package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class AgregarContacto {
	
	public int agregarContacto(BufferedReader br,BufferedWriter bw) {
		
		int telefono=0,salir=0,contador=0,cont=0;
		String line="",nombre="",email="";

		try {
			salir=0;
		do {
			while((line = br.readLine()) != null) {
				cont++;
			}
		
			contador = cont/5; //Son siempre 5 lineas por contacto
			
			if((line = br.readLine()) == null) {
				bw.write(String.valueOf(contador+"\n"));
				bw.flush();
				salir=1;
			}
		
			System.out.println("linea es: "+salir);
			
		}while(salir != 1);
		
		try {
			
			telefono = Integer.parseInt(JOptionPane.showInputDialog("Inserte el telefono del contacto nuevo"));
			bw.write(telefono+"\n");
			bw.flush();
			
			} catch(NumberFormatException error) {
				error.printStackTrace();
			}
		
		nombre = JOptionPane.showInputDialog("Coloque el nombre del contacto nuevo: ");
		
		if(nombre.matches(".*\\d+.*") == true) {
			nombre = JOptionPane.showInputDialog("Coloco un nombre invalido, insertelo de nuevo");
		}
		
		bw.write(nombre+"\n");
		bw.flush();
		
		email = JOptionPane.showInputDialog("Coloque el email del contacto nuevo: ");
		
		while(email.contains("@") == false || email.contains(" ")) {
			email =	JOptionPane.showInputDialog("Coloco un email invalido, insertelo de nuevo");
		}
		
		bw.write(email+"\n\n");
		bw.flush();
		
		br.reset();	
		
		System.out.println("Operacion finalizada con exito");
		
	}catch(IOException error) {
		error.printStackTrace();
	}
		return contador;
	}
}
