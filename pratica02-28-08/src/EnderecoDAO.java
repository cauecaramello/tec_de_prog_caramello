import java.sql.*;

public class EnderecoDAO {
    private Connection conn;

    public EnderecoDAO(Connection conn) {
        this.conn = conn;
    }
    public void salvarEndereco(Endereco endereco) throws SQLException {
        String query = "INSERT INTO endereco(CEP, Rua, Bairro, Cidade, Estado) VALUES (?, ?, ?, ?, ?)";

        try {
            conn.setAutoCommit(false);

            try (PreparedStatement pstmtTarefas = conn.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS)) {
                pstmtTarefas.setString(1, endereco.getCep());
                pstmtTarefas.setString(2, endereco.getRua());
                pstmtTarefas.setString(3, endereco.getBairro());
                pstmtTarefas.setString(4, endereco.getCidade());
                pstmtTarefas.setString(5, endereco.getUf());
                pstmtTarefas.executeUpdate();
                conn.commit();
                System.out.println("Inserido com sucesso!");
            }

        } catch (SQLException e) {
            conn.rollback();
            throw e;
        }
    }
    public void MostrarEnderecos() throws SQLException {
        String query = "SELECT * FROM endereco";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String cep = rs.getString("cep");
                String rua = rs.getString("rua");
                String bairro = rs.getString("bairro");
                String cidade = rs.getString("cidade");
                String estado = rs.getString("estado");

                System.out.println("ID: " + id);
                System.out.println("CEP: " + cep);
                System.out.println("Rua: " + rua);
                System.out.println("Bairro: " + bairro);
                System.out.println("Cidade: " + cidade);
                System.out.println("Estado: " + estado + "\n");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao mostrar os endereços: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
