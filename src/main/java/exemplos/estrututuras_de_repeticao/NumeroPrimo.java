package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class NumeroPrimo {
	public static void main(String[] args) {
		boolean ehPrimo;
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		ehPrimo = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				ehPrimo = false;
				break;
			}
		}

		if (ehPrimo) {
			JOptionPane.showMessageDialog(null, n + " é primo!");
		} else {
			JOptionPane.showMessageDialog(null, n + " não é primo!");
		}
	}
}
