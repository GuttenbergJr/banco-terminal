import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args){

        GerenciadorContasBancarias gerenciador = new GerenciadorContasBancarias();
        MenuPrincipal menu = new MenuPrincipal();

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();
        gerenciador.solicitarNome(nome);

        System.out.println("Digite sua agência:");
        String agencia = scanner.nextLine();
        gerenciador.solicitarAgencia(agencia);

        System.out.println("Digite sua conta:");
        int conta = scanner.nextInt();
        gerenciador.solicitarConta(conta);

        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();
        gerenciador.solicitarSaldo(saldo);

        // Imprimindo todos os elementos dos arrays
        System.out.println("Nomes:");
        for (String n : gerenciador.nomes) {
            if (n != null) {
                System.out.println(n);
            }
        }

        System.out.println("Agências:");
        for (String a : gerenciador.agencia) {
            if (a != null) {
                System.out.println(a);
            }
        }

        System.out.println("Contas:");
        for (int c : gerenciador.conta) {
            if (c != 0) {
                System.out.println(c);
            }
        }

        System.out.println("Saldos:");
        for (double s : gerenciador.saldo) {
            if (s != 0.0) {
                System.out.println(s);
     
            }
        }
    }
}
