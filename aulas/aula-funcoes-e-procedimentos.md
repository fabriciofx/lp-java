# 1. Funções e Procedimentos

Neste capítulo estudaremos como podemos modularizar os nossos programas, criando
nossas próprias instruções.

## 1.1 Motivação


## 1.2 Vantagens e Desvantagens

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

* Ter que aprender para que servem as novas instruções;
  * a utilização de novas funções acabam gerando quase uma nova "linguagem";
  * mas, se bem utilizado, pode ser bom!
* As chamadas das funções podem introduzir maior complexidade ao código;
  * uma função, que chama outra função, que chama outra função, que chama...
* Consome mais recursos (CPU e memória RAM).


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

## 1.4 Exercícios

1. [FuncaoSomaTresNumeros] Desenvolva um programa que contenha uma função que
receba três números inteiros como parâmetros e retorne a soma destes três
números. Depois desenvolva um código na função `main()` que solicite que o
usuário informe três números inteiros, passe estes números para a função e
mostre na tela o resultado obtido com a função criada.

2. [FuncaoPositivoNegativoZero] Desenvolva um programa que contenha uma função
que receba um número inteiro como parâmetro e retorne o caractere 'P' se o
número passado for positivo, 'N' se for negativo e 'O' se for zero. A seguir,
desenvolva um código na função `main()` que solicite que o usuário informe um
número inteiro, passe este número para a função e mostre na tela o resultado
obtido com a função criada.

3. [FuncaoEhPar] Desenvolva um programa que contenha uma função que receba um
número inteiro como parâmetro e retorne `true` se o número for par ou `false` se
o número for ímpar. A seguir, desenvolva um código na função `main()` que
solicite que o usuário informe um número inteiro, passe este número para a
função e mostre na tela se o número informado é par ou ímpar.

4. [FuncaoEhPrimo] Um número natural é dito *primo* se este possui apenas dois
divisores diferentes: o 1 e ele mesmo. De posse desta informação, desenvolva um
programa que contenha uma função que receba um número inteiro como parâmetro e
retorne `true` se o número for primo ou `false` se o número não for primo. A
seguir, desenvolva um código na função `main()` que solicite que o usuário
informe um número inteiro, passe este número para a função e mostre na tela se o
número informado é primo ou não.

5. [FuncaoContaDigitos] Desenvolva um programa que contenha uma função que
receba um número inteiro como parâmetro e retorne a quantidade de dígitos deste
número. Por exemplo, se for passado o número 1243 para esta função, ela deve
retornar 4. A seguir, desenvolva um código na função `main()` que solicite que o
usuário informe um número inteiro, passe este número para a função e mostre na
tela se a quantidade de dígitos confere com o número informado.

6. [FuncaoNumeroReverso] Desenvolva um programa que contenha uma função que
receba um número inteiro como parâmetro e retorne o *inverso* do número passado.
Por exemplo, se for passado o número 123 para a função, esta deve retornar o
valor 321. A seguir, desenvolva um código na função `main()` que solicite que o
usuário informe um número inteiro, passe este número para a função e mostre na
tela se o número informado é invertido corretamente.
