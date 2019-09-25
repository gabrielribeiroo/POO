/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author gabriel.rvital
 */
public class ContaPoupanca extends Conta {

    private double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double taxaJuros, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo(double valor) {
        saldo += saldo * taxaJuros;
    }
    
   @Override
    public void saque(double valor){
        saldo-= valor;
    }
    
}
