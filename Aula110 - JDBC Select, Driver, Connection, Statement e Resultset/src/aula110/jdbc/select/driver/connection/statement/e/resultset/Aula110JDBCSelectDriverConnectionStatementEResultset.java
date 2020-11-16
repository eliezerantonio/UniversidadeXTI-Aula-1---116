/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula110.jdbc.select.driver.connection.statement.e.resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eliezer
 */
public class Aula110JDBCSelectDriverConnectionStatementEResultset {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        String caminho = "jdbc:mysql://localhost:3306/XTI";
        String sql = "select codigo,nome,sexo,email from Pessoa";
        try (Connection conexao = DriverManager.getConnection(caminho, "root", "1223");
                PreparedStatement cmd = conexao.prepareCall(sql);
                ResultSet rs = cmd.executeQuery()) {

            while (rs.next()) {
                String s = rs.getString("codigo")
                        + "; " + rs.getString("nome")
                        + "; " + rs.getString(3)
                        + "; " + rs.getString(4);
                System.out.println(s);

            }

        } catch (SQLException e) {
        }

    }

}
