import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> nomes = new ArrayList<>();

        //Adiciona elementos a lista add()
        nomes.add("Luiz");
        nomes.add("Carvalho");
        //Acessar um elemento get(indice)
        //System.out.println(nomes.get(0));

        //Alterar um item
        nomes.set(0, "Prof");
        //System.out.println(nomes);

        //Remover um item da lista
        nomes.add("remover este");
        nomes.remove(2);
        //System.out.println(nomes);

        //Tamanho da lista
        //System.out.println(nomes.size());
        
        //Apagar a lista
        //nomes.clear();
        //System.out.println(nomes);

        ///Verifica se existe
        System.out.println(nomes.contains("Carvalho"));
    }
}
