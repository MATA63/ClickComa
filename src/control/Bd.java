/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Collection;

/**
 *
 * @author cmelo
 */
public class Bd {

    private static Collection restaurantesBD;
    private static Collection cardapiosBD;
    private static Collection funcionariosBD;
    private static Collection clientesBD;
    private static Collection mesasBD;
    private static Collection pedidosBD;
    private static Collection refeicoesBD;

    private static Integer nextIdRestaurante = 0;
    private static Integer nextIdCardapio = 0;
    private static Integer nextIdFuncionario = 0;
    private static Integer nextIdCliente = 0;
    private static Integer nextIdMesa = 0;
    private static Integer nextIdPedido = 0;
    private static Integer nextIdRefeicao = 0;

    public static Integer getNextIdCliente() {
        nextIdCliente += 1;
        return nextIdCliente;
    }

    public static Integer getNextIdRestaurante() {
        nextIdRestaurante += 1;
        return nextIdRestaurante;
    }

    public static Integer getNextIdCardapio() {
        nextIdCardapio += 1;
        return nextIdCardapio;
    }

    public static Integer getNextIdFuncionario() {
        nextIdFuncionario += 1;
        return nextIdFuncionario;
    }

    public static Integer getNextIdMesa() {
        nextIdMesa += 1;
        return nextIdMesa;
    }

    public static Integer getNextIdPedido() {
        nextIdPedido += 1;
        return nextIdPedido;
    }

    public static Integer getNextIdRefeicao() {
        nextIdRefeicao += 1;
        return nextIdRefeicao;
    }

    /**
     * @return the restaurantesBD
     */
    public static Collection getRestaurantesBD() {
        return restaurantesBD;
    }

    /**
     * @param aRestaurantesBD the restaurantesBD to set
     */
    public static void setRestaurantesBD(Collection aRestaurantesBD) {
        restaurantesBD = aRestaurantesBD;
    }

    /**
     * @return the cardapiosBD
     */
    public static Collection getCardapiosBD() {
        return cardapiosBD;
    }

    /**
     * @param aCardapiosBD the cardapiosBD to set
     */
    public static void setCardapiosBD(Collection aCardapiosBD) {
        cardapiosBD = aCardapiosBD;
    }

    /**
     * @return the funcionariosBD
     */
    public static Collection getFuncionariosBD() {
        return funcionariosBD;
    }

    /**
     * @param aFuncionariosBD the funcionariosBD to set
     */
    public static void setFuncionariosBD(Collection aFuncionariosBD) {
        funcionariosBD = aFuncionariosBD;
    }

    /**
     * @return the clientesBD
     */
    public static Collection getClientesBD() {
        return clientesBD;
    }

    /**
     * @param aClientesBD the clientesBD to set
     */
    public static void setClientesBD(Collection aClientesBD) {
        clientesBD = aClientesBD;
    }

    /**
     * @return the mesasBD
     */
    public static Collection getMesasBD() {
        return mesasBD;
    }

    /**
     * @param aMesasBD the mesasBD to set
     */
    public static void setMesasBD(Collection aMesasBD) {
        mesasBD = aMesasBD;
    }

    /**
     * @return the pedidosBD
     */
    public static Collection getPedidosBD() {
        return pedidosBD;
    }

    /**
     * @param aPedidosBD the pedidosBD to set
     */
    public static void setPedidosBD(Collection aPedidosBD) {
        pedidosBD = aPedidosBD;
    }

    /**
     * @return the refeicoesBD
     */
    public static Collection getRefeicoesBD() {
        return refeicoesBD;
    }

    /**
     * @param aRefeicoesBD the refeicoesBD to set
     */
    public static void setRefeicoesBD(Collection aRefeicoesBD) {
        refeicoesBD = aRefeicoesBD;
    }

    /**
     * @return the nextIdRestaurante
     */
    public static Integer getNextIdRestaurante() {
        return nextIdRestaurante;
    }

    /**
     * @param aNextIdRestaurante the nextIdRestaurante to set
     */
    public static void setNextIdRestaurante(Integer aNextIdRestaurante) {
        nextIdRestaurante = aNextIdRestaurante;
    }

    /**
     * @return the nextIdCardapio
     */
    public static Integer getNextIdCardapio() {
        return nextIdCardapio;
    }

    /**
     * @param aNextIdCardapio the nextIdCardapio to set
     */
    public static void setNextIdCardapio(Integer aNextIdCardapio) {
        nextIdCardapio = aNextIdCardapio;
    }

    /**
     * @return the nextIdFuncionario
     */
    public static Integer getNextIdFuncionario() {
        return nextIdFuncionario;
    }

    /**
     * @param aNextIdFuncionario the nextIdFuncionario to set
     */
    public static void setNextIdFuncionario(Integer aNextIdFuncionario) {
        nextIdFuncionario = aNextIdFuncionario;
    }

    /**
     * @return the nextIdCliente
     */
    public static Integer getNextIdCliente() {
        return nextIdCliente;
    }

    /**
     * @param aNextIdCliente the nextIdCliente to set
     */
    public static void setNextIdCliente(Integer aNextIdCliente) {
        nextIdCliente = aNextIdCliente;
    }

    /**
     * @return the nextIdMesa
     */
    public static Integer getNextIdMesa() {
        return nextIdMesa;
    }

    /**
     * @param aNextIdMesa the nextIdMesa to set
     */
    public static void setNextIdMesa(Integer aNextIdMesa) {
        nextIdMesa = aNextIdMesa;
    }

    /**
     * @return the nextIdPedido
     */
    public static Integer getNextIdPedido() {
        return nextIdPedido;
    }

    /**
     * @param aNextIdPedido the nextIdPedido to set
     */
    public static void setNextIdPedido(Integer aNextIdPedido) {
        nextIdPedido = aNextIdPedido;
    }

    /**
     * @return the nextIdRefeicao
     */
    public static Integer getNextIdRefeicao() {
        return nextIdRefeicao;
    }

    /**
     * @param aNextIdRefeicao the nextIdRefeicao to set
     */
    public static void setNextIdRefeicao(Integer aNextIdRefeicao) {
        nextIdRefeicao = aNextIdRefeicao;
    }

}
