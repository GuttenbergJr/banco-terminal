package banco;

public class Sacar {
    public double realizarSaque(double saldo, double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
        return saldo;
    }
}
