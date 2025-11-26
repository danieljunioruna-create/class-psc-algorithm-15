import java.util.ArrayList;

public class TestePOOCompleto {
    public static void main(String[] args) {

        Filme filme = new Filme("Interestelar", 2014, 169, "Christopher Nolan");
        Musica musica = new Musica("Bohemian Rhapsody", 1975, 6, "Queen");

        System.out.println("\n=== Teste 1: Polimorfismo (reproduzir) ===");
        ArrayList<ItemMidia> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(musica);

        for (ItemMidia item : lista) {
            item.reproduzir();
        }

        System.out.println("\n=== Teste 2: Polimorfismo (Avaliavel) ===");
        Avaliavel avaliavel = filme;
        avaliavel.receberAvaliacao(10);

        avaliavel = musica;
        avaliavel.receberAvaliacao(5);

        System.out.println("\n=== Teste 3: Encapsulamento (duração negativa) ===");
        filme.setDuracao(-50);
    }
}
