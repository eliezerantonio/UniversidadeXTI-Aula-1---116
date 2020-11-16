/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula113.jdbc.transação.commit.rollback;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eliezer
 */
public class ContaCrud {

    public void tranferir(Connection conexao, Conta origem, Conta destino, double valor) throws SQLException {
        if (origem.saldo >= valor) {

            try {
                conexao.setAutoCommit(false);
                /*saldo*/
                origem.saldo -= valor;

                alterar(conexao, origem);

                /*deposito*/
                destino.saldo += valor;
                alterar(conexao, destino);
                conexao.commit();
            } catch (Exception e) {
                conexao.rollback();
            }

        }
    }

    public void criar(Connection conexao, Conta conta) {

        String sql = "insert into Conta values(?,?,?)";
        try (PreparedStatement cmd = (PreparedStatement) conexao.prepareStatement(sql);) {
            cmd.setInt(1, conta.numero);
            cmd.setString(2, conta.cliente);
            cmd.setDouble(3, conta.saldo);
            cmd.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void alterar(Connection conexao, Conta conta) {

        String sql = "update Conta set cliente=?, saldo=? where numero =? ";
        try (PreparedStatement cmd = (PreparedStatement) conexao.prepareStatement(sql);) {
            cmd.setString(1, conta.cliente);
            cmd.setDouble(2, conta.saldo);
            cmd.setInt(3, conta.numero);
            cmd.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deletar(Connection conexao, Conta conta) {

        String sql = "  delete  from Conta where numero =?";
        try (PreparedStatement cmd = (PreparedStatement) conexao.prepareStatement(sql);) {
            cmd.setInt(1, conta.numero);
            cmd.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ContaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Conta> ler(Connection conexao) {

        List<Conta> lista = new ArrayList<>();
        String sql = "select * from Conta";
        try (PreparedStatement cmd = (PreparedStatement) conexao.prepareStatement(sql); ResultSet rs = cmd.executeQuery();) {
            while (rs.next()) {
                lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));

            }
        } catch (SQLException ex) {
            Logger.getLogger(ContaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    public static void main(String... args) {
        String caminho = "jdbc:mysql://localhost:3306/CRUD";
        try (Connection conexao = (Connection) DriverManager.getConnection(caminho, "root", "1223");) {
            Conta conta = new Conta("Eliezer", 1000.10);
            Conta conta2 = new Conta("Fernando", 1000.10);
            Conta conta3 = new Conta("Kimenemene", 1000.10);
            Conta conta4 = new Conta("Antonio", 1000.10);
            ContaCrud crud = new ContaCrud();
            /*     crud.criar(conexao, conta);
            crud.criar(conexao, conta2);
            crud.criar(conexao, conta3);
            crud.criar(conexao, conta4);*/

            List<Conta> contas = crud.ler(conexao);

            for (int i = 0; i < contas.size(); i++) {
                System.out.println(contas.get(i).toStrig());
            }
            Conta origem = contas.get(0);
            Conta destino = contas.get(1);
            crud.tranferir(conexao, origem, destino, 500);
            System.out.println("-------------------------");
            for (int i = 0; i < contas.size(); i++) {
                System.out.println(contas.get(i).toStrig());
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContaCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
