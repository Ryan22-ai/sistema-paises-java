package Aula_02;

import java.util.List;

public class PaisView {

    public void visualizarPais(List<Pais> paises) {
        for (Pais pais : paises) {
            System.out.println("Nome: " + pais.getNome());
            System.out.println("Capital: " + pais.getCapital());
            System.out.println("----------------------");
        }
    }
}