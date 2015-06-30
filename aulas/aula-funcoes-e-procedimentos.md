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
certos algoritmos;

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
