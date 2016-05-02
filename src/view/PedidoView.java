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
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class PedidoView {
    private Conta conta;
    
    //Inicia Conta;
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
                    
                    break;
                case "3":
                    break;
                default:
            }
            
            
            
            
        }while (finalizaConta.toUpperCase().equals("Finaliza"));
        
        return conta;
    }
    
    public Conta novoPedido() throws IOException{
        
        return null;
    }
    
}
