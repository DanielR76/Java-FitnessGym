package co.com.fitnesspower.dal;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

public interface InterfazDao<Registro> {

    public boolean create(Registro x) throws SQLException, FileNotFoundException;

    public boolean update(Registro x) throws SQLException, FileNotFoundException;

    public boolean delete(Object key) throws SQLException;

    public List<Registro> readAll() throws SQLException;

}
