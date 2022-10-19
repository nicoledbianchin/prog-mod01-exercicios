public class exercicio06 {
    public static void main (String[] args){
        int A = Teclado.leInt("Digite o valor A: ");
        int B = Teclado.leInt("Digite o valor B: ");
        int C = Teclado.leInt("Digite o valor C: ");
        int D = Teclado.leInt("Digite o valor D: ");
        int E = Teclado.leInt("Digite o valor E: ");

        System.out.print("\n-- Cálculos --\n");
        System.out.printf("Área do Triângulo: %.2f\n",(double)((B*C)/2));
        System.out.printf("Perímetro do Retângulo: %d\n", 2*(B+C));
        System.out.printf("Área do Círculo: %.2f\n", 3.1415 * (Math.pow(E,2)));

    }
}
