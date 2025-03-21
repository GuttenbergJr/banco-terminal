import java.util.Scanner;
import banco.Sacar;
import banco.Depositar;
// import banco.Extrato;

public class MenuPrincipal {
    public void exibirMenu(String nomeUsuario, String agenciaUsuario, int contaUsuario, double saldoUsuario) {

        // instanciando o Scanner
        Scanner scanner = new Scanner(System.in);
        // instanciando as classes Sacar, Depositar e Extrato.
        Sacar sacar = new Sacar();
        Depositar depositar = new Depositar();
        // Extrato extrato = new Extrato();

        while (true) {
            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Sacar             |\n");
            System.out.print("| Opção 2 - Depositar         |\n");
            System.out.print("| Opção 3 - Extrato           |\n");
            System.out.print("| Opção 4 - Infos. conta      |\n");
            System.out.print("| Opção 0 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = scanner.nextInt();
            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
                scanner.close();
            }

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 - Realizar saque");

                    // informar o valor do saque
                    System.out.println("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();

                    // instanciar a classe Sacar
                    saldoUsuario = sacar.realizarSaque(saldoUsuario, valorSaque);
                    System.out.println("Saldo atual: R$" + saldoUsuario);
                    break;
                case 2:
                    System.out.println("Opção 2 - Realizar depósito");

                    // informar o valor do depósito
                    System.out.println("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();

                    // instanciar a classe Depositar
                    saldoUsuario = depositar.realizarDeposito(saldoUsuario, valorDeposito);
                    System.out.println("Saldo atual: R$" + saldoUsuario);
                    break;
                case 3:
                    System.out.println("Opção 3 - Emitir extrato");
                    break;
                case 4:
                    System.out.println("Opção 4 - Informações da conta");
                    System.out.println(nomeUsuario);
                    System.out.println(agenciaUsuario);
                    System.out.println(contaUsuario);
                    System.out.println(saldoUsuario);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
