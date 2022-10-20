package exercicio_2;

public class Atleta {
    private String nome;
    private int idade;

    public Atleta(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void imprimeInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
