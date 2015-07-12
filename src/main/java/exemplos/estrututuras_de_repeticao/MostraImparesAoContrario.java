package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class MostraImparesAoContrario {
	public static void main(String[] args) {
		for (int c = 10; c >= 1; c--) {
			if (c % 2 != 0) {
				JOptionPane.showMessageDialog(null, c);
			}
		}
	}
}
