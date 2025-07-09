// Classe principal para demonstrar if-else if-else
public class ClassificadorDeNota {

    public static void main(String[] args) {
        // --- Exemplo 1: Classificação de Notas ---
        System.out.println("--- Classificação da Nota ---");
        double notaAluno = 7.5; // Altere este valor para testar diferentes casos
        System.out.println("Nota do aluno: " + notaAluno);

        if (notaAluno >= 9.0) { // Primeira condição: Excelente?
            System.out.println("Conceito: A (Excelente!)");
        } else if (notaAluno >= 7.0) { // Se não é 'A', é 'B'? (Ou seja, >= 7.0 e < 9.0)
            System.out.println("Conceito: B (Bom)");
        } else if (notaAluno >= 5.0) { // Se não é 'A' nem 'B', é 'C'? (Ou seja, >= 5.0 e < 7.0)
            System.out.println("Conceito: C (Regular)");
        } else { // Se nenhuma das anteriores for verdadeira (ou seja, < 5.0)
            System.out.println("Conceito: D (Insuficiente)");
        }
        System.out.println("Fim da classificação.\n");

        // --- Exemplo 2: Classificação por Idade com Condições Lógicas ---
        System.out.println("--- Classificação por Idade ---");
        int idadePessoa = 17; // Altere este valor
        System.out.println("Idade: " + idadePessoa + " anos.");

        if (idadePessoa < 12) {
            System.out.println("Classificação: Criança.");
        } else if (idadePessoa >= 12 && idadePessoa < 18) { // Entre 12 e 17 (inclusive)
            System.out.println("Classificação: Adolescente.");
        } else if (idadePessoa >= 18 && idadePessoa < 60) { // Entre 18 e 59 (inclusive)
            System.out.println("Classificação: Adulto.");
        } else { // 60 ou mais
            System.out.println("Classificação: Idoso.");
        }
        System.out.println("Fim da classificação por idade.\n");
    }
}
