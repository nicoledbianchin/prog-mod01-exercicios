public class exercicio03 {
    public static void main (String[] args){
        String nome = Teclado.leString("Digite seu nome: \n");
        System.out.printf(nome);

        double altura = Teclado.leDouble("Digite sua altura em metros: \n");
        System.out.printf("%.2f\n", altura);
        System.out.printf("Obrigada!");


    }
}
