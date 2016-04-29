/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Igor
 */
public class Conta {
    private Integer idConta;
    private Cliente idCliente;
    private Mesa idMesa;
    private Date dataHoraInicioAtendimento;
    private Date dataHoraFimAtendimento;

    /**
     * @return the idConta
     */
    public Integer getIdConta() {
        return idConta;
    }

    /**
     * @param idConta the idConta to set
     */
    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    /**
     * @return the idCliente
     */
    public Cliente getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idMesa
     */
    public Mesa getIdMesa() {
        return idMesa;
    }

    /**
     * @param idMesa the idMesa to set
     */
    public void setIdMesa(Mesa idMesa) {
        this.idMesa = idMesa;
    }

    /**
     * @return the dataHoraInicioAtendimento
     */
    public Date getDataHoraInicioAtendimento() {
        return dataHoraInicioAtendimento;
    }

    /**
     * @param dataHoraInicioAtendimento the dataHoraInicioAtendimento to set
     */
    public void setDataHoraInicioAtendimento(Date dataHoraInicioAtendimento) {
        this.dataHoraInicioAtendimento = dataHoraInicioAtendimento;
    }

    /**
     * @return the dataHoraFimAtendimento
     */
    public Date getDataHoraFimAtendimento() {
        return dataHoraFimAtendimento;
    }

    /**
     * @param dataHoraFimAtendimento the dataHoraFimAtendimento to set
     */
    public void setDataHoraFimAtendimento(Date dataHoraFimAtendimento) {
        this.dataHoraFimAtendimento = dataHoraFimAtendimento;
    }
    
    
}
