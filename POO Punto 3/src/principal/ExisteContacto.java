package principal;

import java.io.BufferedReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ExisteContacto {
	public void existecontacto(BufferedReader br) {
		
		int numero = 0,verificador=0;
		String line ="";
		
		try {
			
			
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque el numero de contacto"));	
			}catch(NumberFormatException error) {
				error.printStackTrace();
			}
			
			System.out.println(numero);
			while((line = br.readLine()) != null){
				System.out.println(line);
				
				if(line.equals(String.valueOf(numero))) {
					JOptionPane.showMessageDialog(null, "El contacto efectivamente existe en la base de datos");
					verificador++;
				}
			}
		
		}catch(IOException error) {
			error.printStackTrace();
		}
		
		if(verificador==1) {
			System.out.println("Operacion realizada con exito");
		}
		else
		{
			JOptionPane.showMessageDialog(null,"El contacto no existe en la base de datos o hubo algun error");
			System.exit(0);
		}
		
	}
}
