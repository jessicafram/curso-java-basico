📚 Curso de Java Básico: Aula 5 - Decisões no Código - Operadores Relacionais e Lógicos
Olá, meus queridos babys programadores! Depois de aprendermos a guardar nossos "ingredientes" (variáveis e tipos de dados) e a "manipulá-los" com ferramentas (operadores aritméticos e de atribuição), chegou a hora de dar um passo além: ensinar nosso programa a tomar decisões!

Imaginem um chef de cozinha que, ao invés de seguir a receita cegamente, consegue pensar: "Hmm, se o molho está muito salgado, eu adiciono mais açúcar. Se a carne está bem passada, eu desligo o fogo." Essa capacidade de "pensar" e reagir a condições é o que vamos trazer para o nosso código hoje!

Nesta aula, vamos desvendar os Operadores Relacionais (para comparar valores) e os Operadores Lógicos (para combinar essas comparações e criar condições mais complexas).

1. Operadores Relacionais: Comparando Valores
Os operadores relacionais são usados para comparar dois valores. O resultado de uma comparação usando um operador relacional é sempre um valor booleano: true (verdadeiro) ou false (falso).

Operador

Significado

Exemplo Simples

Resultado

==

Igual a

5 == 5

true





5 == 6

false

!=

Diferente de

5 != 5

false





5 != 6

true

>

Maior que

10 > 5

true





5 > 10

false

<

Menor que

5 < 10

true





10 < 5

false

>=

Maior ou igual a

10 >= 10

true





10 >= 5

true

<=

Menor ou igual a

5 <= 5

true





5 <= 10

true

Pense nos operadores relacionais como balanças ou verificadores:

ATENÇÃO: == vs =
Essa é uma pegadinha muito comum para iniciantes e causa muitos erros!

== (DOIS iguais): É um operador RELACIONAL (de comparação). Ele compara se o valor da esquerda é igual ao valor da direita. O resultado é true ou false.

= (UM igual): É um operador de ATRIBUIÇÃO. Ele atribui o valor da direita à variável da esquerda.

Exemplo de erro comum: if (idade = 30) { ... } // ISSO NÃO COMPARA! Isso tenta atribuir 30 à idade e geralmente causa um erro de tipo. O correto é if (idade == 30) { ... }.

2. Operadores Lógicos: Combinando Condições
Os operadores lógicos nos permitem combinar duas ou mais expressões booleanas (resultados de comparações) ou inverter um valor booleano. Eles são essenciais para criar condições mais complexas em seu código.

Operador

Nome Lógico

Significado

Exemplo Simples

Resultado (se A=true, B=false)

&&

E Lógico

Verdadeiro se AMBAS as expressões são verdadeiras.

(A && B)

false







(5 > 3 && 10 < 20)

true

`



`

OU Lógico

Verdadeiro se PELO MENOS UMA das expressões é verdadeira.







`(5 > 10



!

NÃO Lógico

Inverte o valor booleano (verdadeiro vira falso, e vice-versa).

!A

false (se A for true)







!(10 > 5) (que é !true)

false

Mão na Massa: Operadores na Prática (Exemplos de Código)
Abaixo estão os exemplos de código Java que demonstram o uso desses operadores. Crie uma nova classe chamada DecisoesComOperadores e insira o código abaixo dentro do método main().

Resumindo o que Aprendemos:
Operadores Relacionais (==, !=, >, <, >=, <=): Usados para comparar dois valores. O resultado é sempre um boolean (true ou false).

Lembre-se: == é comparação, = é atribuição!

Operadores Lógicos (&&, ||, !): Usados para combinar ou inverter valores booleanos.

&& (E): Verdadeiro se tudo for verdadeiro.

|| (OU): Verdadeiro se pelo menos um for verdadeiro.

! (NÃO): Inverte o valor (verdadeiro vira falso, falso vira verdadeiro).

Esses operadores são a base para o nosso próximo passo: as Estruturas de Controle de Fluxo. Com eles, você poderá finalmente criar programas que tomam decisões e reagem a diferentes situações, tornando-os muito mais inteligentes e úteis!

Prontos para dar o próximo salto na lógica da programação?