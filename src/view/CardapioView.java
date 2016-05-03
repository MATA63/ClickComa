/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.*;
import control.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor
 */
public class CardapioView {
    private List<Item> cardapioItem = new ArrayList();
    public void console_load() throws IOException{
        System.out.println("  Cardápio Digital:  ");
        cardapioExibir();
    }
    
    public void cardapioExibir() throws IOException{
        List<Item> listItem = new ArrayList();
        ItemDao itemDao = new ItemDao();
        listItem = itemDao.abrirItemCardapio();
        
        for(Item item: listItem){
            if(item.getDisponivel() == true){
                cardapioItem.add(item);
                System.out.printf("%d. %s \t R$ %.2f\n", item.getIdItem(),
                                    item.getNome(), item.getValor());
            }
        }
    }
    
}
