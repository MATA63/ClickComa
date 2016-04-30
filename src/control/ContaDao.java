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
import java.util.GregorianCalendar;
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
                bw = new BufferedWriter(new FileWriter("Conta.cc", true));  
                bw.write("<idConta>"+conta.getIdConta().toString()
                            +"<idCliente>"+conta.getIdCliente()
                            +"<idMesa>"+conta.getIdMesa()
                            +"<dataHoraInicioAtendimento>"+conta.getDataHoraInicioAtendimento()
                            +"<dataHoraFimAtendimento>"+conta.getDataHoraFimAtendimento()+"<fdl>");
                bw.newLine();
                bw.flush();
                bw.close();    
        }catch(Exception e){ 
            System.out.println("Ocorreu um erro ao salvar no arquivo Conta.cc. Exception: "+e.getMessage());
        }finally{
        }
        System.out.println("Salvo com Sucesso!");
    }
    
//    public List<Conta> abrirConta() throws IOException{
//    List<Conta> listConta = new ArrayList();
//    try{
//        
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//        //Date startDate = startDate = df.parse();
//        //String newDateString = df.format(startDate);
//        
//        
//        ->>> Ver a questão da data hora.
//        Date dataHora = new Date();
//        String linha;
//        Integer idConta;
//        Integer idCliente;
//        Integer idMesa;
//        Date dataHoraInicioAtendimento = df.;
//        Date dataHoraFimAtendimento;
//        fr = new BufferedReader(new FileReader("Conta.cc"));
//
//        while ((linha = fr.readLine()) != null) {
//            idConta =  Integer.parseInt(linha.substring(linha.indexOf("<idConta>")+9, linha.indexOf("<idCliente>")));
//            idCliente = Integer.parseInt(linha.substring((linha.indexOf("<idCliente>")+11), linha.indexOf("<idMesa>")));
//            idMesa = Integer.parseInt(linha.substring((linha.indexOf("<idMesa>")+8), linha.indexOf("<dataHoraInicioAtendimento>")));
//            dataHoraInicioAtendimento = linha.substring((linha.indexOf("<dataHoraInicioAtendimento>")+27), linha.indexOf("<dataHoraFimAtendimento>"));
//            dataHoraFimAtendimento = linha.substring((linha.indexOf("<dataHoraFimAtendimento>")+24), linha.indexOf("<fdl>"));
//
//            listConta.add(new Conta(idConta, nome, cpf, email));
//        }
//    }catch(Exception e){ 
//        System.out.println("Ocorreu um erro ao ler o arquivo Conta.cc. Exception: "+e.getMessage());
//    }finally{
//    }
//    return listConta;
//    }
    
}
