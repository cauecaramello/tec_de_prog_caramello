package tarefas.modules;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa("Estudar Java", "Estudar Java.");
        Tarefa tarefa2 = new Tarefa("Fazer exercícios", "exercícios");

        List<Tarefa> novasTarefas = new ArrayList<>();
        novasTarefas.add(tarefa1);
        novasTarefas.add(tarefa2);

        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        listaDeTarefas.adicionarTarefas(novasTarefas);


        listaDeTarefas.exibirTarefas();
    }
}