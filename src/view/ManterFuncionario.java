/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.*;

/**
 *
 * @author Igor
 */
public class ManterFuncionario {
    private Scanner scanner = new Scanner(System.in);
    private Integer menuFuncionarioInt = scanner.nextInt();
    private String menuFuncionarioString = scanner.next();
    private List<Funcionario> listFuncionario = new ArrayList();
    public void console_load() throws IOException{
        int sair =0;
        do{
            //for(short i=0; i<20; i++) System.out.println("\n");
            System.out.println("   Funcionario   ");
            System.out.println("1. Adicionar Funcionario");
            System.out.println("2. Exibir Funcionario");
            System.out.println("3. Alterar Funcionario");
            System.out.println("4. Excluir Funcionario");
            System.out.println("5. Retornar Menu Anterior");
            System.out.print("Opção: ");

            menuFuncionarioString = scanner.next();
            scanner.nextLine();
            switch( menuFuncionarioString )
            {
                case "1": funcionarioAdicionar();
                    break;
                case "2": funcionarioExibir();
                    break;
                case "3": funcionarioAlterar();
                    break;
                case "4": funcionarioExcluir();
                    break;
                default: sair =-1;
            }
        }while(sair == 0);
    
    }
    
    public void funcionarioAdicionar() throws IOException{
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        Funcionario funcionario = new Funcionario();
        
        //for(short i=0; i<20; i++) System.out.println("\n");
        System.out.println("   Adicionar Funcionario:");
        System.out.print("Nome: ");
        funcionario.setNome(scanner.nextLine());
        System.out.print("cpf: ");
        funcionario.setCpf(scanner.next());
        System.out.print("Numero CTPS: ");
        funcionario.setNumeroCtps(scanner.next());

        System.out.print("Cargo: ");
        funcionario.setCargo(scanner.next());
        funcionario.setIdFuncionario(funcionarioDao.maiorIdFuncionario()+1);
        funcionarioDao.salvarFuncionario(funcionario);                
    }
    
    public void funcionarioAlterar() throws IOException{
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        Funcionario funcionario = new Funcionario();
        List<Funcionario> listFuncionario = new ArrayList();
        
        funcionarioExibir();
        System.out.print("Qual funcionario:   ");
        menuFuncionarioInt = scanner.nextInt();
        scanner.reset();

        ////for(short i=0; i<20; i++) System.out.println("\n");
        System.out.println("   O que deseja alterar?   ");
        System.out.println("1. CPF");
        System.out.println("2. CTPS");
        System.out.println("3. Nome");
        System.out.println("4. Cargo");
        System.out.print("Opção: ");
        Integer menuAlterar = scanner.nextInt();
        scanner.reset();
        
        System.out.print("Alterar por: ");
        String novoAtributoFuncionario = scanner.next();
        scanner.reset();
        
        if (funcionarioDao.alterarFuncionario(menuFuncionarioInt, menuAlterar, novoAtributoFuncionario) != null){
                System.out.println("Alterado com Sucesso!");
            }else{
                System.out.println("Erro ao Alterar");
        }
    }
    
    public void funcionarioExibir() throws IOException{
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        listFuncionario = funcionarioDao.abrirFuncionario();
        System.out.println("   Funcionarios");
        for(Funcionario funcionario: listFuncionario){
            System.out.printf("%d. %s  |  %s  |  %s  |  %s  \n", 
                    funcionario.getIdFuncionario(), funcionario.getNome(), 
                    funcionario.getCpf(), funcionario.getNumeroCtps(), 
                    funcionario.getCargo());
        }
    }
   
    public void funcionarioExcluir() throws IOException{
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        funcionarioExibir();
        
        System.out.print("Qual funcionario:   ");
        Integer menuFuncionarioDeleteInt = scanner.nextInt();
        
        if(funcionarioDao.excluirFuncionario(menuFuncionarioDeleteInt) != null){
            System.out.println("Excluído com Sucesso!");
        }else{
            System.out.println("Erro ao excluir");
        }
    }
}
