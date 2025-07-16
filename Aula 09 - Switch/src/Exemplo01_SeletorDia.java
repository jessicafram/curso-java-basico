public class Exemplo01_SeletorDia {

    public static void main(String[] args) {
        // Altere este número (1 a 7) para testar diferentes dias
        int diaDaSemana = 8;

        System.out.println("---Qual é o dia da semana?---");
        System.out.println("Número digitado:" + diaDaSemana);

        // A estrutura switch avalia o valor de 'diaDaSemana'
        switch (diaDaSemana) {
            case 1: // Se diaDaSemana for 1
               System.out.println("Hoje né Domingo!");
               break; // Importante. Sai do bloco Switch

            case 2: // Se diaDaSemana for 2
               System.out.println("Hoje é Segunda-feira"); 
               break;  

            case 3: // Se diaDaSemana for 3
               System.out.println("Hoje é Terça-feira"); 
               break;
               
            case 4: // Se diaDaSemana for 4
               System.out.println("Hoje é Quarta-feira"); 
               break; 
               
            case 5: // Se diaDaSemana for 5
               System.out.println("Hoje é Quinta-feira"); 
               break;
               
            case 6: // Se diaDaSemana for 6
               System.out.println("Hoje é Sexta-feira"); 
               break;
               
            case 7: // Se diaDaSemana for 7
               System.out.println("Hoje é Sábado"); 
               break;    
               
            default: // Se 'diaDaSemana' não corresponder a nenhum dos cases acima
               System.out.println("Número de dia inválido. Por favor, digite um número de 1 a 7");
               break;


        }
            
        }
    }
