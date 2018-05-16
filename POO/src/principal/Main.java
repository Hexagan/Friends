package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.File;

public class Main {

	public static void main(String[] args) {
		File archivo = new File("C:\\Users\\Nation\\eclipse-workspace\\POO\\Texto.txt");
		BufferedReader br = null;
		FileReader fr = null;
		String linea;
		String texto = "";
		String palabra1, palabra2;
		int i,j,k,mayor0,mayor1, mayor2, mayor3, mayor4, mayor5, mayor6, mayor7, mayor8, mayor9;
	
		
		
		try {
			
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			while((linea = br.readLine()) != null) {
				
				System.out.println(linea);	
				texto += linea;
			
			}
			
			texto = texto.toLowerCase(); 
			texto = texto.replaceAll("\\.|\\,|\\;|\\?|\\¿|\\!|\\¡|\\s", "\n"); //Replace sin el \\W para que funcione con palabras tildadas y eñes
		
			ArrayList<String> Palabras = new ArrayList<>(Arrays.asList(texto.split("\\s")));

			Palabras.removeAll(Collections.singleton(""));
			Palabras.removeAll(Collections.singleton(null));

			int[] repetidas = new int[Palabras.size()];
			
			for (i = 0; i < Palabras.size(); i++) {
				palabra1 = Palabras.get(i);
				
				for (j = 0; j < Palabras.size(); j++) {
					palabra2 = Palabras.get(j);
						if(i == j) {
							repetidas[j]++;
						}
						else
						{
							if(palabra1.equals(palabra2)) {
								
								repetidas[j]++;
							}
						}
					}
			
				}
			for (k = 0; k < repetidas.length; k++) {
				if(repetidas[k]>mayor0)
			}
				
			
			for (int k : repetidas) {
				System.out.println(k);	
			}
		}
	
		catch(IOException error){
			error.printStackTrace();
		}
		finally {
			try {br.close();}
			catch(IOException error) {error.printStackTrace();}
		}
		
	}

}
