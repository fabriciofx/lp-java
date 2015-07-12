package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class JogadaValida {
	public static void main(String[] args) {
		int jogada;

		do {
			jogada = Integer.parseInt(JOptionPane
					.showInputDialog("1-P, 2-T, 3-Pa"));
		} while (jogada < 1 || jogada > 3);

		JOptionPane.showMessageDialog(null, "Você jogou " + jogada);
	}
}
