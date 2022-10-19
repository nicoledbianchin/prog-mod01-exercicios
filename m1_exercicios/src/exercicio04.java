public class exercicio04 {
    public static void main (String[] args){
        String rua = Teclado.leString("Digite o nome de sua Rua: ");
        int num = Teclado.leInt("Digite o número de seu endereço: ");
        String compl = Teclado.leString("Digite o complemento (Apto. 101): ");
        String bairro = Teclado.leString("Digite o bairro: ");
        String cep = Teclado.leString("Digite o seu CEP: ");
        String cidade = Teclado.leString("Digite o nome da cidade: ");
        String estado = Teclado.leString("Digite o nome do estado: ");
        String pais = Teclado.leString("Digite o nome do país: ");

        System.out.print("\n--Dados do Endereço--\n");
        System.out.printf("Rua: %s \n",rua);
        System.out.printf("Número: %d \n", num);
        System.out.printf("Complemento: %s \n", compl);
        System.out.printf("Bairro: %s \n", bairro);
        System.out.printf("CEP: %s \n", cep);
        System.out.printf("Cidade: %s \n", cidade);
        System.out.printf("Estado: %s \n", estado);
        System.out.printf("País: %s \n", pais);
    }
}
