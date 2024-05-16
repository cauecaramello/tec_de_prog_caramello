package tarefas.modules;

import java.util.ArrayList;
import java.util.List;

class ListaDeTarefas {
    private List<Tarefa> tarefas;

    public ListaDeTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }
    public void adicionarTarefas(List<Tarefa> novasTarefas) {
        tarefas.addAll(novasTarefas);
    }

    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }

    public void exibirTarefas() {
        System.out.println("Tarefas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public void marcarTarefaComoConcluida(Tarefa tarefa) {
        tarefa.setConcluida(true);
    }
}
