public class Principal {
    public static void main(String[] args) {
        Exercicios2 e = new Exercicios2();
        System.out.println("***** EXERCÍCIO 1 *****");
        e.exercicio1();

        System.out.println("***** EXERCÍCIO 2 *****");
        e.exercicio2();

        System.out.println("***** EXERCÍCIO 3 *****");
        int[] arrayEx3 = {10, 20, 30, 40, 50};
        System.out.println(e.exercicio3(arrayEx3));

        System.out.println("***** EXERCÍCIO 4 *****");
        String[] nomes = {"João", "Maria", "Pedro", "Aristóteles", "Petrônio", "Renata"};
        if(e.procuraNome(nomes, "Pedro"))
            System.out.println("Encontrado!");
        else System.out.println("Não encontrado!");

        System.out.println("***** EXERCÍCIO 5 *****");
        int[] array_1_Ex5 = {1, 2, 3, 4, 5};
        int[] array_2_Ex5 = {9, 8, 7, 6, 5};
        int[] arraysSomados_Ex5 = e.exercicio5(array_1_Ex5, array_2_Ex5);
        if(arraysSomados_Ex5 != null)
            for(int i=0; i<arraysSomados_Ex5.length; i++)
                System.out.print(arraysSomados_Ex5[i]+" - ");

        System.out.println("***** EXERCÍCIO 6 *****");
        double[] arrayEx6 = {2.4, -9.5, 0.4, 89.3, 2.1};
        e.exercicio6(arrayEx6);

        System.out.println("***** EXERCÍCIO 7 *****");
        e.exercicio7();
    }
}
