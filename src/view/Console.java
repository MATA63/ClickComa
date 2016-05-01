/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import control.*;
import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author Igor
 */
public class Console {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   Selecione o módulo   ");
        System.out.println("1. Cliente");
        System.out.println("2. Funcionário");        
        System.out.println("3. Gerente");
        short menuPrincipal = scanner.nextShort();
        
        switch( menuPrincipal )
        {
            case 1:
                    clienteCardapio();
                    break;
            case 2:
                    //comandos caso a opção 2 tenha sido escolhida
                    break;
            case 3:
                    //comandos caso a opção 3 tenha sido escolhida
                    break;
            default:
                    //comandos caso nenhuma das opções anteriores tenha sido escolhida
        }
        
        
    }
    
    public static void clienteCardapio() throws IOException{
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        CardapioDao cardapioDao = new CardapioDao();
        cardapio = cardapioDao.abrirCardapio();
        
        System.out.println("   Cardápio   ");
        for(Item item: cardapio.getListItem()){
            System.out.printf("%d. %s ..... R$ %.2f\n",item.getIdItem(), item.getNome(), item.getValor());
        }
        short menuCardapio = scanner.nextShort();
    }
    
    
}
