import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String texto;
		
		Object[] botones = { "minuscula", "MAYUSCULA"};
		
		texto = JOptionPane.showInputDialog("Inserte un texto");
		
		int decision = JOptionPane.showOptionDialog(null, 
									"¿Desea que sea todo minuscula o mayuscula?", 
									"Decision", 
									JOptionPane.YES_NO_CANCEL_OPTION, 
									JOptionPane.QUESTION_MESSAGE, 
									null,
									botones,
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
