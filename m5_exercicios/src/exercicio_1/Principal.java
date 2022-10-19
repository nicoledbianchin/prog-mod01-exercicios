package exercicio_1;

import exercicio_1.Frutas.Banana;
import exercicio_1.Frutas.Melancia;
import exercicio_1.Pessoa.Pessoa;
import exercicio_1.Pessoa.Programador;
import exercicio_1.Pessoa.Aluno;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banana b = new Banana("Caturra", 10, "Comestível");
        Melancia m = new Melancia("Cléber", 23, 13, false);
        Programador p = new Programador("José", 5, "C++");
        Aluno a = new Aluno("Pedrinho", 23, 6);

        System.out.println("Preço da banana "+b.getNome()+": R$"+b.calculaPreco(90.0));
        System.out.println("Preço da melancia "+m.getNome()+": R$"+m.calculaPrecoFinal());
        System.out.println("Dados do programador:");
        p.imprimeDados();
        System.out.println("Dados do aluno:");
        a.imprimeDados();

        Pessoa pessoa;
        System.out.println("Digite 1 para criar um Programador e 2 para criar um Aluno");
        int option = scanner.nextInt();
        if(option == 1){
            pessoa = new Programador("Maria", 26, "Javascript");
            pessoa.imprimeDados();
        } else if (option == 2) {
            pessoa = new Aluno("Mariana", 22, 8.8);
            pessoa.imprimeDados();
        }

    }
}
