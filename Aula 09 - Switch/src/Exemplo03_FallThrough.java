public class Exemplo03_FallThrough {

    public static void main(String[] args) {
        // Altere a etapa para 1, 2, 3 ou outro número para ver o comportamento
        int etapa = 6; 

        System.out.println("--- Exemplo de Fall-through (Sem break!) ---");
        System.out.println("Etapa inicial: " + etapa);

        switch (etapa) {
            case 1:
                System.out.println("Etapa 1: Preparar ingredientes.");
                // break; <- ATENÇÃO: O 'break' ESTÁ COMENTADO DE PROPÓSITO para mostrar o fall-through!
            case 2:
                System.out.println("Etapa 2: Misturar a massa.");
                break; // Este break impede que caia para a Etapa 3 se a etapa for 1 ou 2
            case 3:
                System.out.println("Etapa 3: Assar o bolo.");
                break;
            default:
                System.out.println("Etapa inválida.");
                break;
        }
        System.out.println("Fim do exemplo de fall-through.\n");

        // Resultado esperado:
        // Se 'etapa' for 1: Imprimirá "Etapa 1: Preparar ingredientes." E "Etapa 2: Misturar a massa."
        // Porque não há break em case 1, ele "cai" para o case 2.
        // Se 'etapa' for 2: Imprimirá apenas "Etapa 2: Misturar a massa."
        // Se 'etapa' for 3: Imprimirá apenas "Etapa 3: Assar o bolo."
    }
}
    

