📚 Curso de Java Básico: Aula 8 - Interagindo com o Usuário: A Classe Scanner
Olá, meus queridos babys programadores!

Até agora, nossos programas Java têm sido um pouco "monólogos": eles executam suas instruções e exibem resultados, mas não conseguem "conversar" com o usuário. Eles não podem, por exemplo, pedir para o usuário digitar seu nome ou um número.

Nesta aula, vamos mudar isso! Vamos aprender a usar a poderosa Classe Scanner do Java, que nos permite ler dados de entrada do usuário através do teclado. É como dar ao nosso programa a capacidade de "ouvir" e "receber informações" do mundo exterior.

Com a Scanner, seus programas se tornarão muito mais interativos e úteis!

1. O que é a Classe Scanner?
A Scanner é uma classe pré-construída no Java (parte do pacote java.util) que facilita a leitura de dados de diversas fontes, sendo a mais comum a entrada padrão do sistema (o teclado).

Pense nela como um "leitor" ou um "receptor" de informações.

Por que precisamos dela?
Interatividade: Permite que o programa solicite e receba informações do usuário durante a execução.

Flexibilidade: Podemos ler diferentes tipos de dados (números inteiros, números decimais, textos, etc.).

2. Como Usar a Classe Scanner (Passos Essenciais)
Para usar a Scanner, você precisará seguir alguns passos importantes:

Passo 1: Importar a Classe Scanner
Como a Scanner não faz parte das funcionalidades mais básicas do Java que são carregadas automaticamente, precisamos "importá-la" para o nosso arquivo Java. É como dizer ao Java: "Ei, vou usar essa ferramenta aqui, por favor, traga ela para mim!".

Isso é feito no início do seu arquivo Java, antes da declaração da sua classe principal:

import java.util.Scanner; // Importa a classe Scanner

Passo 2: Criar um Objeto Scanner
Após importar, precisamos criar uma "instância" (um objeto) da classe Scanner. Pense nisso como "ligar" o leitor ou "preparar" o receptor.

Scanner scanner = new Scanner(System.in);

Scanner scanner: Declara uma variável chamada scanner do tipo Scanner.

new Scanner(System.in): Cria um novo objeto Scanner que está configurado para ler a entrada padrão do sistema, que é o teclado (System.in).

Passo 3: Lendo os Dados do Usuário
Com o objeto scanner pronto, podemos usar seus métodos para ler diferentes tipos de dados:

scanner.nextLine(): Lê uma linha inteira de texto (incluindo espaços) até que o usuário pressione Enter. O resultado é uma String.

scanner.nextInt(): Lê um número inteiro (int).

scanner.nextDouble(): Lê um número decimal (double).

scanner.next(): Lê apenas uma palavra (até o próximo espaço em branco).

Passo 4: Fechar o Objeto Scanner
É uma boa prática fechar o objeto Scanner quando você não precisar mais dele. Isso libera recursos do sistema.

scanner.close();

Mão na Massa: Interagindo com o Usuário (Exemplos de Código)
Abaixo estão os exemplos de código Java que demonstram o uso da Classe Scanner. Crie uma nova classe chamada LeituraDeDados e insira os códigos dos exemplos abaixo dentro do método main().

Resumindo o que Aprendemos:
A Classe Scanner (java.util.Scanner) permite que programas Java leiam dados de entrada do usuário.

Passos:

Importar: import java.util.Scanner;

Criar Objeto: Scanner nomeDoObjeto = new Scanner(System.in);

Lendo Dados: Use métodos como nextLine(), nextInt(), nextDouble(), next().

Fechar: nomeDoObjeto.close(); para liberar recursos.

Com a Scanner, seus programas agora podem "conversar" com os usuários, tornando-os muito mais dinâmicos e úteis!

Prontos para criar programas interativos?