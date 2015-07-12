package exemplos.estrututuras_de_repeticao;

import javax.swing.JOptionPane;

public class TabuadaCompleta {
	public static void main(String[] args) {
		String tabuada = "";

		for (int n = 1; n <= 10; n++) {
			for (int i = 1; i <= 10; i++) {
				tabuada = tabuada + n + " x " + i + " = " + (i * n) + "   ";
			}

			tabuada = tabuada + "\n";
		}

		JOptionPane.showMessageDialog(null, tabuada);
	}
}
