package exemplos.estrututuras_de_repeticao;

public class NumerosPerfeitos {
	public static void main(String[] args) throws InterruptedException {
		for (long n = 1; n < Long.MAX_VALUE; n++) {
			long soma = 0;

			for (long i = 1; i < n; i++) {
				if (n % i == 0) {
					soma = soma + i;
				}
			}

			if (soma == n) {
				System.out.println("[" + n + "]");
			}
		}
	}
}
