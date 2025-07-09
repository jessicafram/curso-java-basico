// Classe principal para demonstrar operadores
public class CalculadoraSimples {

    public static void main(String[] args) {
        // --- Operadores Aritméticos ---
        int a = 20;
        int b = 5;

        // Adição
        int soma = a + b;
        System.out.println("Soma: " + soma); // Saída: Soma: 25

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao); // Saída: Subtracão: 15

        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao); // Saída: Multiplicação: 100

        // Divisão de inteiros (resultado inteiro, descarta decimal)
        int divisaoInteira = a / b;
        System.out.println("Divisão Inteira: " + divisaoInteira); // Saída: Divisão Inteira: 4

        // Divisão com resultado decimal (usando casting)
        double divisaoDecimal = (double) a / b;
        System.out.println("Divisão Decimal: " + divisaoDecimal); // Saída: Divisão Decimal: 4.0

        // Resto da Divisão (Módulo)
        int resto = a % 3; // 20 dividido por 3 é 6, com resto 2
        System.out.println("Resto de 20 por 3: " + resto); // Saída: Resto de 20 por 3: 2

        // --- Operadores de Atribuição Compostos ---
        System.out.println("\n--- Operadores de Atribuição Compostos ---");

        int contador = 10;
        System.out.println("Valor inicial do contador: " + contador); // Saída: Valor inicial do contador: 10

        // Adição e Atribuição (+=)
        contador += 5; // Equivalente a contador = contador + 5;
        System.out.println("Contador depois de += 5: " + contador); // Saída: Contador depois de += 5: 15

        // Subtração e Atribuição (-=)
        contador -= 3; // Equivalente a contador = contador - 3;
        System.out.println("Contador depois de -= 3: " + contador); // Saída: Contador depois de -= 3: 12

        // Multiplicação e Atribuição (*=)
        contador *= 2; // Equivalente a contador = contador * 2;
        System.out.println("Contador depois de *= 2: " + contador); // Saída: Contador depois de *= 2: 24

        // Divisão e Atribuição (/=)
        contador /= 4; // Equivalente a contador = contador / 4;
        System.out.println("Contador depois de /= 4: " + contador); // Saída: Contador depois de /= 4: 6

        // Módulo e Atribuição (%=)
        contador %= 5; // Equivalente a contador = contador % 5;
        System.out.println("Contador depois de %= 5: " + contador); // Saída: Contador depois de %= 5: 1
    }
}
