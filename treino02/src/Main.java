import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Informe o nome do titular da conta");
        conta.nomeTitular = entrada.nextLine();
        System.out.println("Informe o número da conta");
        conta.numeroConta = entrada.nextInt();
        System.out.println("Informe o valor do seu saldo atual");
        conta.saldo = entrada.nextDouble();
        System.out.println("Informe a operação que deseja realizar");
        System.out.println("Digite 1 para realizar depósitos");
        System.out.println("Digite 2 para realizar retiradas");
        System.out.println("Digite 3 para verificar o saldo");
        System.out.println("Digite 4 para o detalhamento de sua conta");
        System.out.println("Digite 0 para finalizar o atendimento.");
        int operacao = entrada.nextInt();
        while (operacao == 1){
            System.out.println("Informe o valor a ser depositado");
            conta.deposito = entrada.nextDouble();
            conta.depositoConta();
            System.out.printf("Depósito realizado com sucesso. Seu novo saldo é de %.2f%n", conta.saldo);
        }while (operacao ==2){
            System.out.println("Informe o valor a ser retirado");
            conta.retirada = entrada.nextDouble();
            System.out.println("Retirada efetuada com sucesso");
            System.out.printf("Seu novo saldo é de .2%f%n", conta.saldo);
        }
    }
}