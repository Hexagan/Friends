package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class GuardarContactos {
	
	public void guardarcontactos(BufferedReader br) {
		
		String line ="";
		int verificador = 0, numero=0;
		
		try {
			BufferedWriter bwtemp = new BufferedWriter(new FileWriter("archivos\\guardado.txt"));
			
		try {
		numero = Integer.parseInt(JOptionPane.showInputDialog("Coloque el numero de usuario que desea guardar"));
		}catch(NumberFormatException error) {
			error.printStackTrace();
		}
	
		do {
			line=br.readLine();
			System.out.println(line);
			if(line != null) {
	
				if(line.equals(String.valueOf(numero))){
					
					bwtemp.write(line);
					bwtemp.write("\n"+br.readLine());
					bwtemp.write("\n"+br.readLine());
					bwtemp.write("\n"+br.readLine());
					verificador++;
				}
				
			}else {
				verificador=2;
			}
		}while(verificador == 0);
		
		if(verificador==2) {
			JOptionPane.showMessageDialog(null, "No se encontro ese usuario");
			
		}else
		{
			JOptionPane.showMessageDialog(null, "Operacion realizada con exito");
		}
		
		bwtemp.close();
		
		}catch(IOException error) {
			error.printStackTrace();
		}
		finally {
			System.exit(0);
		}
	}
}
