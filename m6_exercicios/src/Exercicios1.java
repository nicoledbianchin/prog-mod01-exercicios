public class Exercicios1 {
    public void exercicio1a(){
        int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = array.length - i;
        }
    }

    public void exercicio1b(){
        int[] array = new int[11];
        for(int i = 0; i < array.length; i++){
            array[i] = i * i;
        }
    }

    public void exercicio1c(){
        int[] array = new int[10];
        for(int i=0; i<array.length; i++){
            if(i < 5) array[i] = i+1;
            else array[i] = (i-4) * 10;
        }
    }

    public void exercicio1d(){
        int[] array = new int[10];
        for(int i=0; i<array.length; i++)
            array[i] = (i * i) + 3;
    }

    public void exercicio2(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public void exercicio3(){
        double[] d = new double[10];
        for(int i = 0; i < d.length; i++){
            d[i] = Teclado.leDouble("Digite um double: ");
        }
        exercicio2(d);
    }

    public int exercicio4(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0){
                count++;
            }
        }
        return count;
    }

    public int exercicio5(int[] array, int value){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                count++;
            }
        }
        return count;
    }

    public boolean[] exercicio6(int[] array){
        boolean[] arrayBoolean = new boolean[array.length];
        for(int i = 0; i < array.length; i++){
            arrayBoolean[i] = array[i] >= 0 ? true : false;
        }
        return arrayBoolean;
    }

    public int exercicio7(double[] array){
        int positionOfHigherNumber = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > array[positionOfHigherNumber]){
                positionOfHigherNumber = i;
            }
        }
        return positionOfHigherNumber;
    }

    public double[] exercicio8(){
        Teclado teclado = new Teclado();
        double[] array = new double[teclado.leInt("Digite o tamanho do array:")];
        for(int i=0; i<array.length; i++) {
            array[i] = teclado.leDouble("Digite o " + (i + 1) + "º valor do array:");
        }
        return array;
    }

    public void exercicio9(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] % 2 == 0 ? 1 : -1;
        }
    }
}
