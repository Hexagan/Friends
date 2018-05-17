package archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;



public class Main {

	public static void main(String[] args)  {
		
		String linea,texto = "";
		String[] oraciones = {""},output = {""};
		
		try {
		
		BufferedReader br1 = new BufferedReader(new FileReader("archivos\\texto.txt"));      
		BufferedWriter bwOri = new BufferedWriter(new FileWriter("archivos\\texto.txt",true));
		
		PrintWriter pw = new PrintWriter("archivos\\textobkp.txt","UTF-8");
		
		BufferedReader br2 = new BufferedReader(new FileReader("archivos\\textobkp.txt"));
		BufferedWriter bwBak = new BufferedWriter(new FileWriter("archivos\\textobkp.txt"));
	
		while((linea = br1.readLine()) != null) {
			bwBak.write(linea);
			texto += linea;
		}
		
		oraciones = texto.split("\\.");
			
		for (int i = 0; i < oraciones.length; i++) {
			
			oraciones[i] = oraciones[i].substring(0, 1).toUpperCase() + oraciones[i].substring(1);
			System.out.println(oraciones[i]);
			bwOri.write(oraciones[i]);
		}
				
		pw.close();
		br1.close();
		br2.close();
		bwBak.close();
		bwOri.close();
		
		}catch(IOException error) {
			error.printStackTrace();
		}

	}
}

