import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriadorTabela {
    public static void main(String[] args) {
        try (Connection conexao = ConexaoDB.conectar();
                Statement stmt = conexao.createStatement()) {

                // Criação da tabela Produto
                String sqlProduto = "CREATE TABLE produtos (" +
                        "id_produto INTEGER PRIMARY KEY," +
                        "nome_produto TEXT NOT NULL," +
                        "quantidade INTEGER NOT NULL" +
                        "preco REAL NOT NULL," +
                        "status TEXT NOT NULL" +
                        ");";

                // executanto o comando SQL
                stmt.executeUpdate(sqlProduto);

                System.out.println("Tabela Produto criada com sucesso.");

        }    catch (SQLException e) {
                System.err.println("Erro ao criar tabelas: " + e.getMessage());
                e.printStackTrace();
            }

    }
}
