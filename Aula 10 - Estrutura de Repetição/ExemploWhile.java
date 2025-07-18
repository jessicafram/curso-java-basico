import java.util.Scanner; // Importa a classe Scanner para ler entrada do usuário [cite: 1047]

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner [cite: 1047]
        int numeroSecreto = 7;
        int tentativa;

        System.out.println("--- Jogo da Adivinhação ---");
        System.out.println("Adivinhe o número secreto (entre 1 e 10):");

        // O laço continua enquanto a tentativa não for igual ao número secreto
        while (true) { // Usamos true para um loop infinito que será quebrado por 'break'
            System.out.print("Sua tentativa: ");
            tentativa = scanner.nextInt(); // Lê um número inteiro digitado pelo usuário

            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto!");
                break; // Sai imediatamente do laço while
            } else if (tentativa < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        scanner.close(); // Fecha o Scanner para liberar recursos
        System.out.println("Fim do jogo.");
    }
}