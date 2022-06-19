package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Movie;

public class MovieDAO {

    private Connection connection;
    
    public MovieDAO(Connection connection){
        this.connection = connection;
    }

    public List<Movie> select(Integer min, Integer max) throws SQLException{
        List<Movie> movies = new ArrayList<Movie>();
        String sql = "SELECT ID, NOME, DESCRICAO, YEAR(ANO) FROM filmes WHERE ID BETWEEN ? and ?";

        try(PreparedStatement pst = connection.prepareStatement(sql)){
            pst.setInt(1, min);
            pst.setInt(2, max);
            pst.execute();

            try(ResultSet rst = pst.getResultSet()){
               
                while(rst.next()){
                    Movie movie = new Movie(rst.getString(2), rst.getString(3), rst.getInt(4));
                    movies.add(movie);
                }
                
                
            }

        }

        return movies;

    }
    
}
