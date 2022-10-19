
public class exercicio02
{
    public static void main (String[] args){
        String nome = Teclado.leString("Digite seu nome: ");
        int idade = Teclado.leInt("Digite sua idade: ");

        System.out.printf("Nome: %s \nIdade: %d anos", nome, idade);

    }
}
