package principal;

import java.io.BufferedReader;
import java.io.IOException;

public class ListarContactos {
	public  void listarcontactos(BufferedReader br) {
		String line="";
		try {
			
		while((line = br.readLine()) != null){
			System.out.println(line);
		}
		}catch(IOException error) {
			error.printStackTrace();
		}
		
	}
}
