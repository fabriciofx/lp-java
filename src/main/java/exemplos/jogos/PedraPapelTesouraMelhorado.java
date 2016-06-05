package exemplos.jogos;

import java.util.Random;

import javax.swing.JOptionPane;

public class PedraPapelTesouraMelhorado {
	public static void main(String[] args) {
		int j1, j2;
		final int PEDRA = 0, PAPEL = 1, TESOURA = 2;
		String jogada1 = "", jogada2 = "";
		String resultado;
		int placarJogador = 0, placarComputador = 0, empate = 0;

		for (int i = 0; i < 3; i++) {
			j1 = Integer
					.parseInt(JOptionPane
							.showInputDialog("Informe a jogada\n\n0) Pedra\n1) Papel\n2) Tesoura"));

			j2 = new Random().nextInt(3);

			switch (j1) {
			case PEDRA:
				jogada1 = "PEDRA";
				break;
			case PAPEL:
				jogada1 = "PAPEL";
				break;
			case TESOURA:
				jogada1 = "TESOURA";
				break;
			}

			switch (j2) {
			case PEDRA:
				jogada2 = "PEDRA";
				break;
			case PAPEL:
				jogada2 = "PAPEL";
				break;
			case TESOURA:
				jogada2 = "TESOURA";
				break;
			}

			resultado = "Você jogou " + jogada1 + " e o computador jogou "
					+ jogada2;

			switch (j1) {
			case PEDRA:
				switch (j2) {
				case PEDRA:
					JOptionPane
							.showMessageDialog(null, "Empate!\n" + resultado);
					empate++;
					break;
				case PAPEL:
					JOptionPane.showMessageDialog(null,
							"O computador venceu!\n" + resultado);
					placarComputador++;
					break;
				case TESOURA:
					JOptionPane.showMessageDialog(null, "Você venceu!\n"
							+ resultado);
					placarJogador++;
					break;
				}
				break;
			case PAPEL:
				switch (j2) {
				case PEDRA:
					JOptionPane.showMessageDialog(null, "Você venceu!\n"
							+ resultado);
					placarJogador++;
					break;
				case PAPEL:
					JOptionPane
							.showMessageDialog(null, "Empate!\n" + resultado);
					empate++;
					break;
				case TESOURA:
					JOptionPane.showMessageDialog(null,
							"O computador venceu!\n" + resultado);
					placarComputador++;
					break;
				}
				break;
			case TESOURA:
				switch (j2) {
				case PEDRA:
					JOptionPane.showMessageDialog(null,
							"O computador venceu!\n" + resultado);
					placarComputador++;
					break;
				case PAPEL:
					JOptionPane.showMessageDialog(null, "Você venceu!\n"
							+ resultado);
					placarJogador++;
					break;
				case TESOURA:
					JOptionPane
							.showMessageDialog(null, "Empate!\n" + resultado);
					empate++;
					break;
				}
				break;
			}
		}

		JOptionPane.showMessageDialog(null, "Placar:\nJogador: "
				+ placarJogador + "\nComputador:" + placarComputador
				+ "\nEmpates: " + empate);
	}
}
