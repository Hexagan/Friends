import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int num_a;
		int num_b;
		int number;
		int coincide = 0;
		int j,i;
		
	
		do 
		{
			num_a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor a, debe ser menor que b"));
			num_b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor b, debe ser mayor que a"));
			
		}while(num_b < num_a);
		
		if(num_a <= 2 )
		{
			JOptionPane.showMessageDialog(null, "Los numeros menores o iguales a 2 no son primos");
		}
		
		else {
			
	
		number = num_a;
		
		for (i = 2; number <= num_b; i++) {
			for (j = 2; j < number; j++) {
	
				if(number % j == 0) {
					JOptionPane.showMessageDialog(null,"El numero: " +number + " es primo ya que es divisible por: " +j);
					coincide ++ ;
				}
				
				else {
					System.out.println("El numero: " +number + " no es divisible por: " +j);
				}
			}
			System.out.println("Seccion completada, se pasara a hacer pruebas con el numero: " + (number + 1) + " iteracion: " + (i-1));
			number++;	
		}
		
		if(coincide == 0) {
			JOptionPane.showMessageDialog(null, "No se encontraron primos en ese rango");
		}
		
		}
	}
}