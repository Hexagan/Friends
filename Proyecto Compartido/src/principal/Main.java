package principal;

import javax.swing.JOptionPane;

public class Main { //La idea es realizar un programa que con una cadena de texto dada, de la opcion al usuario de transformarlo todo en minuscula o mayuscula

	public static void main(String[] args) {
		
		String texto;
		int decision;
		
		texto = JOptionPane.showInputDialog("Inserte un texto");
		
		decision = JOptionPane.showOptionDialog(null, 
				"¿Desea que sea todo minuscula o mayuscula?", 
				"Decision", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.QUESTION_MESSAGE, 
				null,
				null,
				null);
		
		if(decision == 0)
		{
			texto = texto.toLowerCase();	
		}
		
		else
		{
			texto = texto.toUpperCase();	
		}
		
		JOptionPane.showMessageDialog(null, 
				texto, 
				"Cadena Resultante", 
				JOptionPane.INFORMATION_MESSAGE);
	
	}

}
