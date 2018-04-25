import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
	double num;
	num = Double.parseDouble(JOptionPane.showInputDialog("Coloque un numero"));
	
	for (int i = 2; i < num; i++) {
		
		if(num % i == 0)
		{
			JOptionPane.showMessageDialog(null, "Es un numero primo, es divisible al menos por el numero: " +i);
			System.exit(0);
		}
		
		else
		{
			System.out.println("No es divisible por: " + i);
		}
	}
	
		JOptionPane.showMessageDialog(null, "No es un numero primo");
	
	}

}
