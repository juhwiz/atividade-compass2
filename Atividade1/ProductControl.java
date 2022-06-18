import java.sql.Connection;
import java.sql.SQLException;
// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

import dao.ProductDAO;
// import model.Product;

public class ProductControl {
    public static void main(String[] args) throws SQLException{

        Scanner s = new Scanner(System.in);
        int escolha = 4; //Escolha do usuario
        int qt = 0;

        while(escolha != 0){
            
            System.out.println("Escolha a sua opção: \n 1 - Cadastrar produtos\n 2 - Atualizar produto \n 3 - Excluir Produto \n 0 - Sair");
            escolha = s.nextInt();

            ProductList productList = new ProductList();

            // CADASTRAR PRODUTO
            if (escolha == 1){
                
                for(int i = 0; i < 3; i++){
                    try(Connection connection = new ConnectionFactory().recoverConnection()){

                        ProductDAO produtoDAO = new ProductDAO(connection);
                        produtoDAO.insert(productList.returnList().get(qt));
                        qt++;

                    } catch (SQLException e) {
                        
                        e.printStackTrace();
                    }
                }
            }
            //ALTERAR PRODUTO
            if (escolha == 2){
                try(Connection connection = new ConnectionFactory().recoverConnection()){
                    ProductDAO produtoDAO = new ProductDAO(connection);
                    produtoDAO.alter(productList.returnList().get(qt-3));
                }

            }
            //EXCLUIR PRODUTO
            if(escolha == 3){
                try(Connection connection = new ConnectionFactory().recoverConnection()){
                    ProductDAO productDAO = new ProductDAO(connection);
                    productDAO.delete(productList.returnList().get(qt-2));
                }
            }
            // SAIR
            if(escolha == 0){
                System.exit(0);
            }
        
        }
        
        
    }
}