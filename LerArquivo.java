import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivo {

//Ariadne Guimarães Lemos de Andrade 21363221
//Erika Lima da Silva 21360699
//Fernanda Florencio Dias 21305593
//Gabriel Roque Capozzi 20526104

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o nome procurado: ");
        String valorProcurado = sc.nextLine();
        try {
            File file = new File("arquivoDados.csv");
            Scanner scanner = new Scanner(file);
            String[] partes = null;

            // enquanto não chegar ao final do arquivo
            while (scanner.hasNextLine()) {
                // leia a próxima linha do arquivo
                String linha = scanner.nextLine();
                System.out.println(linha);

                // quebrando a linha por ","
                partes = linha.split(","); 
                
                // exibindo cada palavra
                for (int i = 0; i < partes.length; i++) {
                    System.out.print(partes[i] + " - ");
                }
                System.out.println();

            }

            Pesquisa pesquisa = new Pesquisa();
            int resultado = pesquisa.buscaBinaria(partes, valorProcurado);

            if (resultado ==  -1)
                System.out.println("Usuário não encontrado");
            else
                System.out.println("Pessoa enconrada no index:" + resultado);  

            scanner.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
        
    }

    
}
