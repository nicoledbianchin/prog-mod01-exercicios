package exercicio_1.Pessoa;

public class Pessoa{
    private String nome;
    private int idade;

    public Pessoa()
    {
    }

    public Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public int getIdade()
    {
        return idade;
    }

    public void imprimeDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}