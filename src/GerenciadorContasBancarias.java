public class GerenciadorContasBancarias {

    //Iniciando os arrays
    String[] nomes = new String[5];
    String[] agencia = new String[5];
    int[] conta = new int[5];
    double[] saldo = new double[5];
    //Posição para a interação com o usuário
    int posicao = 0;
    

    public String solicitarNome(String nomeUsuario){
        String usuarioAtual = nomeUsuario;
        return usuarioAtual;
    }

    public String solicitarAgencia(String agenciaUsuario){
        String agenciaAtual = agenciaUsuario;
        return agenciaAtual;
    }

    public int solicitarConta(int contaUsuario){
        int contaAtual = contaUsuario;
        return contaAtual;
    }

    public double solicitarSaldo(double saldoUsuario){
        double saldoAtual = saldoUsuario;
        return saldoAtual;
    }

    public void cadastrarInformacoes(String nomeUsuario, String agenciaUsuario, int contaUsuario, double saldoUsuario){
        nomes[posicao] = nomeUsuario;
        agencia[posicao] = agenciaUsuario;
        conta[posicao] = contaUsuario;
        saldo[posicao] = saldoUsuario;
        posicao++;
    }

}
