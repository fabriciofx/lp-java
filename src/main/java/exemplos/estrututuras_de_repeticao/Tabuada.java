package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class Tabuada {
	public static void main(String[] args) {
		int n;
		String tabuada = "";

		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

		for (int i = 1; i <= 10; i++) {
			tabuada = tabuada + n + " x " + i + " = " + (i * n) + "\n";
		}

		JOptionPane.showMessageDialog(null, tabuada);
	}
}
