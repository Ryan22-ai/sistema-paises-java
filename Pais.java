package Aula_02;

public class Pais {
    private String nome;
    private String capital;

    public Pais(String nome, String capital) {
        this.nome = nome;
        this.capital = capital;
    }

    public String getNome() {
        return nome;
    }

    public String getCapital() {
        return capital;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
