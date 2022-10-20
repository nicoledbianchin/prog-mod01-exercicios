package exercicio_2;

public class InformacoesAtleta {
    public void imprimeExclusivosAtleta(Atleta a)
    {
        if(a instanceof Nadador){
            System.out.println("É um nadador, e sua categoria é " + ((Nadador)a).getCategoria()); //downcasting
        } else  if(a instanceof Corredor){
            System.out.println("É um corredor, e o peso deste corredor é " + ((Corredor)a).getPeso()); //downcasting
        }
    }
}
