package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class TresNMaisUm {
	public static void main(String[] args) {
		int n, passos;
		
		n = Integer.parseInt(JOptionPane
			.showInputDialog(null, "Digite um número"));
		
		passos = 1;
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = n * 3 + 1;
			}
			passos++;
		}
		
		JOptionPane.showMessageDialog(null, "Passos: " + passos);
	}
}
