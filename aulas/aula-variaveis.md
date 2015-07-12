# 1. Variáveis

Neste capítulo, estudaremos o que é uma variável e como podemos utilizá-la para
armazenar dados e o resultado de algum processamento.


## 1.1 Motivação

Como vimos anteriormente, a memória RAM do computador é utilizada para
armazenar os dados e instruções a serem executadas pela CPU do computador. Este
processo é comum quando, por exemplo, precisamos ler uma dado digitado por meio
do teclado do computador. Este dado precisa ser armazenado na memória RAM para
só então poder ser utilizado no programa. Um cálculo de uma efetuado por um
programa também possui um resultado, que possivelmente também será armazenado
na memória RAM do computador. A questão é: como podemos então utilizar a
memória RAM para armazenar os dados? A resposta a esta pergunta é a utilização
de uma variável.


## 1.2 Definição

> Uma variável é uma representação, em um programa, da memória RAM do
computador, capaz de armazenar um valor ou expressão.

Observação: lembrar que a CPU só lê dados e instruções da **memória RAM**.


## 1.3 Características Fundamentais

Uma variável possui três características fundamentais a saber: **tipo de
dado**, **identificador** e **valor**.

O **tipo de dado**, ou simplesmente tipo, informa qual o tipo do dado que a
variável irá armazenar ou representar. Como exemplos de tipos de dado pode ser
um número inteiro ou real, um caractere, uma string ou um valor booleano.

O **identificador** é um nome associado a uma variável utilizado para
representá-la. Como exemplos temos: `idade`, `sexo`, `salario`, `nome`,
`ehCasado`. Na maioria das linguagens de programação, existem regras que
determinam como um identificador deverá ser formado.

Um **valor** ou **expressão**, que é o dado retido ou representado pela
variável. Este valor está intimamente relacionado com o tipo de dado que a
variável utiliza. Por exemplo, se for declarada uma variável do tipo string.


## 1.4 Sintaxe

```java
Tipo Identificador = valor;
```
ou

```java
Tipo Identificador;
identificador = valor;
```

Em que:
* `Tipo`: indica a natureza do dado que você está guardando na memória RAM. Na
linguagem Java temos os seguintes tipos de dados:
<table>
  <tr>
    <th>Tipo</th>
    <th>Nome</th>
    <th>Descrição</th>
    <th>Intervalo</th>
    <th>Tamanho</th>
  </tr>
  <tr>
    <td>Booleano</td>
    <td><code>boolean</code></td>
    <td>Representa verdadeiro verdadeiro ou falso</td>
    <td><code>true</code> ou <code>false</code></td>
    <td>1 bit ou 1 byte (Depende da JVM)</td>
  </tr>
  <tr>
    <td>Caractere</td>
    <td><code>char</code></td>
    <td>Caractere único em notação Unicode de 16 bits</td>
    <td><code>\u0000</code> a <code>\uFFFF</code> (0 a 65.535)</td>
    <td>2 bytes</td>
  </tr>
  <tr>
    <td rowspan="4">Números inteiros</td>
    <td><code>byte</code></td>
    <td>Número inteiro de 8 bits</td>
    <td>-128 a 127 (-2<sup>7</sup> a 2^<sup>7</sup> - 1)</td>
    <td>1 byte</td>
  </tr>
  <tr>
    <td><code>short</code></td>
    <td>Número inteiro de 16 bits</td>
    <td>-32.768 a 32.767 (-2^15 a 2^15 - 1)</td>
    <td>2 bytes</td>
  </tr>
  <tr>
    <td><code>int</code></td>
    <td>Número inteiro de 32 bits</td>
    <td>-2.147.483.648 a 2.147.483.647 (-2^31 a 2^31 - 1)</td>
    <td>4 bytes</td>
  </tr>
  <tr>
    <td><code>long</code></td>
    <td>Número inteiro de 64 bits</td>
    <td>-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
    (-2^63 a 2^63 - 1)</td>
    <td>8 bytes</td>
  </tr>
  <tr>
    <td rowspan="2">Números reais</td>
    <td><code>float</code></td>
    <td>Número de ponto flutuante normalizado em precisão
    simples de 32 bits</td>
    <td>-1.4 x 10^-45 a +3.4 x 10^38</td>
    <td>4 bytes</td>
  </tr>
  <tr>
    <td><code>double</code></td>
    <td>Número de ponto flutuante normalizado em precisão
    simples de 64 bits</td>
    <td>-5.0 x 10^-324 a +1.7 x 10^308</td>
    <td>8 bytes</td>
  </tr>
</table>

* `valor`: o dado a ser guardado na variável.
  * Para guardar um valor numa variável, usamos o operador de atribuição (`=`).


## 1.5 Exemplos

1. Crie uma variável para armazenar um endereço

  ```java
  String logradouro;
  logradouro = "Av. Rui Barbosa";
  ```
  ou

  ```java
  String logradouro = "Av. Rui Barbosa";
  ```

2. Crie uma variável para representar se uma pessoa está casada ou não

  ```java
  boolean estaCasado;
  estaCasado = false;
  ```

3. Crie uma variável para representar a idade de uma pessoa

  ```java
  int idade;
  idade = 34;
  ```

4. Crie uma variável para representar a nota (numérica) de um estudante

  ```java
  double nota;
  nota = 7.2;
  ```

5. Crie uma variável para representar a nota (conceito) de um estudante

  ```java
  char conceito;
  conceito = 'A';
  ```

6. Crie uma variável para representar o CPF de uma pessoa

  ```java
  String cpf;
  cpf = "123.456.789-10";
  ```

7. Crie uma variável para representar o número de telefone de uma pessoa

  ```java
  String fone;
  fone = "6785-3456";
  ```
