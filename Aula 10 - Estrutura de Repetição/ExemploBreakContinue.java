public class ExemploBreakContinue {
    public static void main(String[] args) {
        System.out.println("--- Exemplo com break ---");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Encontrei o número 5! Parando a contagem.");
                break; // O laço for para aqui
            }
            System.out.println("Contando: " + i);
        }
        System.out.println("Loop de break finalizado.\n");

        System.out.println("--- Exemplo com continue ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) { // Se i for ímpar (resto da divisão por 2 for diferente de 0)
                System.out.println("Número ímpar (" + i + "), pulando...");
                continue; // Pula o System.out.println abaixo e vai para a próxima iteração
            }
            System.out.println("Número par: " + i);
        }
        System.out.println("Convido Você.");
    }
}