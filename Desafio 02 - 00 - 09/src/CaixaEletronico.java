import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário
import java.util.Locale; // Importa a classe Locale para configurar o padrão de números decimais

public class CaixaEletronico {

    public static void main(String[] args) {
        // 1. Variáveis Iniciais
        // Cria um objeto Scanner para ler a entrada do teclado.
        // Configura o Scanner para usar o padrão de localização BRASILEIRO (vírgula
        // como decimal).
        // Se preferir que o usuário digite sempre com PONTO, use .useLocale(Locale.US)
        Scanner scanner = new Scanner(System.in).useLocale(Locale.of("pt", "BR")); // Alterado para usar Locale.of()

        double saldo = 1000.00; // Saldo inicial da conta (exemplo)

        System.out.println("--- BEM-VINDO AO CAIXA ELETRÔNICO JAVA! ---");
        System.out.printf("Seu saldo inicial é: R$ %.2f\n", saldo); // Exibe o saldo inicial formatado
        System.out.println("-----------------------------------------\n");

        // 2. Menu Principal
        System.out.println("--- MENU DE OPÇÕES ---");
        System.out.println("1 - Consultar Saldo");
        System.out.println("2 - Realizar Saque");
        System.out.println("3 - Realizar Depósito");
        System.out.println("4 - Sair");
        System.out.println("----------------------\n");

        System.out.print("Digite a opção desejada (1-4): ");
        int opcao = scanner.nextInt(); // Lê a opção do usuário
        scanner.nextLine(); // Consome o ENTER que sobrou após nextInt()

        // 3. Processar a Opção (usando switch!)
        switch (opcao) {
            case 1: // Opção: Consultar Saldo
                System.out.println("\n--- CONSULTA DE SALDO ---");
                System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                break; // Sai do switch

            case 2: // Opção: Realizar Saque
                System.out.println("\n--- REALIZAR SAQUE ---");
                System.out.print("Digite o valor do saque: R$ ");
                double valorSaque = scanner.nextDouble(); // Lê o valor do saque
                scanner.nextLine(); // Consome o ENTER que sobrou

                // Validação do Saque (usando if e else)
                if (valorSaque <= 0) { // Verifica se o valor é negativo ou zero
                    System.out.println("ERRO: O valor do saque deve ser maior que zero.");
                } else if (saldo >= valorSaque) { // Verifica se há saldo suficiente
                    saldo -= valorSaque; // Realiza o saque (saldo = saldo - valorSaque)
                    System.out.println("Saque de R$ " + String.format(Locale.of("pt", "BR"), "%.2f", valorSaque)
                            + " realizado com sucesso!");
                    System.out.printf("Novo saldo: R$ %.2f\n", saldo);
                } else { // Saldo insuficiente
                    System.out.println("ERRO: Saldo insuficiente para realizar o saque.");
                    System.out.printf("Seu saldo atual é: R$ %.2f\n", saldo);
                }
                break; // Sai do switch

            case 3: // Opção: Realizar Depósito
                System.out.println("\n--- REALIZAR DEPÓSITO ---");
                System.out.print("Digite o valor do depósito: R$ ");
                double valorDeposito = scanner.nextDouble(); // Lê o valor do depósito
                scanner.nextLine(); // Consome o ENTER que sobrou

                // Validação do Depósito (usando if e else)
                if (valorDeposito <= 0) { // Verifica se o valor é negativo ou zero
                    System.out.println("ERRO: O valor do depósito deve ser maior que zero.");
                } else {
                    saldo += valorDeposito; // Realiza o depósito (saldo = saldo + valorDeposito)
                    System.out.println("Depósito de R$ " + String.format(Locale.of("pt", "BR"), "%.2f", valorDeposito)
                            + " realizado com sucesso!");
                    System.out.printf("Novo saldo: R$ %.2f\n", saldo);
                }
                break; // Sai do switch

            case 4: // Opção: Sair
                System.out.println("\n--- SAIR ---");
                System.out.println("Obrigado por usar nosso Caixa Eletrônico! Volte sempre!");
                break; // Sai do switch

            default: // Opção: Inválida (se o usuário digitar algo fora de 1-4)
                System.out.println("\nERRO: Opção inválida. Por favor, escolha um número de 1 a 4.");
                break; // É boa prática ter um break no default também
        }

        System.out.println("\n-----------------------------------------");
        System.out.println("Fim da operação.");

        scanner.close(); // Fecha o Scanner para liberar os recursos do sistema
    }
}
