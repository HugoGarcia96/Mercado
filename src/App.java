import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Produto p0 = new Produto(58.00, "1 kg", "alimento", 0, "picanha", 10);
        Produto p1 = new Produto(18.70, "objeto", 1, "faca", 8);
        Produto p2 = new Produto(24.50, "500 ml", "bebida", 2, "vinho", 14);
        Cliente c[] = new Cliente[3];
        int idc; 
        String cpf;

        for (int i = 0; i < 3; i++) {
            System.out.println("=================");
            System.out.println("Faca seu cadastro");
            System.out.println("=================");

            System.out.println("Insira seu Nome:");
            c[i].setNome(scan.nextLine());

            System.out.println("Insira seu Cpf: ");
            c[i].setCpf(scan.nextLine());           

            System.out.println("Insira seu Saldo: ");
            c[i].setCarteira(scan.nextInt());
            
            c[i].setIdCliente(i);
            System.out.println("Seu ID e: " +c[i].getIdCliente());

            for (int k = 0; k < 100; k++)
                System.out.println(" ");
        }

        System.out.println("=====================");
        System.out.println("Consulte seu carrinho");
        System.out.println("=====================");
        System.out.println("Insira seu Id:");
        idc = scan.nextInt();
        System.out.println("Insira seu Cpf:");
        cpf = scan.nextLine();
        if(c[idc].getCpf().equals(cpf)){

        }else
        System.out.println("Cpf incompativel");

        scan.close();
    }

}
