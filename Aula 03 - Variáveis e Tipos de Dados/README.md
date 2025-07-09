📚 Curso de Java Básico: Aula 3 - Os "Potinhos" e "Tipos de Ingredientes" - Variáveis e Tipos de Dados em Java
Olá, pessoal! Na aula anterior, vimos como dar vida ao nosso código compilando e executando o "Olá, mundo!". Agora que já sabemos como o programa "fala" com a gente, é hora de aprender a guardar e manipular informações.

Imagine que você está na cozinha (nossa IDE, lembra?) e precisa preparar uma receita. Você vai precisar de açúcar, farinha, ovos, etc. Mas onde você guarda esses ingredientes? Em potinhos! E cada potinho é feito para um tipo específico de ingrediente: um para líquidos, outro para pós, e assim por diante.

Em Java, é a mesma coisa! Os "potinhos" são as variáveis, e os "tipos de ingredientes" são os tipos de dados.

1. O que são Variáveis? Os Nossos "Potinhos"
Uma variável é como um espaço na memória do computador que reservamos para guardar um valor. É um "potinho" que tem um nome para a gente poder se referir a ele e um conteúdo que pode mudar ao longo do tempo.

Pense assim:

Você tem um potinho que você chama de idade.

Dentro desse potinho, você guarda o número 30.

Mais tarde, você pode mudar o conteúdo desse potinho para 31.

Em Java, para declarar uma variável (ou seja, criar o seu "potinho"), você precisa dizer duas coisas:

Qual o tipo de "ingrediente" (tipo de dado) ele vai guardar?

Qual o nome do seu "potinho" (nome da variável)?

Sintaxe Básica para Declarar uma Variável:
TipoDeDado nomeDaVariavel;

Uma Nota Importante sobre a Sintaxe: Maiúsculas e Minúsculas no Java (Case-Sensitive)
Em Java, a distinção entre letras maiúsculas e minúsculas é extremamente importante. Dizemos que Java é uma linguagem "case-sensitive".

Para o Java, TipoDeDado é diferente de tipodedado, que é diferente de TIPODEDADO.

A mesma coisa vale para os nomes das suas variáveis: minhaIdade é diferente de Minhaidade ou minhaidade.

Por que essa regra é crucial nesta etapa?

Tipos de Dados Primitivos: Os tipos de dados primitivos (como int, double, boolean, char, byte, short, long, float) são sempre escritos em minúsculas. Se você tentar usar Int ou Double, o Java não vai reconhecer e dará um erro.

Classes: O tipo String que usamos para textos é um bom exemplo. Ele é uma classe, e em Java, por convenção, os nomes de classes sempre começam com letra maiúscula. Por isso, você sempre verá String (com 'S' maiúsculo) e nunca string (com 's' minúsculo).

Convenções de Nomenclatura: Embora o Java não te force a seguir todas as convenções para nomes de variáveis, é uma boa prática seguir o padrão:

Classes (como MinhasVariaveis, OlaMundo): Começam com letra maiúscula (PascalCase).

Variáveis (como minhaIdade, nomeCompleto): Começam com letra minúscula e as palavras seguintes começam com maiúscula (camelCase).

Seguir essas regras e convenções não só evita erros, mas também torna seu código muito mais legível e compreensível para você e para qualquer outra pessoa que o leia.

2. Tipos de Dados: Os "Tipos de Ingredientes"
Assim como na cozinha, onde você não guarda água no potinho de farinha, em Java cada variável precisa ter um tipo de dado específico. Isso diz ao Java que tipo de informação ela pode armazenar e quanto espaço na memória ela precisa.

Vamos conhecer alguns dos tipos de dados mais comuns em Java:

a) Números Inteiros (sem casas decimais)
int: É o tipo mais comum para números inteiros. É como um potinho de tamanho médio para guardar números como 10, 500, -25.

byte: Para números inteiros muito pequenos (de -128 a 127). É um potinho bem pequeno.

short: Para números inteiros um pouco maiores que byte.

long: Para números inteiros muito grandes. É um potinho gigante! Para números long muito grandes, use L no final (ex: 8000000000L).

Exemplos:

int quantidadeEstoque = 150; // Um número inteiro de produtos no estoque
byte temperatura = 25;     // A temperatura ambiente
long populacaoMundial = 8000000000L; // Para números muito grandes, usamos 'L' no final

b) Números Decimais (com casas decimais)
double: O tipo mais comum para números com casas decimais (números de ponto flutuante), como 3.14, 0.5, -10.25. Ele oferece maior precisão.

float: Também para números decimais, mas com menos precisão que double. Você precisa adicionar um F no final do número.

Exemplos:

double precoProduto = 29.99; // Preço de um produto
float altura = 1.75F;       // Altura de uma pessoa (note o F no final)

c) Caracteres (letras, símbolos)
char: Para armazenar um único caractere (uma letra, um número como texto, um símbolo). O valor é sempre colocado entre aspas simples (' ').

Exemplos:

char inicialNome = 'J';   // A primeira letra do nome
char simboloMoeda = '$'; // Um simbolo

d) Lógico (verdadeiro ou falso)
boolean: Para armazenar um valor que é ou true (verdadeiro) ou false (falso). Muito usado para decisões no seu programa.

Exemplos:

boolean estaChovendo = false; // Não está chovendo
boolean usuarioLogado = true; // O usuário está logado

e) Texto (sequência de caracteres)
String: Este não é um tipo de dado primitivo como os outros, mas é extremamente comum e importante! String é uma classe em Java usada para armazenar sequências de caracteres, ou seja, textos. O valor é sempre colocado entre aspas duplas (" ").

Exemplos:

String nomeCompleto = "Maria da Silva"; // Um nome completo
String mensagemBoasVindas = "Bem-vindo ao curso de Java!"; // Uma frase

3. Declarando e Inicializando Variáveis: Criando e Enchendo os "Potinhos"
Você pode criar o "potinho" e depois colocar o "ingrediente" dentro dele, ou fazer os dois ao mesmo tempo.

a) Declarar e depois Inicializar:
// 1. Declarando a variável (criando o potinho chamado "idade" para guardar números inteiros)
int idade;

// 2. Inicializando a variável (colocando o valor 30 dentro do potinho "idade")
idade = 30;

System.out.println("Minha idade é: " + idade); // Saída: Minha idade é: 30

// Você pode mudar o valor depois
idade = 31;
System.out.println("No próximo ano, minha idade será: " + idade); // Saída: No próximo ano, minha idade será: 31

b) Declarar e Inicializar na mesma linha:
Esta é a forma mais comum e recomendada.

// Declarando e inicializando a variável na mesma linha
String saudacao = "Olá, Java!";
double pi = 3.14159;
boolean isAtivo = true;

System.out.println(saudacao); // Saída: Olá, Java!
System.out.println("O valor de PI é: " + pi); // Saída: O valor de PI é: 3.14159
System.out.println("Está ativo? " + isAtivo); // Saída: Está ativo? true

4. Regras para Nomes de Variáveis
Assim como nomes de classes, nomes de variáveis também têm suas regrinhas para manter o código organizado e legível:

Devem começar com uma letra minúscula, $ ou _ (underscore).

Não podem começar com números.

Não podem conter espaços. Use camelCase (ex: nomeCompleto, numeroDaCasa).

Não podem ser palavras-chave do Java (ex: public, class, int, void).

Devem ser descritivos. idade é melhor que x.

Mão na Massa: Criando e Usando Variáveis (Exemplos de Código)
Abaixo estão os exemplos de código Java que demonstram o uso dessas variáveis. Crie uma nova classe chamada MinhasVariaveis e insira o código abaixo dentro do método main().

Resumindo o que Aprendemos:
Variável: Um "potinho" na memória do computador com um nome, onde guardamos valores. Seu valor pode mudar.

Declaração: O ato de criar uma variável, especificando seu tipo e nome (Tipo nomeVariavel;).

Inicialização: O ato de atribuir um valor à variável (nomeVariavel = valor;).

Tipos de Dados: Classificam o tipo de valor que uma variável pode guardar (números inteiros, decimais, caracteres, booleanos, textos).

Numéricos: int, byte, short, long (inteiros); double, float (decimais).

Caracteres: char (um único caractere).

Lógicos: boolean (true/false).

Texto: String (sequência de caracteres - é uma classe, não um tipo primitivo).

Ponto e Vírgula (;): Não se esqueça dele no final de cada instrução!

Entender variáveis e tipos de dados é um dos pilares da programação. Com eles, você pode armazenar informações importantes para o seu programa funcionar. No próximo módulo, vamos aprender o que fazer com esses dados, usando os operadores em Java!

Pronto para o próximo "ingrediente" da nossa receita?