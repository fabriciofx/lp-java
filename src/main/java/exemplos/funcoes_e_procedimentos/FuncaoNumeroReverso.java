package exemplos.funcoes_e_procedimentos;

import javax.swing.JOptionPane;

public class FuncaoNumeroReverso {
	public static int numeroReverso(int n) {
		int reverso = 0;
		int mult = 1;
		int n2 = n;

		while (n2 >= 10) {
			n2 = n2 / 10;
			mult = mult * 10;
		}

		while (n > 0) {
			reverso = reverso + ((n % 10) * mult);
			n = n / 10;
			mult = mult / 10;
		}

		return reverso;
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane
				.showInputDialog("Digite um número"));
		JOptionPane.showMessageDialog(null, numeroReverso(n));
	}
}
