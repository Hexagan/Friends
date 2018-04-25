import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		int cant_ventas=0, z=0;
		
		cant_ventas = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de ventas"));
		
		String[] descripcion= new String[cant_ventas];
		
		for (z = 0; z < cant_ventas; z++)  {
			
			descripcion[z] = JOptionPane.showInputDialog(null,"Ingrese descripcion del producto " +z);
		}
		
		System.out.println("Las ventas introducidas fueron: ");
		
		for (z = 0; z < cant_ventas; z++) {
			
			System.out.println("Numero "+ ++z +" " + descripcion[z]);
			
		}

	}

}
