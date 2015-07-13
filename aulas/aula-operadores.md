# 1. Operadores

Nos capítulos anteriores, utilizamos alguns operadores básicos, como a adição
`+`, subtração `-`, multiplicação `*` e a divisão `/`. Este capítulo visa se
aprofundar nos operadores da linguagem Java, apresentando novos operadores e
discutindo suas propriedades.


## 1.2 Operador e Operando

Antes de começar o estudo sobre os diversos operadores da linguagem Java é
preciso definir o que vem a ser um *operador* e um *operando*:

> Um operador é um símbolo ou função que denota uma operação sobre variáveis ou
elementos pré-definidos.

> Um operando é um elemento que sofre a ação de uma operação

Assim, na expressão `2 + 3`, `2` e `3` são os operandos (sofrem a ação da
adição) e o `+` é o operador (denota a operação de adição).


## 1.3 Operadores Aditivos

Os aditivos são operadores binários que compreendem as operações de adição `+`
e subtração `-`. Exemplos:

```java
2 + 3
7 - 4
4 + 1 - 2
```


## 1.4 Operadores Multiplicativos

Os multiplicativos são operadores binários que compreendem as operações de
multiplicação `*` e divisão `/`. Exemplos:

```java
3 * 2
8 / 4
4 / 2 * 5
```

Da mesma forma da matemática, não é possível fazer uma divisão por 0.

**Observação:** É importante frisar que uma divisão entre inteiros o resultado
também é um número inteiro. Para exemplificar este conceito, tomemos como
exemplo a seguinte expressão: `5 / 2`. O resultado desta expressão é `2` e não
`2.5` como muitos poderiam achar.


## 1.5 Operadores Relacionais

Os operadores relacionais são o menor que `<`, menor ou igual a `<=`, maior que
`>`, maior ou igual a `>=` e o verificador de mesma instância `instanceof`.


## 1.6 Operadores de Igualdade

## 1.7 Operadores Lógicos e Bit a Bit

## 1.8 Operadores Lógicos Condicionais

## 1.9 Operador Condicional

## 1.10 Operadores Unários

## 1.11 Operadores de Representação de Sinal

## 1.12 Operadores de Incremento e Decremento

## 1.13 Operadores de Negação

## 1.14 Operador de Coersão

## 1.15 Operador de Alocação de Objetos

## 1.16 Operadores de Deslocamento

## 1.17 Propriedades dos Operadores

Todos os operadores da linguagem Java possuem três propriedades a saber:
*aridade*, *precedência* e *associatividade*. Para entender corretamente a
avalição de uma expressão, é preciso conhecer estas propriedades.  


### 1.17.1 Aridade

Sabemos que para realizar uma operação de adição, é preciso ter no mínimo dois
operandos, como por exemplo na expressão `2 + 3`. No entanto, outros operadores
como o de negação `-`, cujo objetivo é a inversão do sinal, necessita apenas de
um único operando, como exemplificado na expressão `-5`. De modo semelhante,
podemos utilizar o operador mais unário `+`, na expressão `+7`, que não altera o
valor do número `7`, mas é uma expressão válida na aritmética e portanto também
deve ser válida nas linguagens de programação. Assim, os operadores podem ser
classificados pela quantidade de operandos necessários para efetuar a sua
operação, e esta propriedade é denominada de *aridade*.

> A aridade determina quantos operandos são necessários para um determinado
operador executar uma operação.

Um operador é dito *unário* se apenas um operando estiver sendo utilizado
durante a sua execução; *binário* se estiver utilizando dois operandos; e
*ternário* se estiver utilizando três operandos. Esta classificação pode ser
resumida conforme a tabela abaixo:

| Classificação | Número de operandos |
| :------------- | :------------- |
| Unário | Um operandos |
| Binário | Dois operandos |
| Ternário | Três operandos |


### 1.17.2 Precedência

Imagine a seguinte expressão: `4 + 4 / 2`. Qual o resultado correto desta
expressão? `4` ou `6`? Da aritmética, sabemos que as operações de multiplicação
e divisão devem ser realizadas antes que as operações de adição e subtração.
Assim, a avaliação correta da expressão `4 + 4 / 2` seria `4 + (4 / 2)` o que
resulta em `6`. O que permite que a operação de divisão seja realizada antes que
a soma, mesmo vindo depois na expressão, é chamada de *precedência*.

> A precedência determina qual operação deverá ser realizada antes de outras
operações, quando em conjunto com outras.

Ainda é possível alterar a precedência de um operador. Para isto é preciso
utilizar os símbolos dos parênteses `( )`. Eles funcionam como os parênteses ( ),
os colchetes [ ] e as chaves { } da aritmética.


### 1.17.3 Associatividade

Analise a seguinte expressão: `8 / 4 * 2`. Qual o resultado esperado desta
expressão? `4` ou `1`? Sabemos que os operadores que realizam a multiplicação e
divisão possuem a mesma precedência. Assim, o que determinará o resultado? A
resposta para esta pergunta é a *associatividade*.
> A associatividade determina a ordem de avaliação entre operadores de mesma
precedência.

A associatividade pode ser *da esquerda para a direita* (a mais comum) ou *da
direita para a esquerda*, informando assim, que as operações relacionadas com os
operadores de mesma precedência será executada na ordem da esquerda para direita
ou da direita para a esquerda, respectivamente.

Portanto, de acordo com o exemplo mostrado, o resultado da expressão `8 / 4 * 2`
será `4`, pois a associatividade dos operadores de multiplicação e divisão é da
esquerda para direita, assim executando primeiro a operação de divisão e com o
resultado desta, aplicado ao operador de multiplicação. Em outras palavras, a
ordem de execução também pode ser vista da seguinte forma: `8 / 4 * 2` &#8594; `(8 /
4) * 2`.

## 1.18 Tabela Resumida dos Operadores

<table>
	<tr>
		<th>Grupo</th>
		<th>Operador</th>
		<th>Descrição</th>
		<th>Aridade</th>
		<th>Precedência</th>
		<th>Associatividade</th>
	</tr>
	<tr>
		<td rowspan="2">Pós-fixado</td>
		<td align="center">++</td>
		<td>Incremento</td>
		<td rowspan="2">Unário</td>
		<td rowspan="2" align="center">1º</td>
		<td rowspan="2">Direita &#8594; Esquerda</td>
	</tr>
	<tr>
		<td align="center">--</td>
		<td>Decremento</td>
	</tr>
	<tr>
		<td rowspan="6">Unários</td>
		<td align="center">++</td>
		<td>Incremento (unário)</td>
		<td rowspan="6">Unário</td>
		<td rowspan="6" align="center">2º</td>
		<td rowspan="6">Direita &#8594; Esquerda</td>
	</tr>
	<tr>
		<td align="center">--</td>
		<td>Decremento (unário)</td>
	</tr>
	<tr>
		<td align="center">!</td>
		<td>Negação (booleano)</td>
	</tr>
	<tr>
		<td align="center">~</td>
		<td>Negação (bit a bit)</td>
	</tr>
	<tr>
		<td align="center">+ (unário)</td>
		<td>Positivo (não possui efeito)</td>
	</tr>
	<tr>
		<td align="center">-</td>
		<td>Negativo (inversão de sinal)</td>
	</tr>
	<tr>
		<td rowspan="3">Multiplicativos</td>
		<td align="center">\*</td>
		<td>Multiplicação</td>
		<td rowspan="3">Binário</td>
		<td rowspan="3" align="center">3º</td>
		<td rowspan="3">Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td align="center">/</td>
		<td>Divisão</td>
	</tr>
	<tr>
		<td align="center">%</td>
		<td>Módulo</td>
	</tr>
	<tr>
		<td rowspan="2">Aditivos</td>
		<td align="center">+</td>
		<td>Adição</td>
		<td rowspan="2">Binário</td>
		<td rowspan="2" align="center">4º</td>
		<td rowspan="2">Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td align="center">-</td>
		<td>Subtração</td>
	</tr>
	<tr>
		<td rowspan="3">Deslocamento</td>
		<td align="center"><<</td>
		<td>Deslocamento de bits para a esquerda</td>
		<td rowspan="3">Binário</td>
		<td rowspan="3" align="center">5º</td>
		<td rowspan="3">Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td align="center">>></td>
		<td>Deslocamento de bits para a direita com sinalização</td>
	</tr>
	<tr>
		<td align="center">>>></td>
		<td>Deslocamento de bits para a direita sem sinalização</td>
	</tr>
	<tr>
		<td rowspan="5">Relacionais</td>
		<td align="center"><</td>
		<td>Menor que</td>
		<td rowspan="5">Binário</td>
		<td rowspan="5" align="center">6º</td>
		<td rowspan="5">Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td align="center"><=</td>
		<td>Menor que ou igual a</td>
	</tr>
	<tr>
		<td align="center">></td>
		<td>Maior que</td>
	</tr>
	<tr>
		<td align="center">>=</td>
		<td>Maior que ou igual a</td>
	</tr>
	<tr>
		<td align="center">instanceof</td>
		<td>É instância de</td>
	</tr>
	<tr>
		<td rowspan="2">Igualdade</td>
		<td align="center">==</td>
		<td>Igual a</td>
		<td rowspan="2">Binário</td>
		<td rowspan="2" align="center">7º</td>
		<td rowspan="2">Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td align="center">!=</td>
		<td>Diferente de</td>
	</tr>
	<tr>
		<td rowspan="3">Lógicos<br />e<br />Bit a Bit</td>
		<td align="center">&</td>
		<td>E (AND) lógico<br />E (AND) bit a bit</td>
		<td rowspan="3">Binário</td>
		<td rowspan="3" align="center">8º</td>
		<td rowspan="3">Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td align="center">^</td>
		<td>Ou Exclusivo (XOR) lógico<br />Ou Exclusivo (XOR) bit a bit</td>
	</tr>
	<tr>
		<td align="center">|</td>
		<td>Ou (OR) lógico<br />Ou (OR) bit a bit</td>
	</tr>
	<tr>
		<td>E Condicional</td>
		<td align="center">&&</td>
		<td>E (AND) Condicional</td>
		<td>Binário</td>
		<td align="center">9º</td>
		<td>Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td>Ou Condicional</td>
		<td align="center">||</td>
		<td>Ou (OR) Condicional</td>
		<td>Binário</td>
		<td align="center">10º</td>
		<td>Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td>Condicional</td>
		<td align="center">?:</td>
		<td>Condicional</td>
		<td>Ternário</td>
		<td align="center">11º</td>
		<td>Esquerda &#8594; Direita</td>
	</tr>
	<tr>
		<td rowspan="12">Atribuição<br />e<br />Atribuição Composta</td>
		<td align="center">=</td>
		<td rowspan="12">Atribuição</td>
		<td rowspan="12">Binário</td>
		<td rowspan="12" align="center">12º</td>
		<td rowspan="12">Direita &#8594; Esquerda</td>
	</tr>
	<tr>
		<td align="center">+=</td>
	</tr>
	<tr>
		<td align="center">-=</td>
	</tr>
	<tr>
		<td align="center">\*=</td>
	</tr>
	<tr>
		<td align="center">/=</td>
	</tr>
	<tr>
		<td align="center">%=</td>
	</tr>
	<tr>
		<td align="center">&=</td>
	</tr>
	<tr>
		<td align="center">^=</td>
	</tr>
	<tr>
		<td align="center">|=</td>
	</tr>
	<tr>
		<td align="center"><<=</td>
	</tr>
	<tr>
		<td align="center">>>=</td>
	</tr>
	<tr>
		<td align="center">>>>=</td>
	</tr>
</table>


## 1.19 Exercícios

1. [OperadoresRelacionais]$ De acordo com as variáveis abaixo, diga se a
avaliação final de cada sentença abaixo será `true` (verdadeira) ou `false`
(falsa):

	```java
	int a = 2, b = 5, c = 7, d = 1, e = 0, f = 10, g = 1;

	a) a > b
	b) b < c
	c) d >= g
	d) e <= f
	e) e == f
	f) d != a
	g) d == g
	h) a >= c
	i) c >= f
	j) c <= e
	k) a > g
	l) d < f
	m) a != c
	n) a > 5
	o) 6 < g
	p) 10 > d
	q) 5 + b < 3 + g
	r) c + 2 >= 7 – a
	s) d + e – f + 2 <= b + c – g
	t) d * 2 + 3 != c + e
	u) –b + a * c == g * f * e
	v) f / 2 * g < -d + a * 2
	w) a + b – -c > -g + 2 * f
	```

2. [OperadoresLogicos] De acordo com as variáveis abaixo, diga se a avaliação
final de cada sentença abaixo será `true` (verdadeira) ou `false` (falsa):

	```java
	boolean a = true, b = false, c = false, d = true, e = false, f = true, g =
	false;

	a) (a || b) && (e && g)
	b) (a && b && c) || (d && e && f)
	c) a && b || c || d && e || f
	d) !(a && b) || !(e || f || g)
	e) !(((((a && b) || c) && d) || e) && f)
	f) (a && e) || (!d || !f)
	g) a && !b && c && !d && e && !f
	h) (!(a || b) && (!c || !d))
	i) !a || a && (b || c) && d || e && f
	j) !a || !b || !c || !d || !e && f
	k) a && b && c && d && e && f && g
	l) !(!(!(!(!a)))) && (b || c)
	m) (!a && b || !c) != (d && e || f) || !g
	n) g && a || c && (a || !c || !d)
	o) !e && b || g && a && !d || f
	p) !b && b || !a || a
	q) !(a && b) == (!a || !b)
	r) !(a || b) == (!a && !b)
	```

3. [OperadoresIncDec] Analise as instruções abaixo e diga o valor das variáveis
a, b, c, d, e e f, após a execução de todas as equações:

	```java
	int a = 2, b = 3, c = 6, d = -1, e = 4, f = 5;

	a = c++ * --d - 5 + f;
	b = ++a * f++ / 2 + d--;
	c =  -d + a++ - --b + f;
	d = f + 5 / a++ * 2;
	```

	```java
	int a = 3, b = 4, c = -5, d = 2, e = 5, f = 10;

	a = --c * --b – 2 + d;
	b = --d * a++ / 4 + --f;
	c =  -d + --a - --b + f;
	d = a - b / ++f * -c;
	```

	```java
	int a = 1, b = 0, c = 2, d = 3, e = 2, f = -2;

	a = --d * --c – 3 \% d;
	b = c * a++ / 2 + e;
	c =  -d * -d - --b + a;
	d = b + a / e * -f;
	```

	```java
	int a = 1, b = 2, c = 3, d = 4, e = 5, f = 0;

	a = c-- * --e – 3 + b;
	b = a++ - b++ + ++c - ++d;
	c = -d * -a – b + 2;
	d = a * b / c + --f;
	```

	```java
	int a = 6, b = 3, c = 1, d = 3, e = 4, f = 5;

	c = a / --b + 2;
	d = ++a * ++c / 2 - 5;
	e = ++d * --c – b++;
	f = a - b + c - d + e;
	```

	```java
	int a = 6, b = 3, c = 1, d = 3, e = 4, f = 5;

	c = a / --b + 2;
	d = ++a * ++c / 2 - 5;
	e = ++d * --c – b++;
	f = a - b + c - d + e;
	```
