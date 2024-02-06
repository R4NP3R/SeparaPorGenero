public class Pessoa {
    String Nome;
    String Genero;


    public Pessoa(String nome, String genero) {
        Nome = nome;
        Genero = genero;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }
}
