package exercicio_2;

public class Corredor extends Atleta{
    private double peso;
    private Competicao competicao;

    public Corredor(String nome, int idade, double peso, Competicao competicao) {
        super(nome, idade);
        this.peso = peso;
        this.competicao = competicao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Competicao getCompeticao() {
        return competicao;
    }

    public void setCompeticao(Competicao competicao) {
        this.competicao = competicao;
    }

    public void imprimeCompeticao(){
        System.out.println("Competição: " + this.competicao.getNome());
        System.out.print("Data da competição: ");
        this.getCompeticao().imprimeData();
    }

    public void imprimeInfo(){
        super.imprimeInfo();
        System.out.println("Peso: "+this.peso);
        this.imprimeCompeticao();
    }
}
