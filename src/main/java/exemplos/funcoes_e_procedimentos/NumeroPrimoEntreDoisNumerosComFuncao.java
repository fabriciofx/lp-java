package exemplos.funcoes_e_procedimentos;

import javax.swing.JOptionPane;

public class NumeroPrimoEntreDoisNumerosComFuncao {
	public static String procuraNumerosPrimos(int k, int z) {
		String r = "";

		for (int n = k; n <= z; n++) {
			if (ehPrimo(n)) {
				r = r + n + " ";
			}
		}

		return r;
	}

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

		JOptionPane.showMessageDialog(null, procuraNumerosPrimos(a, b));
	}
}
