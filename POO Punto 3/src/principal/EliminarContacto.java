package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class EliminarContacto {
	
	public void eliminarcontacto(BufferedReader br,File contactos){
		
		int numero = 0,contador=0,contador2=0;
		String line = "";
		
		
		try {
			
			PrintWriter pw = new PrintWriter("archivos\\temp.txt","UTF-8");
			File temp = new File ("archivos\\temp.txt");
			BufferedWriter bwtemp = new BufferedWriter(new FileWriter(temp));
			BufferedReader brtemp = new BufferedReader(new FileReader(temp));
			
			
			try {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Indique el numero de contacto que desea eliminar de la base de datos"));		
			}catch(NumberFormatException error) {
				error.printStackTrace();
			}
			do {
				
				line = br.readLine();
				if(line == null) {}
				
				else {
					
				
				if(line.equals(String.valueOf(numero))) {
					br.readLine();
					br.readLine();
					br.readLine();
					contador++;
				}
			
				else{
					
					if(contador==1) {
						bwtemp.write(line);
						bwtemp.flush();
						contador++;
						
					}else if(contador2==0)
					{
						bwtemp.write(line);
						bwtemp.flush();
						contador2++;
					}else {
						bwtemp.write("\n"+line);
						bwtemp.flush();
					}
						
				}
				
				}
			}while (line != null);
			
			
			
			if(contador==0) {
				JOptionPane.showMessageDialog(null, "No se encontro ese usuario");
				System.exit(0);
			}
			
			contador=0;
			BufferedWriter bw = new BufferedWriter(new FileWriter("archivos\\contactos.txt"));
			
			while((line = brtemp.readLine())!=null) {
				if(contador==0) {
					bw.write(line);
					bw.flush();
					contador++;
				}else {
					bw.write("\n"+line);
					bw.flush();
				}
			}
			bw.write("\n\n");
			
			
			brtemp.close();
			bwtemp.close();
			pw.close();
			
			PrintWriter pw2 = new PrintWriter(temp);
			pw2.flush();
			
			    temp.delete();
			    System.out.println("file deleted");
		
			bw.close();
			pw2.close();
			
		} catch(IOException error) {
			error.printStackTrace();
		}
		
		System.out.println("Eliminado con exito");
	}

}
