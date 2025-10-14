
package DAO;

import DTO.PedidoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PedidoDAO {

    Connection conexao;
    PreparedStatement pst;
    ResultSet rs;

    // CREATE
    public void cadastrarPedido(PedidoDTO objPedidoDTO) {
        String sql = "INSERT INTO pedidos (id_cliente, data_pedido, valor_total) VALUES (?, ?, ?)";
        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            pst.setInt(1, objPedidoDTO.getId_cliente());
            pst.setDate(2, new java.sql.Date(objPedidoDTO.getData_pedido().getTime()));
            pst.setDouble(3, objPedidoDTO.getValor_total());
            pst.executeUpdate();
            System.out.println("Pedido cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar pedido: " + e.getMessage());
        }
    }
    
    // UPDATE
public void atualizarPedido(PedidoDTO objPedidoDTO) {
    String sql = "UPDATE pedidos SET id_cliente = ?, data_pedido = ?, valor_total = ? WHERE id_pedido = ?";
    conexao = ConexaoDAO.conector();
    try {
        pst = conexao.prepareStatement(sql);
        pst.setInt(1, objPedidoDTO.getId_cliente());
        pst.setDate(2, new java.sql.Date(objPedidoDTO.getData_pedido().getTime()));
        pst.setDouble(3, objPedidoDTO.getValor_total());
        pst.setInt(4, objPedidoDTO.getId_pedido());
        pst.executeUpdate();
        System.out.println("Pedido atualizado com sucesso!");
    } catch (SQLException e) {
        System.out.println("Erro ao atualizar pedido: " + e.getMessage());
    } finally {
        try {
            if (pst != null) pst.close();
            if (conexao != null) conexao.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexões: " + ex.getMessage());
        }
    }
}

// DELETE
public void apagarPedido(int id_pedido) {
    String sql = "DELETE FROM pedidos WHERE id_pedido = ?";
    conexao = ConexaoDAO.conector();
    try {
        pst = conexao.prepareStatement(sql);
        pst.setInt(1, id_pedido);
        pst.executeUpdate();
        System.out.println("Pedido apagado com sucesso!");
    } catch (SQLException e) {
        System.out.println("Erro ao apagar pedido: " + e.getMessage());
    } finally {
        try {
            if (pst != null) pst.close();
            if (conexao != null) conexao.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar conexões: " + ex.getMessage());
        }
    }
}


    // READ (com JOIN)
    public ArrayList<String> listarpedidos() {
        ArrayList<String> lista = new ArrayList<>();
        String sql = 
            "SELECT p.id_pedido, c.nome AS cliente, p.data_pedido, p.valor_total " +
            "FROM pedidos p " +
            "INNER JOIN clientes c ON p.id_cliente = c.id_cliente";

        conexao = ConexaoDAO.conector();
        try {
            pst = conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String linha = "Pedido " + rs.getInt("id_pedido") +
                               " | Cliente: " + rs.getString("cliente") +
                               " | Data: " + rs.getDate("data_pedido") +
                               " | Valor: R$ " + rs.getDouble("valor_total");
                lista.add(linha);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar pedidos: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conexao != null) conexao.close();
            } catch (SQLException ex) {
                System.out.println("Erro ao fechar conexões: " + ex.getMessage());
            }
        }
        return lista;
    }
}


    

