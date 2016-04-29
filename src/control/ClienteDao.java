/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author Igor
 */
public class ClienteDao {

    private BufferedWriter bw = null;
    private BufferedReader fr = null;

    public void salvarCliente(Cliente cliente) throws IOException{
            try{
                    bw = new BufferedWriter(new FileWriter("Cliente.cc", true));  
                    bw.write("<idCliente>"+cliente.getidCliente().toString()
                                +"<nome>"+cliente.getNome()
                                +"<cpf>"+cliente.getCpf()
                                +"<email>"+cliente.getEmail()+"<fdl>");
                    bw.newLine();
                    bw.flush();
                    bw.close();    
            }catch(Exception e){ 
                System.out.println("Ocorreu um erro ao salvar no arquivo Cliente.cc. Exception: "+e.getMessage());
            }finally{
                System.out.println("Salvo com Sucesso!");
            }
    }

    public List<Cliente> abrirCliente() throws IOException{
        List<Cliente> listCliente = new ArrayList();
        try{
            String linha;
            Integer idCliente;
            String nome;
            String cpf;
            String email;
            fr = new BufferedReader(new FileReader("Cliente.cc"));

            while ((linha = fr.readLine()) != null) {
                idCliente = Integer.getInteger(linha.substring(linha.indexOf("<idCliente>")+11), linha.indexOf("<nome>"));
                nome = linha.substring((linha.indexOf("<nome>")+6), linha.indexOf("<cpf>"));
                cpf = linha.substring((linha.indexOf("<cpf>")+5), linha.indexOf("<email>"));
                email = linha.substring((linha.indexOf("<email>")+7), linha.indexOf("<fdl>"));

                listCliente.add(new Cliente(idCliente, nome, cpf, email));
            }
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao ler o arquivo Cliente.cc. Exception: "+e.getMessage());
        }finally{
        }
        return (List<Cliente>) listCliente;
    }
}
