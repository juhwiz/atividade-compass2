import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory{
    public DataSource dataSource;

    public ConnectionFactory(){
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource(); 
        comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/atividade2?useTimezone=true&serverTimezone=UTC");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("HPcaspian28");

        comboPooledDataSource.setMaxPoolSize(20);

        this.dataSource = comboPooledDataSource;
    }

    public Connection returnConnection() throws SQLException{
        return this.dataSource.getConnection();
    }

}