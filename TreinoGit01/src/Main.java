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
        System.out.println("Informe a operação que deseja realizar");
        System.out.println("Digite 1 para realizar depósitos");
        System.out.println("Digite 2 para realizar retiradas");
        System.out.println("digite 3 para verificar o saldo");
        System.out.println("Digite 0 para finalizar o atendimento.");


    }
}