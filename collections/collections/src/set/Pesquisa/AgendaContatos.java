package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet) {
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Isaque", 1235456);
        agendaContatos.adicionarContato("Isaque", 1);
        agendaContatos.adicionarContato("Isaque 4ndrade", 123);
        agendaContatos.adicionarContato("Isaque Ribeiro", 12);
        agendaContatos.adicionarContato("Davi Ribeiro", 125);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Isaque"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Isaque Ribeiro", 321));
    }

}
