# 1. Funções e Procedimentos

Neste capítulo, estudaremos como modularizar os nossos programas, criando nossas
próprias instruções.


## 1.1 Motivação

Veja o programa abaixo. Ele exibe um menu com as seguintes funcionalidades:
1) Calcular a média; 2) Verificar aprovação; 3) Pontuação mínima para a final;
0) Sair.

```java
public class Menu {
	public static void main(String[] args) {
		double nota1, nota2, media, notaFinal;
		int opcao;

		do {
			opcao = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a opção:\n"
							+ "1) Calcular a média\n"
							+ "2) Verificar aprovação\n"
							+ "3) Pontuação mínima para a final\n"
							+ "0) Sair\n"));
			switch (opcao) {
			case 1:
				nota1 = Double.parseDouble(JOptionPane
						.showInputDialog("Digite a 1a nota"));
				nota2 = Double.parseDouble(JOptionPane
						.showInputDialog("Digite a 2a nota"));
				media = (nota1 + nota2) / 2;
				JOptionPane.showMessageDialog(null, "Média: " + media);
				break;
			case 2:
				nota1 = Double.parseDouble(JOptionPane
						.showInputDialog("Digite a 1a nota"));
				nota2 = Double.parseDouble(JOptionPane
						.showInputDialog("Digite a 2a nota"));
				media = (nota1 + nota2) / 2;

				if (media >= 6.0) {
					JOptionPane.showMessageDialog(null,
							"O estudante está aprovado");
				} else {
					JOptionPane.showMessageDialog(null,
							"O estudante está reprovado");
				}
				break;
			case 3:
				nota1 = Double.parseDouble(JOptionPane
						.showInputDialog("Digite a 1a nota"));
				nota2 = Double.parseDouble(JOptionPane
						.showInputDialog("Digite a 2a nota"));
				media = (nota1 + nota2) / 2;
				notaFinal = 12 - media;
				JOptionPane.showMessageDialog(null,
						"Sua nota mínima na final deverá ser " + notaFinal);
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (opcao != 0);
	}
}
```
Observe, no código acima, as instruções que estão em `case 1:`, `case 2:` e em
`case 3:`. Viu alguma semelhança entre elas? Não? Olhe de novo, observando agora
se há instruções que se repetem. Se você foi atencioso, notou que há uma
repetição nas instruções abaixo:

```java
nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota"));
nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2a nota"));
media = (nota1 + nota2) / 2;
```
que vão solicitar as notas do usuário e calcular a média destas notas.

Agora, imagine que a escola onde este estudante estuda, mudou a forma de
avaliação e agora são utilizadas três notas, ao invés de duas, para calcular a
média. Você teria então que alterar o código de cálculo da média TRÊS VEZES: no
`case 1:`, `case 2:` e no `case 3:`. Ficando assim:

```java
nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota"));
nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2a nota"));
nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3a nota"));
media = (nota1 + nota2 + nota3) / 3;
```

Mas, imagino aqui se você estaria se perguntando se seria possível evitar a
repetição destas instruções, já que elas fazem a mesma coisa. E a resposta para
isto é o conceito de **função**.


## 1.2 Definição

Segundo a [Wikipedia][1]:

> Uma **função** consiste em uma porção de código que resolve um problema muito
específico, parte de um problema maior (a aplicação final). Uma função
geralmente "recebe" dados, processa estes dados e "retorna" o resultado deste
processamento.

Já um **procedimento** é uma função que não "retorna" nenhum resultado.


## 1.3 Sintaxe

A construção de uma função obedece a seguinte sintaxe:

```java
public static TipoDoRetorno identificador(Tipo1 param1, Tipo2 param2, ..., TipoN paramN) {
  Instrução1;
  Instrução2;
  ...
  InstruçãoN;
}
```
Já a construção de um procedimento, obedece a seguinte sintaxe:

```java
public static void identificador(Tipo1 param1, Tipo2 param2, ..., TipoN paramN) {
  Instrução1;
  Instrução2;
  ...
  InstruçãoN;  
}
```

## 1.4 Aplicando o Conceito de Função na Motivação

Agora que conhecemos a motivação, definição e sintaxe de uma função, podemos
reescrever o programa apresentado na [Motivação](#11-motivação).

Primeiramente, vamos escrever uma função, na qual chamaremos de
`calculaMedia()`, que deverá solicitar ao usuário as duas notas e retorna a
média destas notas. Depois vamos substituir as instruções pela função recém
criada, ficando assim:

```java
public class MenuComFuncao {
	public static double calculaMedia() {
		double nota1, nota2, media;

		nota1 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a 1a nota"));
		nota2 = Double.parseDouble(JOptionPane
				.showInputDialog("Digite a 2a nota"));
		media = (nota1 + nota2) / 2;

		return media;
	}

	public static void main(String[] args) {
		double media, notaFinal;
		int opcao;

		do {
			opcao = Integer.parseInt(JOptionPane
					.showInputDialog("Digite a opção:\n"
							+ "1) Calcular a média\n"
							+ "2) Verificar aprovação\n"
							+ "3) Pontuação mínima para a final\n"
							+ "0) Sair\n"));
			switch (opcao) {
			case 1:
				media = calculaMedia();
				JOptionPane.showMessageDialog(null, "Média: " + media);
				break;
			case 2:
				media = calculaMedia();

				if (media >= 6.0) {
					JOptionPane.showMessageDialog(null,
							"O estudante está aprovado");
				} else {
					JOptionPane.showMessageDialog(null,
							"O estudante está reprovado");
				}
				break;
			case 3:
				media = calculaMedia();
				notaFinal = 12 - media;
				JOptionPane.showMessageDialog(null,
						"Sua nota mínima na final deverá ser " + notaFinal);
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		} while (opcao != 0);
	}
}
```


## 1.5 Vantagens e Desvantagens

A utilização de funções ou procedimentos em programas traz diversas vantagens e
desvantagens, a saber:

### Vantagens

* Melhora a manutenabilidade do programa
  * diminui a quantidade de código duplicado;
  * divide o programa em partes menores, que são mais fáceis de entender;
  * esconde os detalhes de implementação;
  * ao se efetuar alguma melhoria (inclusive correções) na função, esta mudança
  é propagada para todo(s) o(s) programa(s);
  * pode ser reaproveitada em outras partes e em outros programas;
* Menor utilização da memória RAM
  * o programa em si é menor;
  * as variáveis são reutilizadas (variáveis locais);
* Possibilidade de utilizar *funções recursivas*, que facilitam a escrita de
certos algoritmos.

### Desvantagens

* Ter que aprender para que serve as novas instruções;
  * a utilização de novas funções acabam gerando quase uma nova "linguagem";
  * mas, se bem utilizado, pode ser bom!
* As chamadas das funções podem introduzir maior complexidade ao código;
  * uma função, que chama outra função, que chama outra função, que chama...
* Consome mais recursos (CPU e memória RAM).



## 1.6 Exercícios

1. [FuncaoMaiorDe2] Desenvolva um programa que contenha uma função que receba
dois números inteiros como parâmetro e retorne o maior dos dois números. A
seguir, desenvolva um código na função `main()` que solicite que o usuário
informe dois números inteiros, passe estes números para a função e mostre na
tela se o número informado é o maior dos dois.

2. [FuncaoEhPar] Desenvolva um programa que contenha uma função que receba um
número inteiro como parâmetro e retorne `true` se o número for par ou `false` se
o número for ímpar. A seguir, desenvolva um código na função `main()` que
solicite que o usuário informe um número inteiro, passe este número para a
função e mostre na tela se o número informado é par ou ímpar.

3. [FuncaoSomaTresNumeros] Desenvolva um programa que contenha uma função que
receba três números inteiros como parâmetros e retorne a soma destes três
números. Depois desenvolva um código na função `main()` que solicite que o
usuário informe três números inteiros, passe estes números para a função e
mostre na tela o resultado obtido com a função criada.

5. [FuncaoPositivoNegativoZero] Desenvolva um programa que contenha uma função
que receba um número inteiro como parâmetro e retorne o caractere 'P' se o
número passado for positivo, 'N' se for negativo e 'O' se for zero. A seguir,
desenvolva um código na função `main()` que solicite que o usuário informe um
número inteiro, passe este número para a função e mostre na tela o resultado
obtido com a função criada.

4. [FuncaoMaiorDe3] Desenvolva um programa que contenha uma função que receba
três números inteiros como parâmetro e retorne o maior dos três números. A
seguir, desenvolva um código na função `main()` que solicite que o usuário
informe três números inteiros, passe estes números para a função e mostre na
tela se o número informado é o maior dos três.

6. [FuncaoEhPrimo] Um número natural é dito *primo* se este possui apenas dois
divisores diferentes: o 1 e ele mesmo. De posse desta informação, desenvolva um
programa que contenha uma função que receba um número inteiro como parâmetro e
retorne `true` se o número for primo ou `false` se o número não for primo. A
seguir, desenvolva um código na função `main()` que solicite que o usuário
informe um número inteiro, passe este número para a função e mostre na tela se o
número informado é primo ou não.

7. [FuncaoContaDigitos] Desenvolva um programa que contenha uma função que
receba um número inteiro como parâmetro e retorne a quantidade de dígitos deste
número. Por exemplo, se for passado o número 1243 para esta função, ela deve
retornar 4. A seguir, desenvolva um código na função `main()` que solicite que o
usuário informe um número inteiro, passe este número para a função e mostre na
tela se a quantidade de dígitos confere com o número informado.

8. [FuncaoNumeroReverso] Desenvolva um programa que contenha uma função que
receba um número inteiro como parâmetro e retorne o *inverso* do número passado.
Por exemplo, se for passado o número 123 para a função, esta deve retornar o
valor 321. A seguir, desenvolva um código na função `main()` que solicite que o
usuário informe um número inteiro, passe este número para a função e mostre na
tela se o número informado é invertido corretamente.

9. [FuncaoFatorial] Um número natural *n*, representado por *n!*, é definido
como o produto de todos os inteiros positivos menores ou iguais a *n*. Por
exemplo, 5! = 5 . 4 . 3 . 2 . 1. Além disso, também por definição, 0! = 1. De
posse destas informações, desenvolva uma função que receba como parâmetro um
número inteiro *n* e retorne como resposta o fatorial deste número. A seguir,
desenvolva um código na função `main()` que solicite que o usuário informe um
número inteiro, passe este número para a função e mostre na tela o resultado.


## 1.7 Referências

[1]: https://pt.wikipedia.org/wiki/Sub-rotina "Wikipedia"
