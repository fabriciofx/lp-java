package exemplos.operadores;

import javax.swing.JOptionPane;

public class IncrementoDecremento {
	public static void main(String[] args) {
		int a = 2, b = 3, c = 6, d = -1, e = 4, f = 5;

		JOptionPane.showMessageDialog(null, "a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + ", e=" + e + ", f=" + f);
		a = c++ * --d - 5 + f;
		JOptionPane.showMessageDialog(null, "i) a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + ", e=" + e + ", f=" + f);
		b = ++a * f++ / 2 + d--;
		JOptionPane.showMessageDialog(null, "ii) a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + ", e=" + e + ", f=" + f);
		c = -d + a++ - --b + f;
		JOptionPane.showMessageDialog(null, "iii) a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + ", e=" + e + ", f=" + f);
		d = f + 5 / a++ * 2;
		JOptionPane.showMessageDialog(null, "iv) a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + ", e=" + e + ", f=" + f);
	}
}
