import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Produto p0 = new Produto(58.00, "1 kg", "alimento", 0, "picanha", 10);
        Produto p1 = new Produto(18.70, "objeto", 1, "faca", 8);
        Produto p2 = new Produto(24.50, "500 ml", "bebida", 2, "vinho", 14);
        Cliente c[] = new Cliente[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira seu Nome:");
            c[i].setNome(scan.nextLine());

            System.out.println("Insira seu Cpf: ");
            c[i].setCpf(scan.nextLine());

            System.out.println("Insira seu Email: ");
            c[i].setEmail(scan.nextLine());

            System.out.println("Insira seu Endereco: ");
            c[i].setEndereco(scan.nextLine());

            System.out.println("Insira seu Saldo: ");
            c[i].setCarteira(scan.nextInt());

            for (int k = 0; k < 100; k++)
                System.out.println(" ");
        }

        /*
         * System.out.println("==============================");
         * System.out.println("Voce quer comprar esse produto");
         * System.out.println("==============================");
         * 
         * System.out.println("==========================================");
         * System.out.println("Quantos desse produto voce deseja comprar?");
         * System.out.println("==========================================");
         */
        for (int i = 0; i < 3; i++) {

        }

        scan.close();
    }

}
