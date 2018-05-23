package principal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;

public class CargarContactos {
	
	public void cargarcontactos(BufferedReader br){
		
		int count = 0;
		String line = "";
		
		try {
			PrintWriter pw = new PrintWriter("archivos\\respaldo.txt", "UTF-8");
			BufferedWriter bwBack = new BufferedWriter(new FileWriter("archivos\\respaldo.txt"));

			while((line = br.readLine()) != null)
			{
				if(count==0) {
					
					bwBack.write(line);
					bwBack.flush();
					
				} else {
					bwBack.write("\n"+line);
					bwBack.flush();
				}
				
				count++;
			}
			bwBack.write("\n");
			pw.close();
			bwBack.close();
			
		}catch(IOException error) {
			error.printStackTrace();
		}
		
		System.out.println("Operacion realizada con exito");
		
	}

}
