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
public class CardapioDao {
    
    private BufferedWriter bw = null;
    private BufferedReader fr = null;
    
    //private Integer idCardapio;
    //private List<Item> listItem;
    public void salvarCardapio(Cardapio cardapio) throws IOException{
        try{
                bw = new BufferedWriter(new FileWriter("Cardapio.cc", true));  
                bw.write("<idCardapio>"+cardapio.getIdCardapio().toString());
                List<Item> listItem = new ArrayList();
                listItem = cardapio.getListItem();
                for(Item item : listItem){
                    bw.write("<idItem>"+item.getIdItem().toString());
                }
                bw.write("<fdl>");
                bw.newLine();
                bw.flush();
                bw.close();    
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao salvar no arquivo Cardapio.cc. Exception: "+e.getMessage());
        }finally{
            System.out.println("Salvo com Sucesso!");
        }
    }
    
//    public List<Cardapio> abrirCardapio() throws IOException{
//        List<Cardapio> listCardapio = new ArrayList();
//        try{
//            String linha;
//            Integer idCardapio;
//            List<Item> listItem = new ArrayList();
//            fr = new BufferedReader(new FileReader("Cardapio.cc"));
//
//            while ((linha = fr.readLine()) != null) {
//                idCardapio = Integer.getInteger(linha.substring(linha.indexOf("<idCardapio>")+12), linha.indexOf("<IdItem>"));
//
//                for (Item item: )
//                
//                cargo = linha.substring((linha.indexOf("<cargo>")+7), linha.indexOf("<fdl>"));
//
//                listCardapio.add(new Cardapio(idCardapio, cpf, numeroPis, nome, cargo));
//            }
//        }catch(Exception e){ 
//            System.out.println("Ocorreu um erro ao ler o arquivo Cardapio.cc. Exception: "+e.getMessage());
//        }finally{
//        }
//        return (List<Cardapio>) listCardapio;
//    }
}
