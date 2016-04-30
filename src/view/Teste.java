/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import model.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author iandrade
 */
public class Teste {
    public static void main(String[] args) throws IOException, ParseException {
       
        //Teste cliente::
        /*Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        cliente = clienteDao.abrirCliente(2);
        if(true){};
        
        Cliente cliente = new Cliente(3,"3","3333","333@zaroi.com");
        ClienteDao clienteDao = new ClienteDao();
        clienteDao.salvarCliente(cliente);
         List<Cliente> listCliente = new ArrayList();
         ClienteDao clienteDao = new ClienteDao();
         listCliente = clienteDao.abrirCliente();
         if(true){}*/
        
        //Teste Funcionario
        /*Funcionario funcionario = new Funcionario(2,"2","22","222","2222");
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioDao.salvarFuncionario(funcionario);
         List<Funcionario> listFuncionario = new ArrayList();
         FuncionarioDao funcionarioDao = new FuncionarioDao();
         listFuncionario = funcionarioDao.abrirFuncionario();
         if(true){}*/
        
        //Teste Item
        /*Item item = new Item(3,3,"33",true,false);
        ItemDao itemDao = new ItemDao();
        itemDao.salvarItem(item);
         List<Item> listItem = new ArrayList();
         ItemDao itemDao = new ItemDao();
         listItem = itemDao.abrirItem();
         if(true){}*/
        
        Item item = new Item();
        ItemDao itemDao = new ItemDao();
        item = itemDao.abrirItem(2);
        if(true){};
        
        //Teste Cardapio
        /* List<Item> listItem = new ArrayList();
         ItemDao itemDao = new ItemDao();
         listItem = itemDao.abrirItem();
        Cardapio cardapio = new Cardapio(listItem);
        CardapioDao cardapioDao = new CardapioDao();
        cardapioDao.salvarCardapio(cardapio);
        if(true){}
        
         Cardapio cardapio = new Cardapio();
         CardapioDao cardapioDao = new CardapioDao();
         cardapio = cardapioDao.abrirCardapio();
         if(true){}*/
        
        
        //Teste Mesa::
        /*Mesa mesa = new Mesa(3,3,"Ala 3");
        MesaDao mesaDao = new MesaDao();
        mesaDao.salvarMesa(mesa);
         if(true){}
         List<Mesa> listMesa = new ArrayList();
         MesaDao mesaDao = new MesaDao();
         listMesa = mesaDao.abrirMesa();
         if(true){}*/

        //Teste Conta
        /*Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();
        cliente = clienteDao.abrirCliente(1);
        if(true){};
        
        Mesa mesa = new Mesa();
        MesaDao mesaDao = new MesaDao();
        mesa = mesaDao.abrirMesa(1);        
        
        Date todaysDate = new Date();
        Conta conta = new Conta(2,cliente,mesa,todaysDate,todaysDate);
        ContaDao contaDao = new ContaDao();
        contaDao.salvarConta(conta);
         if(true){}
        
         List<Conta> listConta = new ArrayList();
         ContaDao contaDao = new ContaDao();
         listConta = contaDao.abrirConta();
         if(true){}
         
        Conta conta = new Conta();
        ContaDao contaDao = new ContaDao();
        conta = contaDao.abrirConta(1);
         if(true){}*/
        
        
    }
}
