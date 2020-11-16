/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula064.desafio.i_o.armazenar.contas.em.arquivo.sequencial;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class Aula064DesafioI_OArmazenarContasEmArquivoSequencial {

    public ArrayList<Conta> buscarContas() throws IOException {
        ArrayList<Conta> lista = new ArrayList<>();
         Path caminho = Paths.get("/home/eliezer/Documents/Arquivo/ListaDeContas.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        try (BufferedReader reader = Files.newBufferedReader(caminho, utf8)) {
            String linha = null;

            while ((linha = reader.readLine()) != null) {
                String[] t = linha.split(";");
                Conta conta = new Conta(t[0], Double.parseDouble(t[1]));
                lista.add(conta);
            }

        }
        return lista;

    }

    public static void main(String[] args) throws IOException {
        ArrayList<Conta> contas = new ArrayList();

        contas.add(new Conta("Eliezer Antonio", 2012));
        contas.add(new Conta("Eliany Cabral", 201221.2));
        contas.add(new Conta("Sandra  Brande", 201221.30));

        Conta conta = new Conta();
        conta.armazenarContas(contas);
      //  conta.buscarContas(contas);
        Aula064DesafioI_OArmazenarContasEmArquivoSequencial operacao = new Aula064DesafioI_OArmazenarContasEmArquivoSequencial();
        ArrayList<Conta> contas2 = operacao.buscarContas();
        for (Conta next : contas2) {
            next.mostrarSaldo();
        }

    }

}
