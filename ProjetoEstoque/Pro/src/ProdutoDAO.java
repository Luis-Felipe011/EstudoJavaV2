import java.sql.*;
import java.util.*;

public class ProdutoDAO {
    private final Connection CONEXAO_DB;

    // construtor que recebe a conexão
    public ProdutoDAO(Connection conexao) {
        this.CONEXAO_DB = conexao;
    }
    // método para inserir um produto
    public void inserir (Produto produto){
        String sql = "INSERT INTO produtos (nome_produto, quantidade, preco, status) VALUES )(?, ?, ?, ?)";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)){
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getStatus());
            stmt.executeUpdate();
        } catch (SQLException e){
            System.err.println ("Erro ao inserir produto: " + e.getMessage());
        }
    }
    public void deletar (){
        String sql = "DELETE FROM produtos";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)) {
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao deletar produto: " + e.getMessage());
        }
    }
    public Produto consultarPorId(int id, Produto produto) {
        String sql = "SELECT * FROM produtos WHERE id_produto = ?";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery()) {
            stmt.setInt(1, id);
            if (rs.next()) {
                produto.setId(rs.getInt("id_produto"));
                produto.setNome(rs.getString("nome_produto"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
                produto.setStatus(rs.getString("status"));
                return produto;
            }
        }catch (SQLException e) {
            System.err.println("Produto não encontrado: " + e.getMessage());
        }
        return null;
    }

    public void atualizar (Produto produto){
        String sql = "UPDATE produto SET nome_produto = ?, quantidade = ?. preco = ?, status = ? WHERE id_produtos = ?";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)){
            stmt.setString (1, produto.getNome());
            stmt.setInt (2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getStatus());
            stmt.setInt(5, produto.getId());
            stmt.executeUpdate();
        }catch (SQLException e){
            System.err.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    public void excluirPorId(int id){
        String sql = "DELETE FROM produtos WHERE id_produto = ?";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeQuery();
        }catch (SQLException e){
            System.err.println("Erro ao excluir o produto: " + e.getMessage());
        }
    }

}

