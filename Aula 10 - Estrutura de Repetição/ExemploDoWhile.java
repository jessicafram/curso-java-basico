import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Iniciar Jogo");
            System.out.println("2. Opções");
            System.out.println("S. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.next().charAt(0); // Lê o primeiro caractere da entrada do usuário

            switch (opcao) { // Usando o switch que aprendemos!
                case '1':
                    System.out.println("Iniciando o jogo...");
                    break;
                case '2':
                    System.out.println("Abrindo opções...");
                    break;
                case 'S':
                case 's':
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 'S' && opcao != 's'); // O laço continua enquanto a opção não for 'S' ou 's'

        scanner.close();
    }
}