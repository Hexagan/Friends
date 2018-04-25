import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double ex= 2;
		double radio;
		
		System.out.println("Ingrese el radio del circulo: ");
	
		Scanner scan = new Scanner(System.in);
		
		radio=scan.nextDouble();
		
		System.out.println("Ud ingresó: " + radio);
		
		double area = (Math.PI * Math.pow(radio, ex));
		
		JOptionPane.showMessageDialog(null, "El area es " + area);
		
		scan.close();
	}

}
