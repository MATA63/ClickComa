/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import model.*;
import control.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class PedidoView {
    private Conta conta;
    
    //Inicia Conta;
    //
    // NÃO TESTADO!!!!!!
    // NÃO TESTADO!!!!!!
    // NÃO TESTADO!!!!!!
    //
    public Conta console_load() throws IOException{
        String finalizaConta = "n";
        LoginClienteView loginClienteView = new LoginClienteView();
        this.conta = loginClienteView.console_load(conta);
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("  O que deseja: ");
            System.out.println("1. Visualizar Cardapio ");
            System.out.println("2. Solicitar Pedido ");
            System.out.println("3. Fechar Conta ");
            System.out.print("Opção: ");
            
            finalizaConta = scanner.next();
            CardapioView cardapioView = new CardapioView();
            switch( finalizaConta )
            {
                case "1":
                    cardapioView.console_load();
                    break;
                case "2":
                    novoPedido();
                    break;
                case "3":
                    fecharConta();
                    finalizaConta = "Finaliza";
                    break;
                default:
            }

        }while (finalizaConta.toUpperCase().equals("Finaliza"));
        
        return conta;
    }
    
    public Conta novoPedido() throws IOException{
        Scanner scanner = new Scanner(System.in);
        PedidoDao pedidoDao = new PedidoDao();
        Pedido pedido = new Pedido();
        pedido.setConta(conta);
        
        System.out.print("Informe o número do item: ");
        Integer idItem = scanner.nextInt();
        ItemDao itemDao = new ItemDao();
        pedido.setItem(itemDao.abrirItem(idItem));

        System.out.print("Informe a quantidade: ");
        pedido.setQuantidade(scanner.nextInt());
        
        pedido.setDataHora(new Date());
        
        pedidoDao.salvarPedido(pedido);
        return null;
    }
    
    public void fecharConta() throws IOException{
        List<Pedido> listPedido = new ArrayList();
        PedidoDao pedidoDao = new PedidoDao();
        listPedido = pedidoDao.abrirPedido(conta);
        exibirFechamentoConta(listPedido);
        /*
        * COnfirmação do cliente
        */
        
    }
    
    public void exibirFechamentoConta(List<Pedido> listPedido) throws IOException{
        float valorTotal =0;
        if(listPedido == null){
            System.out.println("Não foi pedido nada. Conta vazia!");
        }else{
            System.out.printf("   Conta:  ");
            System.out.printf("Nº Pedido | Quantidade | Nome Produto | Valor ");
            for(Pedido pedido: listPedido){
                System.out.printf("%d. %d \t %s \t %.2f"+
                                    pedido.getIdPedido(), pedido.getQuantidade(),
                                    pedido.getItem().getNome(), pedido.getItem().getValor());
                valorTotal = ( pedido.getItem().getValor() * pedido.getQuantidade() ) + valorTotal;
            }
            System.out.printf("Total: "+ valorTotal);
            
        }
    }
    
}
