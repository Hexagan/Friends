package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File archivo = new File("archivos\\Texto.txt");
		BufferedReader br = null;
		FileReader fr = null;
		String linea;
		String[] lineas;
		String texto = "";
		String word1,word2;
		int i,j;
		
		LinkedHashMap<String, Integer> Orden = new LinkedHashMap<String, Integer>();
		
		
		try {
			
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			while((linea = br.readLine()) != null) {	
				texto += linea;
			}
			
			texto = texto.toLowerCase(); 
			texto = texto.replaceAll("\\.|\\,|\\;|\\?|\\¿|\\!|\\¡|\\s", "\n"); //Replace sin el \\W para que funcione con palabras tildadas y eñes
			lineas = texto.split("\\s");
			
			ArrayList<String> Palabras = new ArrayList<>(Arrays.asList(lineas));
			
			Palabras.removeAll(Collections.singleton(""));
			Palabras.removeAll(Collections.singleton(null));
			
		
			for(i = 0; i < Palabras.size(); i++) {
				Orden.put(Palabras.get(i), 0);
			}
			
			for (i = 0; i < Palabras.size(); i++) {
				word1=Palabras.get(i);
				if(Orden.get(word1) == 0) {
					
					for (j = 0; j < Palabras.size(); j++) {
						
						word2=Palabras.get(j);
						
						if(word1.equals(word2) == true ) {
							
							Orden.put (word1,Orden.get(word1) + 1);	
						}
					}
				}
			}
			
			Map<String, Integer> Resultado = new LinkedHashMap<>();
			
			Orden.entrySet().stream()
			.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
			.forEachOrdered(x -> Resultado.put(x.getKey(), x.getValue()));
			
			
			JOptionPane.showMessageDialog(null,"Las palabras mas utilizas en el texto ofrecido de mayor a menor son: ");
			
			for(Map.Entry<String,Integer> entry : Resultado.entrySet()){
		        System.out.println(entry);
		        }
			
		}catch(IOException error){
			error.printStackTrace();
		}
		finally {
			try {br.close();}
			catch(IOException error) {error.printStackTrace();}
		}
		
	}

}
