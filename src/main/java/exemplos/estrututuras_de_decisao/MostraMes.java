package exemplos.estrututuras_de_decisao;

import javax.swing.JOptionPane;

public class MostraMes {
	public static void main(String[] args) {
		int mes;

		mes = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o número do mês"));

		switch (mes) {
		case 1:
			JOptionPane.showMessageDialog(null, "JAN");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "FEV");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "MAR");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "ABR");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "MAI");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "JUN");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "JUL");
			break;
		case 8:
			JOptionPane.showMessageDialog(null, "AGO");
			break;
		case 9:
			JOptionPane.showMessageDialog(null, "SET");
			break;
		case 10:
			JOptionPane.showMessageDialog(null, "OUT");
			break;
		case 11:
			JOptionPane.showMessageDialog(null, "NOV");
			break;
		case 12:
			JOptionPane.showMessageDialog(null, "DEZ");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Mês inválido!");
		}
	}
}
