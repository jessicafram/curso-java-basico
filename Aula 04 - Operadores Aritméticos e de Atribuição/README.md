📚 Curso de Java Básico: Aula 4 - As "Ferramentas" da Receita - Operadores Aritméticos e de Atribuição
Olá, exploradores do Java! Nesta aula, vamos aprofundar nosso conhecimento sobre como manipular os dados que guardamos em nossas variáveis.

Na aula anterior, aprendemos sobre as variáveis e os tipos de dados, que são como os "potinhos" e os "ingredientes" da nossa receita. Agora que sabemos como guardar os ingredientes, que tal aprender a manipulá-los?

É aí que entram os operadores! Pense nos operadores como as "ferramentas" que um chef usa na cozinha: facas para cortar, batedeiras para misturar, balanças para medir. Em Java, os operadores nos permitem fazer cálculos, comparar valores e atribuir resultados.

Nesta aula, vamos focar em dois tipos importantes: os operadores aritméticos (para fazer contas!) e os operadores de atribuição (para guardar resultados).

1. Operadores Aritméticos: Fazendo Contas no Java
Assim como na matemática, o Java possui operadores para realizar as operações aritméticas básicas:

Operador

Operação

Exemplo

Resultado

+

Adição

10 + 5

15

-

Subtração

10 - 5

5

*

Multiplicação

10 * 5

50

/

Divisão

10 / 5

2

%

Resto da Divisão (Módulo)

10 % 3

1

Detalhe Importante sobre a Divisão (/)
A divisão em Java tem um comportamento específico dependendo dos tipos de dados envolvidos:

Divisão de Inteiros: Se ambos os números são inteiros, o resultado da divisão também será um inteiro, descartando a parte decimal.

Exemplo: int resultadoInteiro = 10 / 3; // resultadoInteiro será 3 (o .33 é descartado)

Divisão com Decimais: Se pelo menos um dos números for um decimal (double ou float), o resultado será um decimal, com a parte fracionária.

Exemplo: double resultadoDecimal1 = 10.0 / 3; // resultadoDecimal1 será 3.333...

Exemplo: double resultadoDecimal2 = 10 / 3.0; // resultadoDecimal2 será 3.333...

Para garantir um resultado decimal (Casting): Mesmo que ambos os números sejam inteiros, você pode "converter" um deles (chamado de casting):

Exemplo: double resultadoComCasting = (double) num1 / num2; // resultadoComCasting será 3.333...

O Operador de Resto da Divisão (%)
O operador % é super útil! Ele retorna o resto de uma divisão.

10 % 3 = 1 (porque 10=3×3+1)

15 % 2 = 1 (ímpar)

20 % 2 = 0 (par)

7 % 5 = 2

Ele é muito usado para verificar se um número é par (se o resto da divisão por 2 for 0) ou ímpar (se o resto da divisão por 2 for 1).

2. Operadores de Atribuição: Guardando Valores nos Nossos "Potinhos"
O operador mais básico de atribuição é o sinal de igual (=). Ele é usado para atribuir um valor a uma variável.

Exemplo: int idade = 30; // Atribui o valor 30 à variável 'idade'

Exemplo: String nome = "Maria"; // Atribui o texto "Maria" à variável 'nome'

Além do = simples, o Java oferece operadores de atribuição compostos, que são atalhos para operações comuns. Eles realizam uma operação e, em seguida, atribuem o resultado à variável.

Operador

Exemplo Simples

Equivalente a...

+=

x += 5;

x = x + 5;

-=

x -= 3;

x = x - 3;

*=

x *= 2;

x = x * 2;

/=

x /= 4;

x = x / 4;

%=

x %= 3;

x = x % 3;

Esses operadores compostos são muito usados para tornar o código mais conciso e legível, especialmente quando você precisa atualizar o valor de uma variável com base no seu próprio valor atual.

Exemplo: Imagine a variável saldo com um valor inicial de 100.

saldo += 50; é o mesmo que saldo = saldo + 50;

saldo (inicial) = 100

saldo (depois) = 150 (Adicionou 50 e guardou de volta)

Mão na Massa: Usando Operadores (Exemplos de Código)
Abaixo estão os exemplos de código Java que demonstram o uso desses operadores.

Resumindo o que Aprendemos:
Operadores Aritméticos: Usados para realizar operações matemáticas (+, -, *, /, %).

Lembre-se da peculiaridade da divisão de inteiros que descarta a parte decimal. Use double ou casting para resultados decimais.

O operador módulo (%) retorna o resto de uma divisão.

Operadores de Atribuição: Usados para guardar valores em variáveis.

O = é o operador de atribuição básico.

Operadores de atribuição compostos (+=, -=, *=, /=, %=) são atalhos para operações e atribuição combinadas.

Com essas novas "ferramentas", você já pode fazer cálculos e manipular os dados que guarda em suas variáveis! No próximo encontro, vamos explorar outros tipos de operadores.