import javax.swing.JOptionPane;
import java.lang.Math;

public class Main {

	public static void main(String[] args) {
	
		double min;
		double max;
		
		do {
			
			min = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero minimo"));
			max = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero maximo"));
			
		}while(min>max);
	
	int rango = (int) max - (int) min;
	
	for(int i=0;i<10;i++)
	{
		System.out.println(Math.random() * rango + min);
	}
	
	}
}