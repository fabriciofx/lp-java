package exemplos.sequencial;

import javax.swing.JOptionPane;

public class PedeEMostraNome {
	public static void main(String[] args) {
		String nome;

		nome = JOptionPane.showInputDialog("Digite o seu nome");
		JOptionPane.showMessageDialog(null, "oi, " + nome + "!");
	}
}
