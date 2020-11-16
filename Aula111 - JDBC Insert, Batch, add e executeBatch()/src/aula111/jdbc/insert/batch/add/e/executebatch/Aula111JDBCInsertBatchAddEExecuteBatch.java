/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula111.jdbc.insert.batch.add.e.executebatch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eliezer
 */
public class Aula111JDBCInsertBatchAddEExecuteBatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        String caminho = "jdbc:mysql://localhost:3306/XTI";
        String sql = "insert into Pessoa (nome, sexo ,email) values(?,?,?)";
        String[] pessoas = {"Sandra, ", "Beatriz", "Leila", "Catia"};
        try (Connection conexao = DriverManager.getConnection(caminho, "root", "1223");
                PreparedStatement cmd = conexao.prepareCall(sql);) {

            for (int i = 0; i < pessoas.length; i++) {
                cmd.setString(1, pessoas[i]);
                cmd.setString(2, "F");
                cmd.setString(3, pessoas[i].toLowerCase() + "@xti.com.br");
                cmd.addBatch();

            }
            cmd.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
