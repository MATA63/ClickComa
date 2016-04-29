/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

public class Cardapio {
    private Integer idCardapio;
    private List<Item> listItem;

    /**
     * @return the idCardapio
     */
    public Integer getIdCardapio() {
        return idCardapio;
    }

    /**
     * @param idCardapio the idCardapio to set
     */
    public void setIdCardapio(Integer idCardapio) {
        this.idCardapio = idCardapio;
    }

    /**
     * @return the listItem
     */
    public List<Item> getListItem() {
        return listItem;
    }

    /**
     * @param listItem the listItem to set
     */
    public void setListItem(List<Item> listItem) {
        this.listItem = listItem;
    }

}
