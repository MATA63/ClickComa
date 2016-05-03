/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.*;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;
import model.*;
/**
 *
 * @author Igor
 */
public class LoginFuncionarioView {
    public void console_load() throws IOException{
        Scanner scanner = new Scanner(System.in);
        Boolean TrueOuFalse = true;

        // Verifica Funcionario.
        FuncionarioDao funcionarioDao = new FuncionarioDao();
        do{
            System.out.println("   Acessando a Conta   ");
            System.out.print("Informe CPF: ");
            Funcionario funcionario = funcionarioDao.abrirFuncionario(scanner.next());
            if(funcionario != null){
                
                switch( funcionario.getCargo() )
                {
                    case "Garçom":
                        TrueOuFalse = visaoGarcom(funcionario);
                        break;
                    case "Cozinheiro":
                        TrueOuFalse = visaoCozinheiro(funcionario);
                        break;
                    case "Gerente":
                        TrueOuFalse = visaoGerente(funcionario);
                        break;
                }
                
                TrueOuFalse = false;
            }else{
                System.out.println("Funcionario não encontrado!");
                System.out.print("Informar novamente o CPF (s/n)? ");
                if(scanner.next().toUpperCase().equals("S")){
                    TrueOuFalse = true;
                }else{
                    TrueOuFalse = false;
                }
            }
        }while(TrueOuFalse);     
    }
    
    public Boolean visaoGarcom(Funcionario garcom) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String menuModulo = scanner.nextLine();
        ModuloFuncionarioView moduloFuncionarioView = new ModuloFuncionarioView();
        do{
            System.out.println("   Opções  ");
            System.out.println("1. Visualizar Mesas Disponíveis [Não Implementado!]");
            System.out.println("2. Visualizar Pedidos");
            System.out.println("3. Confirmar Entrega Pedido");
            System.out.println("4. Sair");
            
            switch( menuModulo )
            {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Opção inexistente.");
            }
        }while(true);
        
    }
    
    public Boolean visaoCozinheiro(Funcionario cozinheiro) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String menuModulo = scanner.nextLine();
        ModuloFuncionarioView moduloFuncionarioView = new ModuloFuncionarioView();
        do{
            System.out.println("   Selecione o módulo  ");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionário");
            System.out.println("3. Sair");
            
            switch( menuModulo )
            {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Opção inexistente.");
            }
        }while(true);
    }
    
    public Boolean visaoGerente(Funcionario gerente) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String menuModulo = scanner.nextLine();
        ModuloFuncionarioView moduloFuncionarioView = new ModuloFuncionarioView();
        do{
            System.out.println("   Selecione o módulo  ");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionário");
            System.out.println("3. Sair");
            
            switch( menuModulo )
            {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Opção inexistente.");
            }
        }while(true);
        
    }
    
}
