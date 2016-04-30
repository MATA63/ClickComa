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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.*;

/**
 *
 * @author Igor
 */
public class ContaDao {

    private BufferedWriter bw = null;
    private BufferedReader fr = null;

    public void salvarConta(Conta conta) throws IOException{
        try{
            DateFormat formatacaoData = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            bw = new BufferedWriter(new FileWriter("Conta.cc", true));  
            bw.write("<idConta>"+conta.getIdConta().toString()
                        +"<idCliente>"+conta.getCliente().getIdCliente().toString()
                        +"<idMesa>"+conta.getMesa().getIdMesa().toString()
                        +"<dataHoraInicioAtendimento>"+formatacaoData.format(conta.getDataHoraInicioAtendimento())
                        +"<dataHoraFimAtendimento>"+formatacaoData.format(conta.getDataHoraFimAtendimento())+"<fdl>");
            bw.newLine();
            bw.flush();
            bw.close();    
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao salvar no arquivo Conta.cc. Exception: "+e.getMessage());
        }finally{
        }
        System.out.println("Salvo com Sucesso!");
    }
    
    public List<Conta> abrirConta() throws IOException, ParseException{
    List<Conta> listConta = new ArrayList();
    try{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String linha;
        Integer idConta;
        Cliente cliente = new Cliente();
        Mesa mesa = new Mesa();
        Date dataHoraInicioAtendimento;
        Date dataHoraFimAtendimento;
        fr = new BufferedReader(new FileReader("Conta.cc"));

        while ((linha = fr.readLine()) != null) {
            idConta =  Integer.parseInt(linha.substring(linha.indexOf("<idConta>")+9, linha.indexOf("<idCliente>")));
            cliente.setIdCliente(Integer.parseInt(linha.substring(linha.indexOf("<idCliente>")+11, linha.indexOf("<idMesa>"))));
            mesa.setIdMesa(Integer.parseInt(linha.substring(linha.indexOf("<idMesa>")+8, linha.indexOf("<dataHoraInicioAtendimento>"))));
            dataHoraInicioAtendimento = formatter.parse(linha.substring(linha.indexOf("<dataHoraInicioAtendimento>")+27, linha.indexOf("<dataHoraFimAtendimento>")));
            dataHoraFimAtendimento = formatter.parse(linha.substring(linha.indexOf("<dataHoraFimAtendimento>")+24, linha.indexOf("<fdl>")));

            listConta.add(new Conta(idConta, cliente, mesa, dataHoraInicioAtendimento, dataHoraFimAtendimento));
        }
    } catch (ParseException e){
        e.printStackTrace();
    }catch(Exception e){ 
        System.out.println("Ocorreu um erro ao ler o arquivo Conta.cc. Exception: "+e.getMessage());
    }finally{
        
    }
    return listConta;
    }
    
    public Conta abrirConta(Integer idContaProcurado) throws IOException, ParseException{
    try{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        String linha;
        Integer idConta;
        Cliente cliente = new Cliente();
        Mesa mesa = new Mesa();
        Date dataHoraInicioAtendimento;
        Date dataHoraFimAtendimento;
        fr = new BufferedReader(new FileReader("Conta.cc"));

        while ((linha = fr.readLine()) != null) {
            idConta =  Integer.parseInt(linha.substring(linha.indexOf("<idConta>")+9, linha.indexOf("<idCliente>")));
            cliente.setIdCliente(Integer.parseInt(linha.substring(linha.indexOf("<idCliente>")+11, linha.indexOf("<idMesa>"))));
            mesa.setIdMesa(Integer.parseInt(linha.substring(linha.indexOf("<idMesa>")+8, linha.indexOf("<dataHoraInicioAtendimento>"))));
            dataHoraInicioAtendimento = formatter.parse(linha.substring(linha.indexOf("<dataHoraInicioAtendimento>")+27, linha.indexOf("<dataHoraFimAtendimento>")));
            dataHoraFimAtendimento = formatter.parse(linha.substring(linha.indexOf("<dataHoraFimAtendimento>")+24, linha.indexOf("<fdl>")));
            
            if(idContaProcurado == cliente.getIdCliente()){
                Conta conta = new Conta(idConta, cliente, mesa, dataHoraInicioAtendimento, dataHoraFimAtendimento);
                return conta;
            }
        }
    } catch (ParseException e){
        e.printStackTrace();
    }catch(Exception e){ 
        System.out.println("Ocorreu um erro ao ler o arquivo Conta.cc. Exception: "+e.getMessage());
    }finally{
    }
    return null;
    }
    
}
