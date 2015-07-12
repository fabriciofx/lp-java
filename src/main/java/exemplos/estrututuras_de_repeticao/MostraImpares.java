package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class MostraImpares {
	public static void main(String[] args) {
		for (int c = 1; c <= 10; c++) {
			if (c % 2 != 0) {
				JOptionPane.showMessageDialog(null, c);
			}
		}
	}
}
