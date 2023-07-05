import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner getData = new Scanner(System.in);

        System.out.print("CEP: ");
        String url = getData.nextLine();

        ConsultaCep consultaCep = new ConsultaCep();

        Endereco novoEndereco = consultaCep.getDataCep(url);





    }
}