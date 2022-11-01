public class Exercicios2 {
    public void exercicio1(){
        double[] notas = new double[Teclado.leInt("Quantas notas serão digitadas?")];
        double soma = 0;
        for(int i=0; i<notas.length; i++){
            notas[i] = Teclado.leDouble("Digite a nota "+(i+1)+":");
            soma += notas[i];
        }
        System.out.println("Média das notas: "+(soma/notas.length));
    }

    public void exercicio2(){
        String[] nomes = new String[Teclado.leInt("Quantos nomes serão digitados?")];
        for(int i=0; i<nomes.length; i++)
            nomes[i] = Teclado.leString("Digite o nome "+(i+1)+":");
        System.out.print("Dados informados: ");
        for(int i=0; i<nomes.length; i++)
            if(i < nomes.length-2)
                System.out.print(nomes[i]+", ");
            else if(i == nomes.length-2)
                System.out.print(nomes[i]+" e ");
            else
                System.out.println(nomes[i]+".");
    }

    public int exercicio3(int[] array){
        int somatorio = 0;
        for(int i=0; i<array.length; i++)
            somatorio += array[i];
        return somatorio;
    }

    public boolean procuraNome(String[] nomes, String nome){
        for(int i=0; i<nomes.length; i++)
            if(nomes[i].equalsIgnoreCase(nome)){
                System.out.println("Nome localizado na posição "+i);
                return true;
            }
        return false;
    }

    public int[] exercicio5(int[] array1, int[] array2){
        if(array1.length != array2.length)
            return null;
        int[] soma = new int[array1.length];
        for(int i=0; i<array1.length; i++)
            soma[i] = array1[i] + array2[i];
        return soma;
    }

    public void exercicio6(double[] array){
        double maior = array[0];
        double menor = array[0];
        double soma = 0;
        for(int i=1; i<array.length; i++){
            if(array[i] > maior)
                maior = array[i];
            if(array[i] < menor)
                menor = array[i];
            soma += array[i];
        }
        System.out.println("Maior valor do array: "+maior);
        System.out.println("Menor valor do array: "+menor);
        System.out.println("Média dos valores do array: "+(soma/array.length));
    }

    public void exercicio7(){
        int[] array = new int[(int)((Math.random( )*100)+1)];
        for(int i=0; i<array.length; i++)
            array[i] = (int) ((Math.random( )*1000)+1);

        System.out.println("Tamanho do array criado: "+array.length);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" - ");
        System.out.println();
    }
}
