public class exercicio05 {
    public static void main (String[] args){
        int num1 = Teclado.leInt("Digite valor 1: ");
        int num2 = Teclado.leInt("Digite valor 2: ");
        int num3 = Teclado.leInt("Digite valor 3: ");
        int num4 = Teclado.leInt("Digite valor 4: ");
        int num5 = Teclado.leInt("Digite valor 5: ");

        System.out.print("\n-- Cálculos --\n");
        System.out.printf("Soma dos valores: %d\n",num1+num2+num3+num4+num5);
        System.out.printf("Produto dos valores: %d\n",num1*num2*num3*num4*num5);

    }
}
