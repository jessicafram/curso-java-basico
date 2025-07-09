// Classe principal para demonstrar variáveis e tipos de dados
public class MinhasVariaveis {

    public static void main(String[] args) {
        // Exemplo de int (número inteiro)
        int minhaIdade = 25;
        System.out.println("Minha idade é: " + minhaIdade); // Saída: Minha idade é: 25

        // Exemplo de double (número decimal)
        double altura = 1.78;
        System.out.println("Minha altura é: " + altura + " metros"); // Saída: Minha altura é: 1.78 metros

        // Exemplo de char (caractere único)
        char primeiraLetra = 'A';
        System.out.println("A primeira letra do alfabeto é: " + primeiraLetra); // Saída: A primeira letra do alfabeto
                                                                                // é: A

        // Exemplo de boolean (verdadeiro/falso)
        boolean tenhoCarro = true;
        System.out.println("Eu tenho carro? " + tenhoCarro); // Saída: Eu tenho carro? true

        // Exemplo de String (texto)
        String meuNome = "Carlos Eduardo";
        System.out.println("Meu nome é: " + meuNome); // Saída: Meu nome é: Carlos Eduardo

        // Mudando o valor de uma variável existente
        minhaIdade = 26;
        System.out.println("Oops! Agora minha idade é: " + minhaIdade); // Saída: Oops! Agora minha idade é: 26

        // Combinando texto e variáveis na impressão (concatenação com +)
        System.out.println("Olá, meu nome é " + meuNome + " e eu tenho " + minhaIdade + " anos.");
        // Saída: Olá, meu nome é Carlos Eduardo e eu tenho 26 anos.
    }
}
