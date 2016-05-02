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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.*;

public class PedidoDao {
    private BufferedWriter bw = null;
    private BufferedReader fr = null;

    public void salvarPedido(Pedido pedido) throws IOException{
        try{
            DateFormat formatacaoData = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            bw = new BufferedWriter(new FileWriter("Pedido.cc", true));  
            bw.write("<idPedido>"+pedido.getIdPedido().toString()
                        +"<conta>"+pedido.getConta().getIdConta().toString()
                        +"<item>"+pedido.getItem().getIdItem().toString()
                        +"<quantidade>"+pedido.getQuantidade()
                        +"<dataHora>"+formatacaoData.format(pedido.getDataHora())
                        +"<garcom>"+pedido.getGarcom().getIdFuncionario().toString()
                        +"<cozinheiro>"+pedido.getCozinheiro().getIdFuncionario().toString()+"<fdl>");
            bw.newLine();
            bw.flush();
            bw.close();    
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao salvar no arquivo Pedido.cc. Exception: "+e.getMessage());
        }finally{
        }
        System.out.println("Salvo com Sucesso!");
    }

    public List<Pedido> abrirPedido() throws IOException{
        List<Pedido> listPedido = new ArrayList();
        try{
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
            String linha;
            Integer idPedido;
            Conta conta = new Conta();
            Item item = new Item();
            Integer quantidade;
            Date dataHora;
            Funcionario garcom = new Funcionario();
            Funcionario cozinheiro = new Funcionario();
            fr = new BufferedReader(new FileReader("Pedido.cc"));

            while ((linha = fr.readLine()) != null) {
                idPedido =  Integer.parseInt(linha.substring(linha.indexOf("<idPedido>")+10, linha.indexOf("<conta>")));
                conta.setIdConta(Integer.parseInt(linha.substring(linha.indexOf("<conta>")+7, linha.indexOf("<item>"))));
                item.setIdItem(Integer.parseInt(linha.substring(linha.indexOf("<item>")+6, linha.indexOf("<quantidade>"))));
                quantidade = Integer.parseInt(linha.substring(linha.indexOf("<quantidade>")+12, linha.indexOf("<dataHora>")));
                dataHora = formatter.parse(linha.substring(linha.indexOf("<dataHora>")+10, linha.indexOf("<garcom>")));
                garcom.setIdFuncionario(Integer.parseInt(linha.substring(linha.indexOf("<garcom>")+8, linha.indexOf("<cozinheiro>"))));
                cozinheiro.setIdFuncionario(Integer.parseInt(linha.substring(linha.indexOf("<cozinheiro>")+12, linha.indexOf("<fdl>"))));
                listPedido.add(new Pedido(idPedido, conta, item, quantidade, dataHora, garcom, cozinheiro));
            }
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao ler o arquivo Pedido.cc. Exception: "+e.getMessage());
        }finally{
        }
        return listPedido;
    }
    
//    public Pedido abrirPedido(Conta contaPesquisada) throws IOException{
//        try{
//            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
//            String linha;
//            Integer idPedido;
//            Conta conta = new Conta();
//            Item item = new Item();
//            Integer quantidade;
//            Date dataHora;
//            Funcionario garcom = new Funcionario();
//            Funcionario cozinheiro = new Funcionario();
//            fr = new BufferedReader(new FileReader("Pedido.cc"));
//
//            while ((linha = fr.readLine()) != null) {
//                idPedido =  Integer.parseInt(linha.substring(linha.indexOf("<idPedido>")+10, linha.indexOf("<conta>")));
//                conta.setIdConta(Integer.parseInt(linha.substring(linha.indexOf("<conta>")+7, linha.indexOf("<item>"))));
//                item.setIdItem(Integer.parseInt(linha.substring(linha.indexOf("<item>")+6, linha.indexOf("<quantidade>"))));
//                quantidade = Integer.parseInt(linha.substring(linha.indexOf("<quantidade>")+12, linha.indexOf("<dataHora>")));
//                dataHora = formatter.parse(linha.substring(linha.indexOf("<dataHora>")+10, linha.indexOf("<garcom>")));
//                garcom.setIdFuncionario(Integer.parseInt(linha.substring(linha.indexOf("<garcom>")+8, linha.indexOf("<cozinheiro>"))));
//                cozinheiro.setIdFuncionario(Integer.parseInt(linha.substring(linha.indexOf("<cozinheiro>")+12, linha.indexOf("<fdl>"))));
//
//                if (contaPesquisada.getIdConta() == conta.getIdConta()){
//                    Pedido pedido = new Pedido(idPedido, contaPesquisada, item, quantidade, dataHora, garcom, cozinheiro);
//                    return pedido;
//                }
//            }
//        }catch(Exception e){ 
//            System.out.println("Ocorreu um erro ao ler o arquivo Pedido.cc. Exception: "+e.getMessage());
//        }finally{
//        }
//        return null;
//    }
    
    public List<Pedido> abrirPedido(Conta contaPesquisada) throws IOException{
    try{
        List<Pedido> listPedido = new ArrayList();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String linha;
        Integer idPedido;
        Conta conta = new Conta();
        Item item = new Item();
        Integer quantidade;
        Date dataHora;
        Funcionario garcom = new Funcionario();
        Funcionario cozinheiro = new Funcionario();
        fr = new BufferedReader(new FileReader("Pedido.cc"));

        while ((linha = fr.readLine()) != null) {
            idPedido =  Integer.parseInt(linha.substring(linha.indexOf("<idPedido>")+10, linha.indexOf("<conta>")));
            conta.setIdConta(Integer.parseInt(linha.substring(linha.indexOf("<conta>")+7, linha.indexOf("<item>"))));
            item.setIdItem(Integer.parseInt(linha.substring(linha.indexOf("<item>")+6, linha.indexOf("<quantidade>"))));
            quantidade = Integer.parseInt(linha.substring(linha.indexOf("<quantidade>")+12, linha.indexOf("<dataHora>")));
            dataHora = formatter.parse(linha.substring(linha.indexOf("<dataHora>")+10, linha.indexOf("<garcom>")));
            garcom.setIdFuncionario(Integer.parseInt(linha.substring(linha.indexOf("<garcom>")+8, linha.indexOf("<cozinheiro>"))));
            cozinheiro.setIdFuncionario(Integer.parseInt(linha.substring(linha.indexOf("<cozinheiro>")+12, linha.indexOf("<fdl>"))));
            
            if (contaPesquisada.getIdConta() == conta.getIdConta()){
                listPedido.add(new Pedido(idPedido, contaPesquisada, item, quantidade, dataHora, garcom, cozinheiro));
            }
        }
        return listPedido;
    }catch(Exception e){ 
        System.out.println("Ocorreu um erro ao ler o arquivo Pedido.cc. Exception: "+e.getMessage());
    }finally{
    }
    return null;
    }
    
}
