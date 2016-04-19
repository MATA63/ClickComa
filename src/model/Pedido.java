/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cmelo
 */
public class Pedido {
    private Integer id;
    private Cliente cliente;
    private Refeicao refeicao;

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
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the refeicao
     */
    public Refeicao getRefeicao() {
        return refeicao;
    }

    /**
     * @param refeicao the refeicao to set
     */
    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
    }
    
}
