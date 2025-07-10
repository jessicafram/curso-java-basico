# Aula 09: A Escolha Direta - Estruturas de Controle de Fluxo: `switch`

Este diretório contém os códigos de exemplo e observações da **Aula 09** do curso "Básico do Básico Java", focada na estrutura de controle `switch`.

---

## 📚 Visão Geral da Aula

Nesta aula, exploramos uma alternativa elegante e eficiente ao `if-else if-else` quando lidamos com **múltiplas escolhas baseadas em um único valor**. A estrutura `switch` é ideal para cenários como menus de opções, dias da semana, meses do ano, e outras classificações diretas.

**Aprendemos:**

* O conceito do `switch` como um "distribuidor" de tarefas.
* A sintaxe básica do `switch`, incluindo `case`, `break;` e `default:`.
* A crucial importância do `break;` para evitar o "fall-through".
* As diferenças e quando usar `switch` versus `if-else if-else`.

---

## 💡 Conceitos Chave e Sintaxe

### A Estrutura `switch`

A estrutura `switch` avalia o valor de uma **expressão** e a compara com os valores definidos nos blocos `case`. O código do primeiro `case` que corresponder será executado.

**Sintaxe:**

```java
switch (expressao) { // A 'expressao' pode ser int, byte, short, char, String, ou enum (a partir do Java 7)
    case valor1:
        // Código a ser executado se 'expressao' for igual a 'valor1'
        break; // Essencial para sair do switch!

    case valor2:
        // Código a ser executado se 'expressao' for igual a 'valor2'
        break;

    case valorN: // Pode ter múltiplos 'case's
        // Código para este valor
        break;

    default: // Opcional: Executa se nenhum 'case' der match
        // Código para caso nenhum valor corresponda
        break; // Boa prática ter um break aqui também
}
expressao: O valor que será comparado.

case valorX:: Define um valor específico. Se expressao == valorX, este bloco executa.

break;: FUNDAMENTAL! Sem ele, o código continuará executando os cases seguintes (fenômeno chamado "fall-through").

default:: Funciona como um else final.

switch vs. if-else if-else
Característica

if-else if-else

switch

Condições

Testes complexos (>, <, &&, `

Tipo de Valor

Qualquer tipo que resulte em boolean.

int, byte, short, char, String (Java 7+), enum.

Legibilidade

Pode ficar longo e menos legível com muitas condições.

Mais limpo e claro para muitas opções fixas.

Flexibilidade

Mais flexível, pode lidar com qualquer lógica.

Mais restrito, apenas para igualdade de valor.


Exportar para as Planilhas
💻 Códigos de Exemplo e Execução
Abaixo estão os códigos de exemplo da aula, cada um em seu próprio arquivo .java. Você pode abrir cada arquivo no VS Code e executá-lo individualmente para observar seu comportamento.

1. Exemplo01_SeletorDia.java
Propósito: Demonstrar o uso básico do switch para identificar o dia da semana a partir de um número inteiro.

Código:

Java

public class Exemplo01_SeletorDia {

    public static void main(String[] args) {
        // Altere este número (1 a 7) para testar diferentes dias
        int diaDaSemana = 3; 

        System.out.println("--- Qual é o dia da semana? ---");
        System.out.println("Número digitado: " + diaDaSemana);

        // A estrutura switch avalia o valor de 'diaDaSemana'
        switch (diaDaSemana) {
            case 1: // Se diaDaSemana for 1
                System.out.println("Hoje é Domingo!");
                break; // IMPORTANTE: Sai do bloco switch

            case 2: // Se diaDaSemana for 2
                System.out.println("Hoje é Segunda-feira!");
                break;

            case 3: // Se diaDaSemana for 3
                System.out.println("Hoje é Terça-feira!");
                break;

            case 4: // Se diaDaSemana for 4
                System.out.println("Hoje é Quarta-feira!");
                break;

            case 5: // Se diaDaSemana for 5
                System.out.println("Hoje é Quinta-feira!");
                break;

            case 6: // Se diaDaSemana for 6
                System.out.println("Hoje é Sexta-feira!");
                break;

            case 7: // Se diaDaSemana for 7
                System.out.println("Hoje é Sábado!");
                break;

            default: // Se 'diaDaSemana' não corresponder a nenhum dos cases acima
                System.out.println("Número de dia inválido. Por favor, digite um número de 1 a 7.");
                break; // É boa prática ter um break no default também
        }
        System.out.println("Fim da verificação do dia.\n");
    }
}
Execução e Observações:

Com diaDaSemana = 3: A saída será:

--- Qual é o dia da semana? ---
Número digitado: 3
Hoje é Terça-feira!
Fim da verificação do dia.
O programa encontra case 3, executa o System.out.println e o break; faz com que ele saia imediatamente do switch.

Com diaDaSemana = 8: A saída será:

--- Qual é o dia da semana? ---
Número digitado: 8
Número de dia inválido. Por favor, digite um número de 1 a 7.
Fim da verificação do dia.
Nenhum case corresponde, então o bloco default é executado.

2. Exemplo02_ClassificadorNota.java
Propósito: Mostrar o uso do switch com valores do tipo String (texto) para classificar notas por conceito.

Código:

Java

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
Execução e Observações:

Com conceitoNota = "B": A saída será:

--- Avaliação do Conceito ---
Conceito recebido: B
Muito Bom! Você alcançou um ótimo resultado.
Fim da avaliação.
O switch compara a String "B" com os cases e executa o que corresponde.

Com conceitoNota = "F": A saída será:

--- Avaliação do Conceito ---
Conceito recebido: F
Conceito inválido. Verifique o valor digitado.
Fim da avaliação.
Nenhum case corresponde, então o default é ativado.

3. Exemplo03_FallThrough.java
Propósito: Demonstrar o que acontece (o "fall-through") quando o break; é esquecido em um case. Isso é um comportamento comum, geralmente indesejado, mas importante de entender.

Código:

Java

public class Exemplo03_FallThrough {

    public static void main(String[] args) {
        // Altere a etapa para 1, 2, 3 ou outro número para ver o comportamento
        int etapa = 1; 

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
    }
}
Execução e Observações:

Com etapa = 1 (e break comentado no case 1): A saída será:

--- Exemplo de Fall-through (Sem break!) ---
Etapa inicial: 1
Etapa 1: Preparar ingredientes.
Etapa 2: Misturar a massa.
Fim do exemplo de fall-through.
Observação: O programa executa o case 1 e, como não há break;, ele "cai" (fall-through) para o case 2 e o executa também, até encontrar o break; do case 2.

Com etapa = 2 (e break comentado no case 1): A saída será:

--- Exemplo de Fall-through (Sem break!) ---
Etapa inicial: 2
Etapa 2: Misturar a massa.
Fim do exemplo de fall-through.
Observação: O programa vai direto para o case 2 e executa apenas ele, pois o break; está presente.