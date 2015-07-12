package exemplos.funcoes_e_procedimentos;

import javax.swing.JOptionPane;

public class NumeroPrimoEntreDoisNumerosComFuncao2 {
	public static boolean ehPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número inicial"));
		b = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número final"));
		String r = "";

		for (int n = a; n <= b; n++) {
			if (ehPrimo(n)) {
				r = r + n + " ";
			}
		}

		JOptionPane.showMessageDialog(null, r);
	}
}
