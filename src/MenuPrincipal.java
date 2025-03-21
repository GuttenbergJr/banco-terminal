import java.util.Scanner;

public class MenuPrincipal {
    public void exibirMenu() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Sacar             |\n");
            System.out.print("| Opção 2 - Depositar         |\n");
            System.out.print("| Opção 3 - Extrato           |\n");
            System.out.print("| Opção 4 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = scanner.nextInt();

            if (opcao == 4) {
                System.out.println("Saindo do sistema...");
                scanner.close();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 - Realizar saque");
                    break;
                case 2:
                    System.out.println("Opção 2 - Realizar depósito");
                    break;
                case 3:
                    System.out.println("Opção 3 - Emitir extrato");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
