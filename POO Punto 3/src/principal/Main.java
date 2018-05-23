package principal;

import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JDialog;

public class Main {

	public static void main(String[] args) {
		
		
		String opcInicial = "Agregar Contacto";	
		JDialog.setDefaultLookAndFeelDecorated(true);
		Object[] selecciones = {"Agregar Contacto", "Buscar Contacto", "Buscar Contacto Por Telefono", "Cargar Contactos", "Eliminar Contacto", "Existe Contacto", "Guardar Contactos", "Listar Contactos"};
		Object decision = JOptionPane.showInputDialog(null, 
									"Por favor elija la opcion que desea ejecutar: ", 
									"Bienvenido", 
									JOptionPane.QUESTION_MESSAGE, 
									null,
									selecciones,
									opcInicial);
		
		System.out.println(decision + "\n");
		
		try {
		
	
		File contactos = new File("archivos\\contactos.txt");
		BufferedReader br = new BufferedReader(new FileReader(contactos));
		BufferedWriter bw = new BufferedWriter(new FileWriter(contactos,true));
		br.mark(10000);
		
		switch(String.valueOf(decision)) {
		
		case "Agregar Contacto":
			
		br.reset();
		
		AgregarContacto ag = new AgregarContacto();
		ag.agregarContacto(br,bw);
	
		br.reset();
		
		break;
	
		case "Buscar Contacto":
			
		br.reset();
		
		BuscaContacto bc = new BuscaContacto();
		bc.buscaContacto(br);
			
		break;
	
		case "Buscar Contacto Por Telefono":
		br.reset();
		
		BuscaContactoPorTelefono bcpt = new BuscaContactoPorTelefono();
		bcpt.buscacontactoportelefono(br);
		
		br.reset();	
		break;
		
		case "Cargar Contactos": //Comprendo este case como cargar contactos en respaldo
			
		br.reset();
		
		CargarContactos cc = new CargarContactos();
		cc.cargarcontactos(br);
		
		br.reset();
		
		break;		
		
		case "Eliminar Contacto":
		br.reset();
		
		EliminarContacto ec = new EliminarContacto();
		ec.eliminarcontacto(br,contactos);
		
		br.reset();
		
		break;
		
		case "Existe Contacto":
		br.reset();
		
		ExisteContacto exc = new ExisteContacto();
		exc.existecontacto(br);
		
		br.reset();	
		break;
		
		case "Guardar Contactos":
		br.reset();
		
		GuardarContactos gc = new GuardarContactos();
		gc.guardarcontactos(br);
		
		br.reset();	
		break;
		
		case "Listar Contactos":
			
		ListarContactos lc = new ListarContactos();
		lc.listarcontactos(br);
		
		br.reset();	
		break;
		
		default:
		
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error extraño en la seleccion de opciones, vuelvalo a intentar");
			
		break;
		
		} //Finaliza el switch
		
		} catch(IOException error) {
			error.printStackTrace();
			}
	}
}



