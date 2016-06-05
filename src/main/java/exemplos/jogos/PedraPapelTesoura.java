package exemplos.jogos;

import java.util.Random;

import javax.swing.JOptionPane;

public class PedraPapelTesoura {
	public static void main(String[] args) {
		int j1, j2;
		int PEDRA = 0, PAPEL = 1, TESOURA = 2;
		String jogada1 = "", jogada2 = "";
		String resultado;

		j1 = Integer
				.parseInt(JOptionPane
						.showInputDialog("Informe a jogada\n\n0) Pedra\n1) Papel\n2) Tesoura"));

		j2 = new Random().nextInt(3);

		if (j1 == PEDRA) {
			jogada1 = "PEDRA";
		} else if (j1 == PAPEL) {
			jogada1 = "PAPEL";
		} else if (j1 == TESOURA) {
			jogada1 = "TESOURA";
		}

		if (j2 == PEDRA) {
			jogada2 = "PEDRA";
		} else if (j2 == PAPEL) {
			jogada2 = "PAPEL";
		} else if (j2 == TESOURA) {
			jogada2 = "TESOURA";
		}

		resultado = "Você jogou " + jogada1 + " e o computador jogou "
				+ jogada2;

		if (j1 == j2) {
			JOptionPane.showMessageDialog(null, "Empate!\n" + resultado);
		} else if (j1 == PEDRA && j2 == PAPEL) {
			JOptionPane.showMessageDialog(null, "O computador venceu!\n"
					+ resultado);
		} else if (j1 == PEDRA && j2 == TESOURA) {
			JOptionPane.showMessageDialog(null, "Você venceu!\n" + resultado);
		} else if (j1 == PAPEL && j2 == PEDRA) {
			JOptionPane.showMessageDialog(null, "Você venceu!\n" + resultado);
		} else if (j1 == PAPEL && j2 == TESOURA) {
			JOptionPane.showMessageDialog(null, "O computador venceu!\n"
					+ resultado);
		} else if (j1 == TESOURA && j2 == PAPEL) {
			JOptionPane.showMessageDialog(null, "Você venceu!\n" + resultado);
		} else if (j1 == TESOURA && j2 == PEDRA) {
			JOptionPane.showMessageDialog(null, "O computador venceu!\n"
					+ resultado);
		}
	}
}
