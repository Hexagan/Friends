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
		
		String linea,texto = "", contenido = "en su morada de Rlyeh, el difunto Cthulhu espera sognando. en ese momento, en respuesta a una exigencia urgente y generalizada, el inspector Legrasse relato, de la forma mas completa posible, su experiencia con los adoradores de los pantanos; un relato que mi tio, tal y como puedo ver, considero de una profunda trascendencia. la historia participaba de los mas locos suegnos de mitomanos y teosofos, y demostraba el asombroso grado de imaginacion cosmica poseido por aquellos mestizos y parias, algo que era lo que menos se hubiera podido esperar de ellos.";
		String[] oraciones = {""};
		
		try {
			
		PrintWriter pw = new PrintWriter("archivos\\textobkp.txt", "UTF-8"); //Segun el ejercicio, el archivo base ya deberia existir, solo creo el respaldo
			
		File file1 = new File("archivos\\texto.txt");
		File file2 = new File("archivos\\textobkp.txt");
		
		BufferedReader br1 = new BufferedReader(new FileReader(file1));      
		BufferedReader br2 = new BufferedReader(new FileReader(file2));

		BufferedWriter bwOri = new BufferedWriter(new FileWriter(file1));
		BufferedWriter bwBak = new BufferedWriter(new FileWriter(file2));
	
		br1.mark(10000);
		
		if((linea = br1.readLine()) == null);
		{
			bwOri.write(contenido);
			bwOri.flush();
		}
		
		br1.reset();
		
		while((linea = br1.readLine()) != null) {
			texto += linea;
		}
		
		bwOri.close();
		
		BufferedWriter bwOri2 = new BufferedWriter(new FileWriter(file1)); //FileWriter borrara todo el contenido original del archivo cuando se lo declara
		
		bwBak.write(texto);
		
		oraciones = texto.split("\\.");
		
		for (int i = 0; i < oraciones.length; i++) {
			if(oraciones[i].startsWith(" ")) {
				oraciones[i] = oraciones[i].substring(1);
			}
		}
		
		System.out.println("Oraciones originales: \n");
		for (String string : oraciones) {
			System.out.println(string);
		}
		
		System.out.println("\nOraciones modificadas: \n");
		for (int i = 0; i < oraciones.length; i++) {
			
			oraciones[i] = oraciones[i].substring(0, 1).toUpperCase() + oraciones[i].substring(1);
			System.out.println(oraciones[i]);
			bwOri2.write(oraciones[i]);
			bwOri2.flush();
		}
				
		pw.close();
		br1.close();
		br2.close();
		bwBak.close();
		bwOri2.close();
		
		}catch(IOException error) {
			error.printStackTrace();
		}

	}
}

