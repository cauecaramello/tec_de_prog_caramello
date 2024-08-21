import java.sql.Connection;
import java.sql.SQLException;

public class Tarefa {

    ConnectionDB connectionDB = new ConnectionDB();
    Connection conn = connectionDB.getConnection();

    private String nome;
    private String descricao;
    private boolean status;
    private String categoria;

    public Tarefa(String nome, String descricao, String categoria){
            this.nome = nome;
            this.descricao = descricao;
            this.status = false;
            this.categoria = categoria;

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public String getCategoria() {
        return categoria;
        }

        public void setCategoria(String categoria) {
        this.categoria = categoria;
        }
        public void finalizarTarefa() throws SQLException {
        var db = new TarefaDAO(conn);
        this.status = true;
        db.finalizarTarefa(this.nome);
        }

        public void excluirTarefa() throws SQLException {
        var db = new TarefaDAO(conn);
        db.excluirTarefa(this.nome);
    }

    @Override
    public String toString() {
        String statusTarefa = status ? "Finalizada" : "Em andamento";
        return String.format(
                "Tarefa: \n" +
                        "Nome: %s\n" +
                        "Descrição: %s\n" +
                        "Status: %s\n" +
                        "Categoria: %s\n",
                nome, descricao, statusTarefa, categoria
        );
    }
}
