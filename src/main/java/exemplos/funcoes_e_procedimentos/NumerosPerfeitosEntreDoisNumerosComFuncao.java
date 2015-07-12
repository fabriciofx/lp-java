package exemplos.funcoes_e_procedimentos;

import javax.swing.JOptionPane;

public class NumerosPerfeitosEntreDoisNumerosComFuncao {
	public static String procuraNumerosPerfeitos(int k, int z) {
		String r = "";

		for (int n = k; n <= z; n++) {
			if (ehPerfeito(n)) {
				r = r + n + " ";
			}
		}

		return r;
	}

	public static boolean ehPerfeito(int n) {
		int soma = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				soma = soma + i;
			}
		}

		if (n == soma) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número inicial"));
		b = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o número final"));

		JOptionPane.showMessageDialog(null, procuraNumerosPerfeitos(a, b));
	}
}
