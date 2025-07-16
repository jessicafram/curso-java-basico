Desafio: Meu Primeiro Caixa Eletrônico Java - Atendimento Essencial
Este README.md detalha o desafio de criar um simulador de caixa eletrônico em Java, consolidando os conhecimentos adquiridos até a Aula 09 do curso "Básico do Básico Java".

📚 Visão Geral do Desafio
O objetivo deste desafio é aplicar os conceitos de lógica de programação e estruturas de controle para construir um programa Java que simule um caixa eletrônico básico. O usuário poderá interagir com o sistema para consultar saldo, realizar saques e depósitos.

Este projeto é uma excelente oportunidade para praticar a interação com o usuário, a tomada de decisões no código e a organização de múltiplas opções.

💡 Conceitos Abordados
Para completar este desafio, você precisará utilizar os seguintes conceitos que já estudamos:

Estrutura Básica Java: public class, main método.

Variáveis e Tipos de Dados: int, double, String.

Operadores Aritméticos: +, -, *, /.

Operadores de Atribuição: =, +=, -=.

Operadores Relacionais: ==, !=, >, <, >=, <=.

Operadores Lógicos: &&, ||, !.

Estruturas de Controle de Fluxo:

if, else, if-else if-else para validações e condições.

switch para o menu de opções do caixa eletrônico.

Leitura de Dados com Scanner: Para receber a entrada do usuário.

Exibição de Mensagens: System.out.println(), System.out.print(), System.out.printf().

Comentários no Código: Para clareza e organização.

🎯 O Desafio: Construindo seu Caixa Eletrônico
Seu programa CaixaEletronico.java deve simular o atendimento, oferecendo um menu de opções para o usuário.

Variáveis Iniciais:

Crie uma variável double chamada saldo e inicialize-a com um valor fictício (ex: 1000.00).

Crie um objeto Scanner para receber as entradas do usuário.

Lembre-se de importar java.util.Scanner e java.util.Locale!

Dica: Configure o Scanner para usar o padrão brasileiro de números decimais (vírgula) para evitar InputMismatchException:
Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));

Menu Principal:

Exiba um menu claro com as seguintes opções numeradas de 1 a 4:

--- MENU DE OPÇÕES ---
1 - Consultar Saldo
2 - Realizar Saque
3 - Realizar Depósito
4 - Sair
----------------------

Peça ao usuário para digitar a opção desejada.

Processar a Opção (usando switch!):

Utilize a estrutura switch para processar a opção (int) que o usuário digitou.

Para cada case (opção 1, 2, 3, 4):

Case 1: Consultar Saldo

Exiba o saldo atual da conta, formatado com duas casas decimais (ex: R$ 1000.00).

Case 2: Realizar Saque

Peça ao usuário para digitar o valor do saque.

Validação (usando if e else):

Verifique se o valor do saque é maior que zero. Se não for, exiba uma mensagem de erro (ex: "ERRO: O valor do saque deve ser maior que zero.").

Se for maior que zero, verifique se o saldo é suficiente (saldo >= valor do saque).

Se o saldo for suficiente, realize a operação (saldo -= valor do saque) e exiba o novo saldo.

Se o saldo for insuficiente, exiba uma mensagem informando (ex: "ERRO: Saldo insuficiente para realizar o saque.").

Case 3: Realizar Depósito

Peça ao usuário para digitar o valor do depósito.

Validação (usando if e else):

Verifique se o valor do depósito é maior que zero. Se não for, exiba uma mensagem de erro.

Se for maior que zero, realize a operação (saldo += valor do depósito) e exiba o novo saldo.

Case 4: Sair

Exiba uma mensagem de despedida (ex: "Obrigado por usar nosso Caixa Eletrônico! Volte sempre!").

default (Opção Inválida):

Se o usuário digitar uma opção que não seja 1, 2, 3 ou 4, exiba uma mensagem informando que a "Opção inválida" foi selecionada.

Finalização:

Após o switch, adicione uma linha para fechar o Scanner (scanner.close();).

O programa deve encerrar após a execução da opção escolhida.

🚀 Instruções para os Alunos
Crie um Novo Projeto Java:

Na sua IDE (VS Code, Eclipse, NetBeans), crie um novo projeto Java dentro da sua pasta Básico do Básico Java.

Nomeie o projeto como: Aula09_CaixaEletronico.

Crie a Classe Principal:

Dentro da pasta src/ do projeto Aula09_CaixaEletronico, crie um novo arquivo Java.

Nomeie-o como: CaixaEletronico.java.

Implemente o Código:

Dentro do método public static void main(String[] args) da classe CaixaEletronico.java, implemente toda a lógica do desafio.

Comente seu Código:

Utilize comentários (// ou /* ... */) para explicar cada seção do seu código, as variáveis, as validações e as operações. Isso é fundamental para a clareza!

Execute e Teste:

Execute seu programa várias vezes.

Teste todas as opções do menu (1, 2, 3, 4).

Teste cenários de saque:

Saque com valor positivo e saldo suficiente.

Saque com valor positivo e saldo INSUFICIENTE.

Saque com valor zero ou negativo.

Teste cenários de depósito:

Depósito com valor positivo.

Depósito com valor zero ou negativo.

Teste uma opção inválida no menu.

Entrega:

Copie e cole o código completo da sua classe CaixaEletronico.java na tarefa do Google Classroom.

💡 Dicas e Observações Importantes
Scanner.nextLine() após nextInt()/nextDouble(): Lembre-se da "pegadinha"! Após ler um número (nextInt() ou nextDouble()), o caractere Enter (\n) permanece no buffer. Se a próxima leitura for um nextLine(), ele será "consumido" imediatamente. Adicione um scanner.nextLine(); extra para limpar o buffer após ler números.

Formatação de Moeda: Use System.out.printf("R$ %.2f\n", variavel) para exibir valores monetários com duas casas decimais. Para formatar valores dentro de Strings (como na mensagem de sucesso do saque/depósito), você pode usar String.format(Locale.of("pt", "BR"), "%.2f", valor).

break; no switch: Não se esqueça do break; ao final de cada case para evitar o "fall-through" (a execução indesejada dos cases seguintes).

scanner.close();: Chame este método no final do main para liberar os recursos do Scanner.

Lógica de Validação: Pense bem nas condições dos ifs e elses para cobrir todos os cenários de erro e sucesso.

Bom desafio e boa codificação! 💪