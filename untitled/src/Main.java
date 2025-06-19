import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do aluno");
        aluno.nome = entrada.nextLine();
        System.out.println("Informe a matrícula do aluno");
        aluno.matricula = entrada.nextInt();
        System.out.println("Informe a nota que tirou no teste");
        aluno.notasTeste = entrada.nextDouble();
        System.out.println("Informe a nota da prova");
        aluno.notasProva = entrada.nextDouble();


    }
}