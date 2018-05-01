package principal;

import javax.swing.JOptionPane; //Se importa la librer�a JOptionPane, que sirve para mostrar cuadros de di�logo y selecci�n

public class Main { //La idea es realizar un programa que con una cadena de texto dada, de la opcion al usuario de transformarlo todo en minuscula o mayuscula

	public static void main(String[] args) {
		
		String texto;		//Se crea variable del tipo string con nombre "texto"
		int decision;		//Se crea variable del tipo entero con nombre "decision"
		
		Object[] botones = { "minuscula", "MAYUSCULA"};  //Se crea un objeto "botones" para definir que palabras se mostrar�n en el entorno gr�fico del cuadro de selecci�n
		
		texto = JOptionPane.showInputDialog("Inserte un texto"); //Cuadro de di�logo para que el usuario coloque un texto
		
		decision = JOptionPane.showOptionDialog(null, 		  //Creacion de un cuadro de selecci�n de opciones, el resultado se guarda en el entero "decision"
				"�Desea que sea todo minuscula o mayuscula?", //Mensaje del cuadro
				"Decision", 								  //T�tulo del cuadro
				JOptionPane.YES_NO_CANCEL_OPTION, 			  //Tipo de cuadro
				JOptionPane.QUESTION_MESSAGE, 				  //Tipo de mensaje
				null,										  //Icono predeterminado, no se necesita
				botones,									  //Dise�o de opciones o botones
				null);										  //Valor predeterminado, no es necesario
		
		if(decision == 0)									//Si el usuario elige min�scula
		{
			texto = texto.toLowerCase();					//El texto se vuelve min�scula
		}
		
		else												//sino
		{
			texto = texto.toUpperCase();					//Se vuelve may�scula
		}
		
		JOptionPane.showMessageDialog(null, 				//Muestra cadena resultante
				texto, 										//Nombre del String en que se guarda
				"Cadena Resultante", 						//T�tulo del cuadro
				JOptionPane.INFORMATION_MESSAGE);			//Tipo de mensaje
	
	}

}
