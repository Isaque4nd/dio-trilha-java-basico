package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    private Set<Convidado> conviadoSet;

    public ConjuntoConvidados() {
        this.conviadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        conviadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : conviadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        conviadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return conviadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(conviadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1237);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 1238);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1238);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
