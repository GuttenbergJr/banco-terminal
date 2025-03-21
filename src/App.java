import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args){
        //Instanciando a classe MenuPrincipal e GerenciadorContasBancarias
        MenuPrincipal menu = new MenuPrincipal();
        //Instanciando o Scanner
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        //Solicitando informações ao usuário.
        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite sua agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite sua conta:");
        int conta = scanner.nextInt();
        
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();
 
        //Exibindo o menu
        menu.exibirMenu(nome, agencia, conta, saldo);
        scanner.close();
    }
}
