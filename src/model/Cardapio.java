/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;

/**
 *
 * @author cmelo
 */
public class Cardapio {
    private Integer id;
    private Restaurante restaurante;
    private Collection refeicoes;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the refeicoes
     */
    public Collection getRefeicoes() {
        return refeicoes;
    }

    /**
     * @param refeicoes the refeicoes to set
     */
    public void setRefeicoes(Collection refeicoes) {
        this.refeicoes = refeicoes;
    }

    /**
     * @return the restaurante
     */
    public Restaurante getRestaurante() {
        return restaurante;
    }

    /**
     * @param restaurante the restaurante to set
     */
    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }
    
}
