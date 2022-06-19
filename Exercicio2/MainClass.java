import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import DAO.MovieDAO;
import model.Movie;

public class MainClass {
    public static void main(String[] args)  throws SQLException{
        Scanner s = new Scanner(System.in);

        int moviesPerPage = 0;
        int page = 0;
        
        System.out.println("Quantos filmes deseja filtrar por página?");
        moviesPerPage = s.nextInt();

        System.out.println("Qual página deseja acessar?");
        page = s.nextInt();

        int max  = page * moviesPerPage;
        int min = max - moviesPerPage + 1;

        try(Connection connection = new ConnectionFactory().returnConnection()){
            MovieDAO movieDAO = new MovieDAO(connection);
            
            List<Movie> movieList = movieDAO.select(min, max);

            movieList.stream().forEach(mv -> {
                
                System.out.println(mv);
                
            });

        }




    }
}
