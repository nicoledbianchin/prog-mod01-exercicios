package exercicio_1.Pessoa;

public class Aluno extends Pessoa {
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Nota: "+ nota);
    }
}
