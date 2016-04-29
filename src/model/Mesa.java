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
public class Mesa {
    private Integer idMesa;
    private Integer numero;
    private String local;

    /**
     * @return the idMesa
     */
    public Integer getidMesa() {
        return idMesa;
    }

    /**
     * @param idMesa the idMesa to set
     */
    public void setidMesa(Integer id) {
        this.idMesa = idMesa;
    }

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the local
     */
    public String getlocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setlocal(String local) {
        this.local = local;
    }
}
