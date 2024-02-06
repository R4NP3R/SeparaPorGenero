import java.util.*;

public class Main {
    public static void main(String[] args) {
        listaDePessoas();
    }

    public static Pessoa criaPessoa(String nome, String sexo){
        Pessoa pessoa = new Pessoa(nome, sexo);
        return  pessoa;
    }

    public static void listaDePessoas() {
        Map<String, String> Pessoas = new HashMap<>();
        List<Pessoa> masculino = new ArrayList<>();
        List<Pessoa> feminino = new ArrayList<>();

        Pessoa ab = criaPessoa("Rafael", "masculino");
        Pessoa bc = criaPessoa("Maicon", "masculino");
        Pessoa cd = criaPessoa("Isabela", "feminino");
        Pessoa de = criaPessoa("Gustavo", "masculino");
        Pessoa ef = criaPessoa("Julia", "feminino");
        Pessoa fg = criaPessoa("Fernanda", "feminino");

        Pessoas.put(ab.getNome(), ab.getGenero());
        Pessoas.put(bc.getNome(), bc.getGenero());
        Pessoas.put(cd.getNome(), cd.getGenero());
        Pessoas.put(de.getNome(), de.getGenero());
        Pessoas.put(ef.getNome(), ef.getGenero());
        Pessoas.put(fg.getNome(), fg.getGenero());

        for(Map.Entry<String, String> entry : Pessoas.entrySet()) {
            String nome = entry.getKey();
            String genero = entry.getValue();
            Pessoa pessoa = new Pessoa(nome, genero);

            if (genero.equals("masculino")) {
                masculino.add(pessoa);
            } else {
                feminino.add(pessoa);
            }
        }

        System.out.println("Masculino:");

        for(Pessoa homem : masculino) {
            System.out.println(homem.getNome());
        }

        System.out.println("\nFeminino:");

        for(Pessoa mulher : feminino) {
            System.out.println(mulher.getNome());
        }

    }

}