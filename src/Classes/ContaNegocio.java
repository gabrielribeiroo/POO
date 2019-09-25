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
public class ContaNegocio extends Conta {

    private double limiteEmprestimo;

    public ContaNegocio() {
        super();
    }

    public ContaNegocio(double limiteEmprestimo, int numero, String titular, double saldo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            saldo += valor - 10;
        }
    }

    @Override
    public void saque(double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }
}
