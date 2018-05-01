package principal;

import javax.swing.JOptionPane; //Se importa la librería JOptionPane, que sirve para mostrar cuadros de diálogo y selección

public class Main { //La idea es realizar un programa que con una cadena de texto dada, de la opcion al usuario de transformarlo todo en minuscula o mayuscula

	public static void main(String[] args) {
		
		String texto;		//Se crea variable del tipo string con nombre "texto"
		int decision;		//Se crea variable del tipo entero con nombre "decision"
		
		Object[] botones = { "minuscula", "MAYUSCULA"};  //Se crea un objeto "botones" para definir que palabras se mostrarán en el entorno gráfico del cuadro de selección
		
		texto = JOptionPane.showInputDialog("Inserte un texto"); //Cuadro de diálogo para que el usuario coloque un texto
		
		decision = JOptionPane.showOptionDialog(null, 		  //Creacion de un cuadro de selección de opciones, el resultado se guarda en el entero "decision"
				"¿Desea que sea todo minuscula o mayuscula?", //Mensaje del cuadro
				"Decision", 								  //Título del cuadro
				JOptionPane.YES_NO_CANCEL_OPTION, 			  //Tipo de cuadro
				JOptionPane.QUESTION_MESSAGE, 				  //Tipo de mensaje
				null,										  //Icono predeterminado, no se necesita
				botones,									  //Diseño de opciones o botones
				null);										  //Valor predeterminado, no es necesario
		
		if(decision == 0)									//Si el usuario elige minúscula
		{
			texto = texto.toLowerCase();					//El texto se vuelve minúscula
		}
		
		else												//sino
		{
			texto = texto.toUpperCase();					//Se vuelve mayúscula
		}
		
		JOptionPane.showMessageDialog(null, 				//Muestra cadena resultante
				texto, 										//Nombre del String en que se guarda
				"Cadena Resultante", 						//Título del cuadro
				JOptionPane.INFORMATION_MESSAGE);			//Tipo de mensaje
	
	}

}
