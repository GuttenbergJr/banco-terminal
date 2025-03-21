package banco;

public class Depositar {
    public double realizarDeposito(double saldo, double valorDeposito) {
        saldo += valorDeposito;
        return saldo;
    }
}
