public class Exemplo02_ClassificadorNota {

    public static void main(String[] args) {
        // Altere este conceito (ex: "A", "B", "C", "D" ou outro) para testar
        String conceitoNota = "B"; 

        System.out.println("--- Avaliação do Conceito ---");
        System.out.println("Conceito recebido: " + conceitoNota);

        // O switch pode avaliar Strings a partir do Java 7
        switch (conceitoNota) {
            case "A":
                System.out.println("Excelente! Você superou as expectativas.");
                break;

            case "B":
                System.out.println("Muito Bom! Você alcançou um ótimo resultado.");
                break;

            case "C":
                System.out.println("Bom! Você atingiu as expectativas.");
                break;

            case "D":
                System.out.println("Precisa melhorar. Estude mais para a próxima.");
                break;

            default:
                System.out.println("Conceito inválido. Verifique o valor digitado.");
                break;
        }
        System.out.println("Fim da avaliação.\n");
    }
}