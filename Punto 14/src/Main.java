import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor de a"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor de b"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el valor de c"));
	
		Ecuacion_Segundo_Grado Ecu = new Ecuacion_Segundo_Grado();
		
		System.out.println("El valor 1 es: "+ Ecu.Second_Grade1 (a,b,c));
		System.out.println("El valor 2 es: "+ Ecu.Second_Grade2 (a,b,c));
		
	}

}
