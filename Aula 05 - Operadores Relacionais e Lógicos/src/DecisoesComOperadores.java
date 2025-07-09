// Classe principal para demonstrar decisões com operadores
public class DecisoesComOperadores {

    public static void main(String[] args) {
        // Exemplos de Operadores Relacionais
        System.out.println("--- Operadores Relacionais ---");

        int numero1 = 15;
        int numero2 = 10;
        int numero3 = 15;

        System.out.println("numero1 = " + numero1 + ", numero2 = " + numero2 + ", numero3 = " + numero3);

        boolean ehIgual = (numero1 == numero3); // 15 é igual a 15?
        System.out.println("numero1 == numero3? " + ehIgual); // Saída: true

        boolean ehDiferente = (numero1 != numero2); // 15 é diferente de 10?
        System.out.println("numero1 != numero2? " + ehDiferente); // Saída: true

        boolean ehMaior = (numero1 > numero2); // 15 é maior que 10?
        System.out.println("numero1 > numero2? " + ehMaior); // Saída: true

        boolean ehMenorOuIgual = (numero2 <= numero1); // 10 é menor ou igual a 15?
        System.out.println("numero2 <= numero1? " + ehMenorOuIgual); // Saída: true

        // --- Exemplos de Operadores Lógicos ---
        System.out.println("\n--- Operadores Lógicos ---");

        boolean condicao1 = (numero1 > numero2); // true (15 > 10)
        boolean condicao2 = (numero2 < 5); // false (10 < 5)
        boolean condicao3 = (numero1 == numero3); // true (15 == 15)

        System.out.println("Condicao1 (15 > 10): " + condicao1); // true
        System.out.println("Condicao2 (10 < 5): " + condicao2); // false
        System.out.println("Condicao3 (15 == 15): " + condicao3); // true

        // Operador AND (&&)
        // Verdadeiro SE E SOMENTE SE TODAS as condições forem verdadeiras.
        boolean resultadoAnd1 = (condicao1 && condicao2); // true && false
        System.out.println("Condicao1 && Condicao2? " + resultadoAnd1); // Saída: false

        boolean resultadoAnd2 = (condicao1 && condicao3); // true && true
        System.out.println("Condicao1 && Condicao3? " + resultadoAnd2); // Saída: true

        // Operador OR (||)
        // Verdadeiro SE PELO MENOS UMA das condições for verdadeira.
        boolean resultadoOr1 = (condicao1 || condicao2); // true || false
        System.out.println("Condicao1 || Condicao2? " + resultadoOr1); // Saída: true

        boolean resultadoOr2 = (condicao2 || false); // false || false
        System.out.println("Condicao2 || false? " + resultadoOr2); // Saída: false

        // Operador NOT (!)
        // Inverte o valor booleano.
        boolean resultadoNot1 = !condicao1; // !true
        System.out.println("!Condicao1? " + resultadoNot1); // Saída: false

        boolean resultadoNot2 = !condicao2; // !false
        System.out.println("!Condicao2? " + resultadoNot2); // Saída: true

        // Exemplo combinando tudo: Um aluno passa se tiver nota >= 7 E frequência >=
        // 75%
        System.out.println("\n--- Exemplo de Decisão ---");

        double nota = 8.0;
        double frequencia = 80.0; // Em porcentagem

        boolean passouPorNota = (nota >= 7.0);
        boolean passouPorFrequencia = (frequencia >= 75.0);

        boolean statusAprovacao = (passouPorNota && passouPorFrequencia);

        System.out.println("Aluno Aprovado? " + statusAprovacao); // Saída: true
        System.out.println("Nota: " + nota + ", Frequência: " + frequencia + "%");

        // E se a frequência fosse baixa?
        frequencia = 70.0;

        passouPorFrequencia = (frequencia >= 75.0); // Agora é false
        statusAprovacao = (passouPorNota && passouPorFrequencia); // true && false

        System.out.println("Nova Frequência: " + frequencia + "%");
        System.out.println("Aluno Aprovado com nova frequência? " + statusAprovacao); // Saída: false
    }
}
