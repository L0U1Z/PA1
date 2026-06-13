import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner inUser = new Scanner(System.in);
        ArrayList<String> listadecompras = new ArrayList<>(); 

            int opcaoLista = 0;
            int opcao = 0;
            String novoItem = "";
                do{
                    try{
                    System.out.println("""
                        Bem vindo ao programa lista de compras!

                        Escolha a opcao desejada:

                        1 - Criar uma nova lista de compras
                        2 - sair

                        """);
                        opcaoLista = inUser.nextInt();
                        inUser.nextLine();

                        switch(opcaoLista){
                            case 1 -> {
                                System.out.println("Lista criada com sucesso!");
                                
                                do{
                                    System.out.println("""
                                            Escolha a opcao desejada:
                                            1 - Adicionar um item a lista
                                            2 - Ver sua lista   
                                            """);

                                    opcao = inUser.nextInt();
                                    inUser.nextLine();

                                    switch(opcao){
                                        case 1 -> {
                                            System.out.println("Voce escolheu adicionar um item a lista!");
                                            System.out.println("Digite o nome do produto:");
                                            novoItem = inUser.nextLine();
                                            listadecompras.add(novoItem);
                                        }
                                        case 2 -> {
                                            System.out.println("Voce escolheu ver a lista!");
                                            for(String item : listadecompras){
                                                System.out.printf("%s \n", item);
                                            }
                                        }
                                        
                                    }

                                }while(opcao != 2);
                            
                            case 2 -> System.out.println("Obrigado por usar o nosso sistema!");
                            default -> System.out.println("Opcao invalida, tente novamente!");
                            
                            }
                
                        }catch(Exception erro){
                        System.out.println("Erro! Entrada invalida");
                        inUser.nextLine();
                        opcaoLista = 1;
                        } 
                    }
                    
                }while(opcaoLista != 2);       

        inUser.close();
        
    }

}   
