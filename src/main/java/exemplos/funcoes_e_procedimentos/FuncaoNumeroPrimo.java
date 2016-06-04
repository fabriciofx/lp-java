package exemplos.funcoes_e_procedimentos;

import javax.swing.JOptionPane;

public class FuncaoNumeroPrimo {
	public static boolean ehPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		if (ehPrimo(n)) {
			JOptionPane.showMessageDialog(null, n + " é primo!");
		} else {
			JOptionPane.showMessageDialog(null, n + " não é primo!");
		}
	}
}
