package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class Potencia {
	public static void main(String[] args) {
		int x, n, r = 1;

		x = Integer.parseInt(JOptionPane.showInputDialog("Digite a base"));
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente"));

		if (x == 0 && n == 0) {
			JOptionPane.showMessageDialog(null, "Indeterminação");
		} else {
			for (int i = 0; i < n; i++) {
				r = r * x;
			}

			JOptionPane.showMessageDialog(null, r);
		}
	}
}
