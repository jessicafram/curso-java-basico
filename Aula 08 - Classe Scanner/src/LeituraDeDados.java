
// Importa a classe Scanner do pacote java.util
import java.util.Scanner;

// Classe principal para demonstrar o uso da Classe Scanner
public class LeituraDeDados {

    public static void main(String[] args) {
        // --- Exemplo 1: Lendo o nome do usuário (String) ---
        System.out.println("--- Exemplo 1: Lendo String ---");
        // 1. Criar um objeto Scanner para ler a entrada do teclado
        Scanner scannerNome = new Scanner(System.in);

        // 2. Pedir para o usuário digitar o nome
        System.out.print("Digite seu nome completo: ");

        // 3. Ler a linha inteira de texto digitada pelo usuário
        String nomeCompleto = scannerNome.nextLine();

        // 4. Exibir o nome lido
        System.out.println("Olá, " + nomeCompleto + "! Bem-vindo(a) ao programa.");
        System.out.println(); // Pula uma linha para melhor visualização

        // É uma boa prática fechar o Scanner quando não for mais usá-lo
        // Mas, para System.in, é comum manter aberto ou fechar apenas no final do
        // programa principal.
        // Para este exemplo, vamos fechar para demonstrar, mas em um programa maior,
        // pode ser diferente.
        scannerNome.close();

        // --- Exemplo 2: Lendo idade (int) e altura (double) ---
        System.out.println("--- Exemplo 2: Lendo int e double ---");
        // Criamos um novo Scanner, pois o anterior foi fechado.
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scannerNumeros.nextInt();

        System.out.print("Digite sua altura (ex: 1,75): ");
        double altura = scannerNumeros.nextDouble();

        System.out.println("Você tem " + idade + " anos e " + altura + "m de altura.");
        System.out.println();

        // --- Exemplo 3: Lendo múltiplas entradas e resolvendo o "problema do
        // nextLine()" ---
        System.out.println("--- Exemplo 3: Lendo múltiplas entradas (nextLine() após nextInt()/nextDouble()) ---");
        Scanner scannerMisto = new Scanner(System.in);

        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = scannerMisto.nextInt();

        // PROBLEMA: nextInt() não consome a quebra de linha (Enter) que o usuário
        // digita.
        // Se chamarmos nextLine() logo em seguida, ele lerá essa quebra de linha vazia.
        // SOLUÇÃO: Chamar nextLine() extra para consumir a quebra de linha pendente.
        scannerMisto.nextLine(); // Consome a quebra de linha pendente após nextInt()

        System.out.print("Digite sua cidade natal: ");
        String cidadeNatal = scannerMisto.nextLine();

        System.out.println("Você nasceu em " + anoNascimento + " e sua cidade natal é " + cidadeNatal + ".");

        // Fechar todos os Scanners abertos
        scannerNumeros.close();
        scannerMisto.close();
    }
}
