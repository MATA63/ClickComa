/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Date;
/**
 *
 * @author cmelo
 */
public class Pedido {
    private Integer idPedido;
    private Conta Conta;
    private Item item;
    private Integer quantidade;
    private Date dataHora;
    private Funcionario Garcom;
    private Funcionario Cozinheiro;

    /**
     * @return the idPedido
     */
    public Integer getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the Conta
     */
    public Conta getConta() {
        return Conta;
    }

    /**
     * @param Conta the Conta to set
     */
    public void setConta(Conta Conta) {
        this.Conta = Conta;
    }

    /**
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the quantidade
     */
    public Integer getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the dataHora
     */
    public Date getDataHora() {
        return dataHora;
    }

    /**
     * @param dataHora the dataHora to set
     */
    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    /**
     * @return the Garcom
     */
    public Funcionario getGarcom() {
        return Garcom;
    }

    /**
     * @param Garcom the Garcom to set
     */
    public void setGarcom(Funcionario Garcom) {
        this.Garcom = Garcom;
    }

    /**
     * @return the Cozinheiro
     */
    public Funcionario getCozinheiro() {
        return Cozinheiro;
    }

    /**
     * @param Cozinheiro the Cozinheiro to set
     */
    public void setCozinheiro(Funcionario Cozinheiro) {
        this.Cozinheiro = Cozinheiro;
    }


    
}
