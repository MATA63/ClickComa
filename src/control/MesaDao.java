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
public class MesaDao {

    private BufferedWriter bw = null;
    private BufferedReader fr = null;

    public void salvarMesa(Mesa mesa) throws IOException{
            try{
                    bw = new BufferedWriter(new FileWriter("Mesa.cc", true));  
                    bw.write("<idMesa>"+mesa.getIdMesa().toString()
                                +"<numero>"+mesa.getNumero().toString()
                                +"<local>"+mesa.getLocal()+"<fdl>");
                    bw.newLine();
                    bw.flush();
                    bw.close();    
            }catch(Exception e){ 
                System.out.println("Ocorreu um erro ao salvar no arquivo Mesa.cc. Exception: "+e.getMessage());
            }finally{
            }
            System.out.println("Salvo com Sucesso!");
    }
    
    public List<Mesa> abrirMesa() throws IOException{
        List<Mesa> listMesa = new ArrayList();
        try{
            String linha;
            Integer idMesa;
            Integer numero;
            String local;
            fr = new BufferedReader(new FileReader("Mesa.cc"));

            while ((linha = fr.readLine()) != null) {
                idMesa =  Integer.parseInt(linha.substring(linha.indexOf("<idMesa>")+8, linha.indexOf("<numero>")));
                numero = Integer.parseInt(linha.substring((linha.indexOf("<numero>")+8), linha.indexOf("<local>")));
                local = linha.substring((linha.indexOf("<local>")+7), linha.indexOf("<fdl>"));

                listMesa.add(new Mesa(idMesa, numero, local));
            }
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao ler o arquivo Mesa.cc. Exception: "+e.getMessage());
        }finally{
        }
        return listMesa;
    }
}
