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
public class Restaurante {
    private Integer id;
    private String nome;
    private String CNPJ;
    private Cardapio cardapio;
    private Funcionario funcionario;
    private Mesa mesa;
    
    
    public Integer getId(){
        return id;
    }    
    
    public void setId(Integer id){
        this.id = id;
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
     * @return the CNPJ
     */
    public String getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the cardapio
     */
    public Cardapio getCardapio() {
        return cardapio;
    }

    /**
     * @param cardapio the cardapio to set
     */
    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    /**
     * @return the funcionario
     */
    public Funcionario getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * @return the mesa
     */
    public Mesa getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
        
}
