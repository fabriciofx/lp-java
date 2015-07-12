package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {
		int opcao;
		double n1, n2, media, nf;

		do {
			opcao = Integer.parseInt(JOptionPane
					.showInputDialog("Escolha uma opção:\n\n"
							+ "1) Calcula média\n" + "2)Calcula nota final\n"
							+ "3)Verifica aprovação\n" + "\n0)Sair"));
			switch (opcao) {
			case 1:
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
				media = (n1 + n2) / 2;
				JOptionPane.showMessageDialog(null, media);
				break;
			case 2:
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
				media = (n1 + n2) / 2;
				nf = 12 - media;
				JOptionPane.showMessageDialog(null, "Nota mínima na final: "
						+ nf);
				break;
			case 3:
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
				media = (n1 + n2) / 2;
				if (media >= 6.0) {
					JOptionPane.showMessageDialog(null, "Aprovado");
				} else {
					JOptionPane.showMessageDialog(null, "Reprovado");
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
