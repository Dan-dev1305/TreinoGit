public class Aluno {
    String nome;
    int matricula;
    double notasTeste;
    double notasProva;
    double media;

    double calcularNota(){
        return media = (notasTeste + notasProva)/2;
    }

    void resultadoFinal(){
        if (media >=7){
            System.out.println("Parabéns você foi aprovado por média");
            System.out.printf("Sua média foi de %.2f%n", media);
        }else {
            System.out.println("Infelizmente você foi reprovado");
            System.out.printf("Sua média foi de %.2f%n", media);
        }
    }



}
