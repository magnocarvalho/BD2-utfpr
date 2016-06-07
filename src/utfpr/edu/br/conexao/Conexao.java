/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.edu.br.conexao;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static java.sql.Connection conexao = null;
    private static org.postgresql.Driver mysqlDriver;

    public static java.sql.Connection getConnection() throws SQLException {
        String conecaoMysql = "jdbc:postgresql://localhost:5432/dbestoque";
        if (conexao == null) {
            mysqlDriver = new org.postgresql.Driver();
            conexao = DriverManager.getConnection(conecaoMysql);
        }
        return conexao;
    }
}
