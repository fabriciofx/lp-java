package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class MostraParesNoIntervalo {
	public static void main(String[] args) {
		int a, b;

		a = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor inicial"));
		b = Integer.parseInt(JOptionPane
				.showInputDialog("Digite o valor final"));
		String r = "";

		for (int c = a; c <= b; c++) {
			if (c % 2 == 0) {
				r = r + " " + c;
			}
		}

		JOptionPane.showMessageDialog(null, r);
	}
}
