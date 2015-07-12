package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		int opcao;
		double n1, n2;

		do {
			opcao = Integer.parseInt(JOptionPane
					.showInputDialog("Escolha a opção:\n" + "1) Somar\n"
							+ "2) Subtrair\n" + "3) Multiplicar\n"
							+ "4) Dividir\n" + "0) Sair"));
			switch (opcao) {
			case 1:
				n1 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 1"));
				n2 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 2"));
				JOptionPane.showMessageDialog(null, (n1 + n2));
				break;
			case 2:
				n1 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 1"));
				n2 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 2"));
				JOptionPane.showMessageDialog(null, (n1 - n2));
				break;
			case 3:
				n1 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 1"));
				n2 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 2"));
				JOptionPane.showMessageDialog(null, (n1 * n2));
				break;
			case 4:
				n1 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 1"));
				n2 = Double
						.parseDouble(JOptionPane.showInputDialog("Número 2"));

				if (n2 == 0) {
					JOptionPane.showMessageDialog(null,
							"Não dividirás por zero!");
				} else {
					JOptionPane.showMessageDialog(null, (n1 / n2));
				}
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (opcao != 0);
	}
}
