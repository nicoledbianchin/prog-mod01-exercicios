import java.util.Scanner;
public class Principal
{
    public static void main(String args[])
    {
        Exercicios ex1 = new Exercicios();
        int opMenu, x;

        do{
            System.out.println("****    Menu    ****");
            System.out.println("1 - Conta até 300 ");
            System.out.println("2 - Imprime Pares ");
            System.out.println("3 - Verifica Primo ");
            System.out.print("Digite a opção desejada: ");
            Scanner leia = new Scanner(System.in);
            opMenu = leia.nextInt();

            switch(opMenu){
                case 1:
                    System.out.print("Digite um número: ");
                    x = leia.nextInt();
                    ex1.contador(x);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Digite um número: ");
                    x = leia.nextInt();
                    ex1.imprimePares(x);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Digite um número: ");
                    x = leia.nextInt();
                    if(ex1.verificaPrimo(x)){
                        System.out.println("É primo!");
                    }else{
                        System.out.println("NÃO É primo!");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }while(opMenu>=1 && opMenu<=3);

        System.out.println("\nFinalizando Programa...");
    }
}

