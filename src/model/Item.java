/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Igor
 */
public class Item {
    private Integer idItem;
    private Integer idTipo;
    private String nome;
    private Boolean disponivel;
    private Boolean necessitaPreparo;

    /**
     * @return the idItem
     */
    public Integer getIdItem() {
        return idItem;
    }

    /**
     * @param idItem the idItem to set
     */
    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    /**
     * @return the idTipo
     */
    public Integer getIdTipo() {
        return idTipo;
    }

    /**
     * @param idTipo the idTipo to set
     */
    public void setIdTipo(Integer idTipo) {
        this.idTipo = idTipo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the disponivel
     */
    public Boolean getDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    /**
     * @return the necessitaPreparo
     */
    public Boolean getNecessitaPreparo() {
        return necessitaPreparo;
    }

    /**
     * @param necessitaPreparo the necessitaPreparo to set
     */
    public void setNecessitaPreparo(Boolean necessitaPreparo) {
        this.necessitaPreparo = necessitaPreparo;
    }
    
    public Item(Integer idItem, Integer idTipo, String nome, Boolean disponivel, Boolean necessitaPreparo ){
        setIdItem(idItem);
        setIdTipo(idTipo);
        setNome(nome);
        setDisponivel(disponivel);
        setNecessitaPreparo(necessitaPreparo);        
    }
    
    public Item(){
        
    }
}
