/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;
import control.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Igor
 */
public class ManterCliente {
    private Scanner scanner = new Scanner(System.in);
    private Integer menuClienteInt = scanner.nextInt();
    private String menuClienteString = scanner.next();
    private List<Cliente> listCliente = new ArrayList();
    public void console_load() throws IOException{
        int sair =0;
        do{
            //for(short i=0; i<20; i++) System.out.println("\n");
            System.out.println("   Cliente   ");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Exibir Cliente");
            System.out.println("3. Alterar Cliente");
            System.out.println("4. Excluir Cliente");
            System.out.println("5. Retornar Menu Anterior");
            System.out.print("Opção: ");

            menuClienteString = scanner.next();
            scanner.nextLine();
            switch( menuClienteString )
            {
                case "1": clienteAdicionar();
                    break;
                case "2": clienteExibir();
                    break;
                case "3": clienteAlterar();
                    break;
                case "4": clienteExcluir();
                    break;
                default: sair =-1;
            }
        }while(sair == 0);
    
    }
    public void clienteAdicionar() throws IOException{
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        
        //for(short i=0; i<20; i++) System.out.println("\n");
        System.out.println("   Adicionar Cliente:");
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("cpf: ");
        cliente.setCpf(scanner.next());
        System.out.print("e-mail: ");
        cliente.setEmail(scanner.next());
        cliente.setIdCliente(clienteDao.maiorIdCliente()+1);
        
        clienteDao.salvarCliente(cliente);                
    }
    
    public void clienteAlterar() throws IOException{
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        
        clienteExibir();
        System.out.println("   Qual cliente:   ");
        menuClienteInt = scanner.nextInt();
        scanner.nextLine();
        System.out.println(menuClienteInt);
        cliente = clienteDao.abrirCliente(menuClienteInt);
        ////for(short i=0; i<20; i++) System.out.println("\n");
        System.out.printf("%d. %s  |  %s  |  %s\n", 
                            cliente.getIdCliente(), cliente.getNome(), cliente.getCpf(), cliente.getEmail());
        System.out.println("   O que deseja alterar?   ");
        System.out.println("1. Nome");
        System.out.println("2. CPF");
        System.out.println("3. e-mail");
        System.out.println("5. Retornar Menu Anterior");
        System.out.print("Opção: ");
        
        Integer menuAlterar = scanner.nextInt();
        scanner.reset();
        for(Cliente clienteBusca: listCliente){
            if(clienteBusca.getIdCliente() == menuClienteInt){
                cliente = clienteBusca;
            }
        }
        scanner.nextLine();
        switch( menuClienteInt )
        {
            case 1: 
                System.out.print("Novo Nome: ");
                String novoNome = scanner.nextLine();
                System.out.println(novoNome);
                scanner.reset();
                listCliente.get(listCliente.indexOf(cliente)).setNome(novoNome);
                
                break;
            case 2:
                System.out.println("Novo CPF: ");
                listCliente.get(listCliente.indexOf(cliente)).setCpf(scanner.next());
                break;
            case 3:
                System.out.println("Novo e-mail: ");
                listCliente.get(listCliente.indexOf(cliente)).setEmail(scanner.next());
                break;
            default:
        }
        clienteDao.salvarCliente(listCliente);                
    }
    
    public void clienteExibir() throws IOException{
        ClienteDao clienteDao = new ClienteDao();
        listCliente = clienteDao.abrirCliente();
        System.out.println("   Clientes");
        for(Cliente cliente: listCliente){
            System.out.printf("%d. %s  |  %s  |  %s\n", 
                    cliente.getIdCliente(), cliente.getNome(), cliente.getCpf(), cliente.getEmail());
        }
    }
   
    public void clienteExcluir() throws IOException{
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente();
        clienteExibir();
        
        System.out.println("   Qual cliente:   ");
        menuClienteString = scanner.next();
        
        cliente = clienteDao.abrirCliente(menuClienteInt);
        listCliente.remove(cliente);
        
        clienteDao.salvarCliente(listCliente);  
    }
    
}