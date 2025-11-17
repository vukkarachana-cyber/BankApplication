
package com.github.derickfelix.bankapplication.database;

import java.sql.ResultSet;
import java.sql.SQLException;


public interface RowMapper<T> {

    T mapRow(ResultSet rs) throws SQLException;
    
}
