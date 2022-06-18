package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import model.Product;

public class ProductDAO {
    private Connection connection; 

    public ProductDAO(Connection connection){
        this.connection = connection;

    }

    public void insert(Product product) throws SQLException{
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, QUANTIDADE, PRECO) VALUES (?, ?, ?, ?)";

        try(PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pst.setString(1, product.getNome());
            pst.setString(2, product.getDescricao());
            pst.setInt(3, product.getQuantidade());
            pst.setDouble(4, product.getPreco());

            pst.execute();
            try(ResultSet rst = pst.getGeneratedKeys()){
                while(rst.next()){
                    product.setId(rst.getInt(1));
                }
            }

        }

    }

    public void delete(Product product) throws SQLException{
        String sql = "DELETE FROM PRODUTO WHERE NOME = ?";
        
        try(PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pst.setString(1, product.getNome());

            pst.execute();

            Integer linhasModificadas = pst.getUpdateCount();
            System.out.println("Quantidade de linhas modificadas: " + linhasModificadas);
            try(ResultSet rst = pst.getGeneratedKeys()){
                while(rst.next()){
                    product.setId(rst.getInt(1));
                }
            }
        }
    } 

    public void alter(Product product) throws SQLException{
        String sql = "UPDATE PRODUTO SET QUANTIDADE = 100 WHERE NOME = ?";

        try(PreparedStatement pst = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
            pst.setString(1, product.getNome());

            pst.execute();
            try(ResultSet rst = pst.getGeneratedKeys()){
                while(rst.next()){
                    product.setId(rst.getInt(1));
                }
            }

        }
    }

}
