import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    ConnectionDB connectionDB = new ConnectionDB();
    Connection conn = connectionDB.getConnection();

    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
        popularListaDeTarefas();
    }

    public void adicionarTarefa(Tarefa tarefa) throws SQLException {
        var db = new TarefaDAO(conn);
        db.salvarTarefa(tarefa);
        tarefas.add(tarefa);
    }

    public void removerTarefa(Tarefa tarefa) throws SQLException {
        var db = new TarefaDAO(conn);
        db.excluirTarefa(tarefa.getNome());
        tarefas.remove(tarefa);
    }

    public void selecionaTodos() {
        System.out.println("Todas as tarefas: ");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    private void popularListaDeTarefas() {
        String query = "SELECT * FROM tarefas";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String nome = rs.getString("nome_tarefa");
                String desc = rs.getString("descricao_tarefa");
                String categoria = rs.getString("categoria");
                Tarefa tarefa = new Tarefa(nome, desc, categoria);
                tarefas.add(tarefa);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void buscaTarefa(String nome) {
        boolean encontrada = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Tarefa encontrada: ");
                System.out.println(tarefa);
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Tarefa não encontrada.");
        }
    }
}
