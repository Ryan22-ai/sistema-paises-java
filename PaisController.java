package Aula_02;

import java.util.ArrayList;
import java.util.List;

public class PaisController {
    private List<Pais> paisesAdicionados;
    private PaisView vizualizar;

    public PaisController() {
        paisesAdicionados = new ArrayList<>();
        vizualizar = new PaisView();
    }
    public void adicionarPaises(String nome,String capital){
        paisesAdicionados.add(new Pais(nome, capital));
    }
    public void removerPais(String nomeRemover){
        paisesAdicionados.removeIf(pais -> pais.getNome().equals(nomeRemover));
    }
    public void limparPais(){
        paisesAdicionados.removeAll(paisesAdicionados);
    }
    public void imprimirPaises(){
        this.vizualizar.visualizarPais(paisesAdicionados);
    }

}
