import java.util.Scanner;

public class ChatbotEspelho {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("+------------------------------------------+");
        System.out.println("|            ESPELHO CONSULTOR             |");
        System.out.println("+------------------------------------------+");
        System.out.println("Olá! Estou aqui para ajudar no provador.");

        while (true) {
            System.out.println("\nComo posso ajudar?\n"
                    + "1 - Solicitar outro tamanho\n"
                    + "2 - Solicitar outra cor\n"
                    + "3 - Receber uma sugestão de combinação\n"
                    + "4 - Comprar a peça\n"
                    + "0 - Encerrar atendimento");
            System.out.print("Digite uma opção: ");
            String opcao = teclado.nextLine().trim();

            switch (opcao) {
                case "1":
                    atenderTamanho(teclado);
                    break;
                case "2":
                    atenderCor(teclado);
                    break;
                case "3":
                    recomendarCombinacao(teclado);
                    break;
                case "4":
                    finalizarCompra(teclado);
                    break;
                case "0":
                    System.out.println("\nAtendimento encerrado. Obrigado!");
                    teclado.close();
                    return;
                default:
                    mostrarOpcaoInvalida();
            }
        }
    }

    static void atenderTamanho(Scanner teclado) {
        while (true) {
            System.out.println("\nQual tamanho você deseja?\n"
                    + "1 - Um tamanho maior\n"
                    + "2 - Dois tamanhos maiores\n"
                    + "3 - Chamar um atendente\n"
                    + "9 - Voltar");
            System.out.print("Digite uma opção: ");
            String opcao = teclado.nextLine().trim();

            switch (opcao) {
                case "1":
                    System.out.println("Solicitação registrada: um tamanho maior.");
                    return;
                case "2":
                    System.out.println("Solicitação registrada: dois tamanhos maiores.");
                    return;
                case "3":
                    System.out.println("Um atendente foi chamado para ajudar.");
                    return;
                case "9":
                    return;
                default:
                    mostrarOpcaoInvalida();
            }
        }
    }

    static void atenderCor(Scanner teclado) {
        while (true) {
            System.out.println("\nQual cor você gostaria de experimentar?\n"
                    + "1 - Preta\n"
                    + "2 - Branca\n"
                    + "3 - Azul\n"
                    + "4 - Ver outras cores com um atendente\n"
                    + "9 - Voltar");
            System.out.print("Digite uma opção: ");
            String opcao = teclado.nextLine().trim();

            switch (opcao) {
                case "1":
                    System.out.println("Solicitação registrada: peça na cor preta.");
                    return;
                case "2":
                    System.out.println("Solicitação registrada: peça na cor branca.");
                    return;
                case "3":
                    System.out.println("Solicitação registrada: peça na cor azul.");
                    return;
                case "4":
                    System.out.println("Um atendente foi chamado para mostrar outras cores.");
                    return;
                case "9":
                    return;
                default:
                    mostrarOpcaoInvalida();
            }
        }
    }

    static void recomendarCombinacao(Scanner teclado) {
        while (true) {
            System.out.println("\nPara qual ocasião você deseja uma combinação?\n"
                    + "1 - Casual\n"
                    + "2 - Trabalho\n"
                    + "3 - Festa\n"
                    + "4 - Esportiva\n"
                    + "9 - Voltar");
            System.out.print("Digite uma opção: ");
            String opcao = teclado.nextLine().trim();

            switch (opcao) {
                case "1":
                    System.out.println("Sugestão: calça jeans e tênis.");
                    return;
                case "2":
                    System.out.println("Sugestão: calça social e sapato neutro.");
                    return;
                case "3":
                    System.out.println("Sugestão: acessórios discretos e sapato escuro.");
                    return;
                case "4":
                    System.out.println("Sugestão: calça leve e tênis esportivo.");
                    return;
                case "9":
                    return;
                default:
                    mostrarOpcaoInvalida();
            }
        }
    }

    static void finalizarCompra(Scanner teclado) {
        while (true) {
            System.out.println("\nDeseja comprar esta peça?\n"
                    + "1 - Sim\n"
                    + "2 - Não\n"
                    + "9 - Voltar");
            System.out.print("Digite uma opção: ");
            String opcao = teclado.nextLine().trim();

            switch (opcao) {
                case "1":
                    System.out.println("Um atendente foi chamado para finalizar a compra.");
                    return;
                case "2":
                    System.out.println("Tudo bem! Continue experimentando a peça.");
                    return;
                case "9":
                    return;
                default:
                    mostrarOpcaoInvalida();
            }
        }
    }

    static void mostrarOpcaoInvalida() {
        System.out.println("Opção inválida. Tente novamente.");
    }
}
