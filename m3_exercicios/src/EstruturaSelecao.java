import java.util.Scanner;

public class EstruturaSelecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Menu: ");
        System.out.printf("\n1 - Soma");
        System.out.printf("\n2 - Divide");
        System.out.printf("\n3 - Verifica triângulo");
        System.out.printf("\n4 - Verifica idade");
        System.out.printf("\n5 - Sinaleira");
        System.out.printf("\n6 - Acha maior");
        System.out.printf("\nDigite a opção desejada: ");

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Insira um número:");
                int a = scanner.nextInt();
                System.out.println("Insira outro número:");
                int b = scanner.nextInt();
                if(a < 0 || b < 0) {
                    System.out.println("Um dos números é negativo");
                } else {
                    int soma = a + b;
                    System.out.printf("\nSoma: %d", soma);
                }
                break;
            case 2:
                System.out.println("Insira um número:");
                int x = scanner.nextInt();
                System.out.println("Insira outro número:");
                int y = scanner.nextInt();
                if (y == 0){
                    System.out.println("Dividendo não pode ser 0");
                } else {
                    double divisao = x / y;
                    System.out.printf("\nSoma: %.2f", divisao);
                }
                break;
            case 3:
                System.out.println("Insira um número:");
                int X = scanner.nextInt();
                System.out.println("Insira outro número:");
                int Y = scanner.nextInt();
                System.out.println("Insira outro número:");
                int Z = scanner.nextInt();
                if( X == Y && Y == Z){
                    System.out.println("Triângulo equilátero");
                } else if(X != Y && Y != Z && X != Z) {
                    System.out.println("Triângulo escaleno");
                } else if((X == Y && Y != Z) || (Y == Z && Z != X )){
                    System.out.println("Triângulo isósceles");
                }
                break;
            case 4:
                System.out.println("Insira idade:");
                int idade = scanner.nextInt();
                if(idade < 0){
                    System.out.println("Erro: menor que zero");
                } else if(idade >= 0 && idade <= 12){
                    System.out.println("Criança");
                } else if(idade >= 13 && idade <= 18){
                    System.out.println("Adolescente");
                } else if(idade >=19 && idade <= 120){
                    System.out.println("Adulto");
                } else if(idade > 120) {
                    System.out.println("Erro");
                }
                break;
            case 5:
                System.out.println("Insira a cor da sinaleira:");
                String cor = scanner.nextLine();
                if(cor.equalsIgnoreCase("vermelho")){
                    System.out.println("Sinaleira fechada");
                } else if(cor.equalsIgnoreCase("amarelo")){
                    System.out.println("Atenção");
                } else if(cor.equalsIgnoreCase("verde")){
                    System.out.println("Sinaleira aberta");
                } else{
                    System.out.println("Erro");
                }
                break;
            case 6:
                System.out.println("Insira um número:");
                int A = scanner.nextInt();
                System.out.println("Insira outro número:");
                int B = scanner.nextInt();
                System.out.println("Insira outro número:");
                int C = scanner.nextInt();
                if(A > B && A > C){
                    System.out.printf("\n%d é maior", A);
                } else if(B > A && B > C) {
                    System.out.printf("\n%d é maior", B);
                } else if(C > A && C > B) {
                    System.out.printf("\n%d é maior", C);
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
