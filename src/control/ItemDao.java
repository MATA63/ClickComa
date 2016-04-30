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
public class ItemDao {
    private BufferedWriter bw = null;
    private BufferedReader fr = null;

    public void salvarItem(Item item) throws IOException{
        try{
                bw = new BufferedWriter(new FileWriter("Item.cc", true));  
                bw.write("<idItem>"+item.getIdItem().toString()
                            +"<idTipo>"+item.getIdTipo()
                            +"<nome>"+item.getNome()
                            +"<disponivel>"+item.getDisponivel().toString()
                            +"<necessitaPreparo>"+item.getNecessitaPreparo().toString()+"<fdl>");
                bw.newLine();
                bw.flush();
                bw.close();    
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao salvar no arquivo Item.cc. Exception: "+e.getMessage());
        }finally{
            System.out.println("Salvo com Sucesso!");
        }
    }
    
    public List<Item> abrirItem() throws IOException{
        List<Item> listItem = new ArrayList();
        try{
            String linha;
            Integer idItem;
            Integer idTipo;
            String nome;
            Boolean disponivel;
            Boolean necessitaPreparo;
            fr = new BufferedReader(new FileReader("Item.cc"));

            while ((linha = fr.readLine()) != null) {
                idItem = Integer.parseInt(linha.substring(linha.indexOf("<idItem>")+8,linha.indexOf("<idTipo>")));
                idTipo = Integer.parseInt(linha.substring(linha.indexOf("<idTipo>")+8, linha.indexOf("<nome>")));
                nome = linha.substring(linha.indexOf("<nome>")+6, linha.indexOf("<disponivel>"));
                disponivel = Boolean.parseBoolean(linha.substring(linha.indexOf("<disponivel>")+12, linha.indexOf("<necessitaPreparo>")));
                necessitaPreparo = Boolean.parseBoolean(linha.substring(linha.indexOf("<necessitaPreparo>")+18, linha.indexOf("<fdl>")));
                
                listItem.add(new Item(idItem, idTipo, nome, disponivel, necessitaPreparo));
            }
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao ler o arquivo Item.cc. Exception: "+e.getMessage());
        }finally{
        }
        return listItem;
    }
}
