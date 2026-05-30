import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        String nome = inUser.nextLine();

        System.out.printf("O meu nome e: %s", nome);

        inUser.close();
    }
}
