public class Exercicios {
    public void contador(int x){
        for(int i = x; i <=300; i++){
            System.out.println(i);
        }
    }

    public void imprimePares(int x){
        if(x > 0){
            for(int i = 0; i <= x; i++){
                if(i%2 == 0){
                    System.out.println(i);
                }
            }
        } else{
            System.out.println("Número ímpar");
        }
    }

    public boolean verificaPrimo(int x){
        int cont = 0;
        for(int i = 1; i <= x; i++){
            if((x%i==0) && (x%1==0)){
                cont++;
            }
        }
        if(cont==2){
            return true;
        }else{
            return false;
        }
    }
}
