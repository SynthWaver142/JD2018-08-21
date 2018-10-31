package by.it.yaroshchuk.jd03_03.beansdao;

import by.it.yaroshchuk.jd03_03.simpledao.ConnectionCreator;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDao {
    protected long executeUpdate(String sql) throws SQLException {
        long result;
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            result = statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            if (result == 1 && sql.trim().toUpperCase().startsWith("INSERT")) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next())
                    result = resultSet.getLong(1);
            }
        }
        return result;
    }
}
