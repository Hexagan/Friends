import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String titulo1 = "La bella y graciosa moza marchose a lavar la ropa";
		String titulo2 = "La bella y graciosa moza marchose a lavar la ropa, la moj� en el arroyuelo y cantando la lav�, la frot� sobre una piedra, la colg� de un abedul";
		
		JOptionPane.showMessageDialog(null, "El titulo 1 resulta en: " + titulo1.replace('a','e'));
		JOptionPane.showMessageDialog(null, "El titulo 2 resulta en: " + titulo2.replace('a','e'));
		
	}
}
