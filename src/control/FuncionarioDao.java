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
public class FuncionarioDao {
    private BufferedWriter bw = null;
    private BufferedReader fr = null;

    public void salvarFuncionario(Funcionario funcionario) throws IOException{
        try{
                bw = new BufferedWriter(new FileWriter("Funcionario.cc", true));  
                bw.write("<idFuncionario>"+funcionario.getIdFuncionario().toString()
                            +"<cpf>"+funcionario.getCpf()
                            +"<numeroPis>"+funcionario.getNumeroPis()
                            +"<nome>"+funcionario.getNome()
                            +"<cargo>"+funcionario.getCargo()+"<fdl>");
                bw.newLine();
                bw.flush();
                bw.close();    
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao salvar no arquivo Funcionario.cc. Exception: "+e.getMessage());
        }finally{
            System.out.println("Salvo com Sucesso!");
        }
    }
    
    public List<Funcionario> abrirFuncionario() throws IOException{
        List<Funcionario> listFuncionario = new ArrayList();
        try{
            String linha;
            Integer idFuncionario;
            String cpf;
            String numeroPis;
            String nome;
            String cargo;
            fr = new BufferedReader(new FileReader("Funcionario.cc"));

            while ((linha = fr.readLine()) != null) {
                idFuncionario = Integer.getInteger(linha.substring(linha.indexOf("<idFuncionario>")+15), linha.indexOf("<cpf>"));
                cpf = linha.substring((linha.indexOf("<cpf>")+5), linha.indexOf("<numeroPis>"));
                numeroPis = linha.substring((linha.indexOf("<numeroPis>")+11), linha.indexOf("<nome>"));
                nome = linha.substring((linha.indexOf("<nome>")+6), linha.indexOf("<cargo>"));
                cargo = linha.substring((linha.indexOf("<cargo>")+7), linha.indexOf("<fdl>"));

                listFuncionario.add(new Funcionario(idFuncionario, cpf, numeroPis, nome, cargo));
            }
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao ler o arquivo Funcionario.cc. Exception: "+e.getMessage());
        }finally{
        }
        return (List<Funcionario>) listFuncionario;
    }
}
