import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TarefaDAO {
    private Connection conn;

    public TarefaDAO(Connection conn) {
        this.conn = conn;
    }
    public void salvarTarefa(Tarefa tarefa) throws SQLException {
        String query = "INSERT INTO tarefas(nome_tarefa, descricao_tarefa, categoria, status) VALUES (?, ?, ?, ?)";

        try {
            conn.setAutoCommit(false);

            try (PreparedStatement pstmtTarefas = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                pstmtTarefas.setString(1, tarefa.getNome());
                pstmtTarefas.setString(2, tarefa.getDescricao());
                pstmtTarefas.setString(3, tarefa.getCategoria());
                pstmtTarefas.setBoolean(4, tarefa.isStatus());
                pstmtTarefas.executeUpdate();
                conn.commit();
                System.out.println("Inserido com sucesso!");
            }

        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
    public void finalizarTarefa(String nome) throws SQLException {
        String query = "UPDATE tarefas SET status = TRUE Where nome_tarefa = ?";

        try {
            conn.setAutoCommit(false);

            try (PreparedStatement pstmtTarefas = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                pstmtTarefas.setString(1, nome);
                pstmtTarefas.executeUpdate();
                conn.commit();
                System.out.println("Tarefa finalizada com sucesso!");
            }

        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
    public void editarTarefa(Tarefa tarefa, String nome, String desc, String categoria) throws SQLException {
        String query = "UPDATE tarefas SET nome_tarefa = ?, descricao_tarefa = ?, categoria = ? Where nome_tarefa = ?";

        try {
            conn.setAutoCommit(false);

            try (PreparedStatement pstmtTarefas = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                pstmtTarefas.setString(1, nome != null ? nome : tarefa.getNome());
                pstmtTarefas.setString(2, desc != null ? desc : tarefa.getDescricao());
                pstmtTarefas.setString(3, categoria != null ? categoria : tarefa.getCategoria());
                pstmtTarefas.setString(4, tarefa.getNome());
                pstmtTarefas.executeUpdate();
                conn.commit();
                System.out.println("Atualizado com sucesso!");
            }

        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
    public void excluirTarefa(String nome) throws SQLException {
        String query = "DELETE FROM tarefas WHERE nome_tarefa = ? ";

        try {
            conn.setAutoCommit(false);

            try (PreparedStatement pstmtTarefas = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                pstmtTarefas.setString(1, nome);
                pstmtTarefas.executeUpdate();
                conn.commit();
                System.out.println("Excluido com sucesso!");
            }

        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
}
