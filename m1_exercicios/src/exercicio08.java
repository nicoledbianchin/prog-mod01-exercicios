public class exercicio08 {
    public static void main (String[] args){
        //Leitura das Notas de Grau A
        double nota1A = Teclado.leDouble("Digite a nota da Atividade prática (45% da nota do Grau A): ");
        double nota2A = Teclado.leDouble("Digite a nota da Atividade teórica (55% da nota do Grau A): ");

        //Leitura das Notas de Grau B
        System.out.println();
        double nota1B = Teclado.leDouble("Digite a nota da Prova em Laboratório (60% da nota do Grau B): ");
        double nota2B = Teclado.leDouble("Digite a nota do Teste teórico (20% da nota do Grau B): ");
        double nota3B = Teclado.leDouble("Digite a nota do Trabalho extraclasse (20% da nota do Grau B): ");

        //Cálculo da Média das Notas de Grau A
        double mediaPonderadaGrauA = ((nota1A*45) + (nota2A*55))/(45+55);
        //Cálculo da Média das Notas de Grau B
        double mediaPonderadaGrauB = ((nota1B*60) + (nota2B*20) + (nota3B*20))/(60+20+20);
        //Cálculo da Média Final
        double mediaPonderadaFinal = ((mediaPonderadaGrauA*33) + (mediaPonderadaGrauB*67))/(33+67);

        System.out.printf("\n\nNota Final: %.1f\n",mediaPonderadaFinal);
    }
}
