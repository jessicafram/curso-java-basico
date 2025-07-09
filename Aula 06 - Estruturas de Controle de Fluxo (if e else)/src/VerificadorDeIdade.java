// Classe principal para demonstrar Estruturas de Controle de Fluxo (if e else)
public class VerificadorDeIdade {

    public static void main(String[] args) {
        // --- Exemplo 1: if simples (Verificação de CNH) ---
        System.out.println("--- Verificação de CNH ---");
        int idadeCandidato = 17;
        System.out.println("Idade do candidato: " + idadeCandidato + " anos.");

        if (idadeCandidato >= 18) { // Se a idade for maior ou igual a 18
            System.out.println("Parabéns! Você já pode tirar sua CNH.");
        }
        System.out.println("Fim da verificação da CNH.\n");

        // --- Exemplo 2: if-else (Operação de Saque Bancário) ---
        System.out.println("--- Operação de Saque ---");
        double saldoBancario = 500.0;
        double valorSaque = 600.0;

        System.out.println("Saldo atual: R$" + saldoBancario);
        System.out.println("Valor do saque solicitado: R$" + valorSaque);

        if (saldoBancario >= valorSaque) { // Se o saldo for suficiente
            saldoBancario -= valorSaque; // Reduz o saldo
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Novo saldo: R$" + saldoBancario);
        } else { // Se o saldo NÃO for suficiente
            System.out.println("ERRO: Saldo insuficiente para realizar o saque.");
            System.out.println("Seu saldo continua: R$" + saldoBancario);
        }
        System.out.println("Fim da operação de saque.\n");

        // --- Exemplo 3: if com operador lógico (Entrada no Evento) ---
        System.out.println("--- Entrada no Evento ---");
        boolean temIngresso = true;
        int idadePessoa = 20;

        System.out.println("Tem ingresso: " + temIngresso + ", Idade: " + idadePessoa + " anos.");

        if (temIngresso && idadePessoa >= 18) { // Se tem ingresso E é maior de 18
            System.out.println("Bem-vindo(a) ao evento!");
        } else {
            System.out.println("Desculpe, você não pode entrar no evento.");
            // Podemos ser mais específicos aqui, mas por enquanto, vamos simplificar.
        }
        System.out.println("Fim da verificação de entrada.\n");
    }
}
