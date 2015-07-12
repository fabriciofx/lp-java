package exemplos.estrututuras_de_decisao;

import javax.swing.JOptionPane;

public class MostraDiaMes {
	public static void main(String[] args) {
		int mes;

		mes = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o número do mês"));

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			JOptionPane.showMessageDialog(null, "31");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "29");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			JOptionPane.showMessageDialog(null, "30");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Mês inválido!");
		}
	}
}
