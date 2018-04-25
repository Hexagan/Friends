import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		File Texto = new File("C:\\Users\\7º Técnica\\Desktop\\Texto.txt");
		String LineaActual, siguiente;
		int contador = 1, longmax;
		
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(Texto));
			LineaActual = br.readLine();
			Scanner sc = new Scanner(Texto);
			
			System.out.println(sc.next());
			
			while(LineaActual != null)
			{
				System.out.println("Linea " + contador + ": " + LineaActual);
				contador++;
				longmax = LineaActual.length();
				siguiente = sc.next();
				while(siguiente != null)
				{
					
				}
				LineaActual = br.readLine();
			}
			
			br.close();
			
		} 
		
		catch(IOException error) 
		{	
			error.printStackTrace();
		}
			
		
		finally 
		{
			
		}

	}

}
