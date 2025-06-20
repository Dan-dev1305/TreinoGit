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
            System.out.printf("Seu novo saldo é de R$%.2f%n", saldo);
        }else {
            System.out.println("Saldo insufuciente para executar esta operação");
        }
    }
}
