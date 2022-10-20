package exercicio_2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Competicao competicao = new Competicao("Correr cansa", new Data(19, 05, 2022));
        System.out.println("Nome: " + competicao.getNome());
        System.out.print("Data: ");
        competicao.imprimeData();

        System.out.println("\n");
        Nadador nadador = new Nadador("Cielo", 23, "borboleta");
        nadador.imprimeInfo();

        Corredor corredor = new Corredor("Pedro", 91, 68, competicao);
        competicao.getData().setMes(2);

        corredor.getCompeticao().imprimeData();

        Competicao competicao2 = new Competicao("São Silvestre", new Data(1, 1, 2023));
        Corredor corredor2 = new Corredor("Augosto", 100, 70, competicao2);
        System.out.println("\n");
        corredor2.imprimeInfo();

        System.out.println("\n");
        Atleta atleta = null;
        InformacoesAtleta informacoes = new InformacoesAtleta();
        System.out.println("Digite 1 para criar um Nadador e 2 para criar um Corredor");
        int option = scanner.nextInt();
        scanner.nextLine();
        String nome, cat;
        int idade;
        double peso;

        if (option == 1){
            System.out.println("-- Nadador --");
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine();
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Digite a categoria: ");
            cat = scanner.nextLine();
            atleta = new Nadador(nome, idade, cat);
        } else  if (option == 2){
            System.out.println("-- Corredor --");
            System.out.println("Digite o nome: ");
            nome = scanner.nextLine();
            System.out.println("Digite a idade: ");
            idade = scanner.nextInt();
            System.out.println("Digite o peso: ");
            peso = scanner.nextDouble();
            atleta = new Corredor(nome, idade, peso, competicao2);
        }

        informacoes.imprimeExclusivosAtleta(atleta);
        atleta.imprimeInfo();

        if(atleta instanceof Nadador){
            ((Nadador)atleta).setCategoria("livre"); //downcasting
        } else  if(atleta instanceof Corredor){
            ((Corredor)atleta).setPeso(89); //downcasting
        }

        System.out.println("\n-- Dados do Atleta após as alterações --");
        atleta.imprimeInfo();
    }
}
