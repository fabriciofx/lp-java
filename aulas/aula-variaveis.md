# 1. Variáveis

Neste capítulo, estudaremos como podemos utilizar, por meio de um programa, a
memória RAM do computador, para armazenar dados e o resultado de algum
processamento.


## 1.1 Motivação

## 1.2 Definição

> Uma variável é uma representação, em um programa, da memória RAM, com o
objetivo de utilizá-la para guardar dados ou o resultado de algum processamento.

Observação: lembrar que a CPU só lê dados e instruções da **memória RAM**.


## 1.3 Sintaxe:

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

| Tipo | Nome | Descrição | Intervalo | Tamanho |
-------+------+-----------+-----------+---------+
Booleano | `boolean` | Representa verdadeiro verdadeiro ou falso | `true` ou `false` | Depende da JVM |
Caractere | `char` | Caractere único em notação Unicode de 16 bits | \u0000 a \uFFFF (0 a 65.535) | 2 bytes|
Números inteiros | `byte` | Número inteiro de 8 bits | -128 a  127 (-2^7 a 2^7 - 1) | 1 byte |

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
