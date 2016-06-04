package exemplos.array;

import java.util.Arrays;

public class ConcatenaDoisArrays {
	public static void main(String[] args) {
		int[] array1 = {4, 1, 7, 5, 9};
		int[] array2 = {0, 2, 1, 7, 8, 5};
		int tam = array1.length + array2.length;
		int[] concatenado = new int[tam];
		
		for (int i = 0; i < tam; i++) {
			if (i < array1.length)
				concatenado[i] = array1[i];
			else
				concatenado[i] = array2[i - array1.length];
		}
		
		System.out.println(Arrays.toString(concatenado));
	}
}
