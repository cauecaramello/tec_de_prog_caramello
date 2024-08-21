import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            ListaTarefas listaTarefas = new ListaTarefas();

            Tarefa tarefa1 = new Tarefa("Estudar Java", "Revisar conceitos de orientação a objetos", "Estudo");
            listaTarefas.adicionarTarefa(tarefa1);

            Tarefa tarefa2 = new Tarefa("Fazer exercício", "Correr 5 km no parque", "Saúde");
            listaTarefas.adicionarTarefa(tarefa2);

            listaTarefas.selecionaTodos();

            listaTarefas.buscaTarefa("Estudar Java");

            tarefa1.finalizarTarefa();

            listaTarefas.buscaTarefa("Estudar Java");

            listaTarefas.removerTarefa(tarefa2);

            listaTarefas.selecionaTodos();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
