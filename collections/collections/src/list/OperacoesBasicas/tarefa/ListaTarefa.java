package list.OperacoesBasicas.tarefa;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 3");

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.obterDescricoesTarefas();
    }

}
