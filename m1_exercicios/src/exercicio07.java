public class exercicio07 {
    public static void main (String[] args){
        double nota1 = Teclado.leDouble("Digite a nota do trabalho (10% da nota): ");
        double nota2 = Teclado.leDouble("Digite a nota da prova (60% da nota): ");
        double nota3 = Teclado.leDouble("Digite a nota do teste (30% da nota): ");
        double mediaPonderada = ((nota1*10) + (nota2*60) + (nota3*30))/(10+60+30);

        System.out.printf("\n\nNota Final: %.1f\n",mediaPonderada);
    }
}
