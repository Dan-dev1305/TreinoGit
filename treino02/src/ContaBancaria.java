public class ContaBancaria {
    String nomeTitular;
    double saldo;
    double deposito;
    double retirada;
    int numeroConta;

    double depositoConta(){
        return saldo += deposito;
    }

    void retiradaConta(){
        if (retirada < saldo){
            saldo -= retirada;
            System.out.println("Retirada executada com sucesso.");
        }else {
            System.out.println("Saldo insufuciente para executar esta operação");
        }
    }
}
