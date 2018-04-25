import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		String titulo1 = "La bella y graciosa moza marchose a lavar la ropa";
		String titulo2 = "La bella y graciosa moza marchose a lavar la ropa, la mojó en el arroyuelo y cantando la lavó, la frotó sobre una piedra, la colgó de un abedul";
		
		JOptionPane.showMessageDialog(null, "El titulo 1 resulta en: " + titulo1.replace('a','e'));
		JOptionPane.showMessageDialog(null, "El titulo 2 resulta en: " + titulo2.replace('a','e'));
		
	}
}
