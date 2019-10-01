/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import Classes.Conta;
import Classes.ContaNegocio;
import Classes.ContaPoupanca;

/**
 *
 * @author gabriel.rvital
 */
public class TesteHeranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta c = new Conta(1001, "Alex", 0);
        ContaNegocio bc = new ContaNegocio(500.0, 1001, "Maria", 0);

        //UPCASTING 
        Conta acc1 = bc;
        Conta acc2 = new ContaNegocio(200.0, 1003, "Bob", 0.0);
        Conta acc3 = new ContaPoupanca(0.1, 1004, "Ana", 0.0);

        //DOWNCASTING
        ContaNegocio acc4 = (ContaNegocio) acc2;
        acc4.emprestimo(100.0);

        if (acc3 instanceof ContaNegocio) {
            ContaNegocio acc5 = (ContaNegocio) acc3;
            System.out.println("Emprestimo");
        }
        if (acc3 instanceof ContaPoupanca) {
            ContaPoupanca acc5 = (ContaPoupanca) acc3;
            acc5.atualizarSaldo(0);
            System.out.println("Atualização");
        }
        Conta cc1 = new Conta(1005, "Alex", 1000.0);
        cc1.saque(200.0);
        System.out.println(cc1.getSaldo());

        Conta cc2 = new ContaPoupanca(0.1, 1007, "Maria", 1000.0);
        cc2.saque(200.0);
        System.out.println(cc2.getSaldo());

        Conta cc3 = new ContaNegocio(500, 1008, "Carlos", 1000.0);
        cc3.saque(200.0);
        System.out.println(cc3.getSaldo());

        //POLIMORFISMO
        /*é quando uma classe no nosso caso CONTA tem o mesmo metodo em 2 subclasses diferentes Ocasionando um comportamento diferente em 
        cada uma das classes por exemplo:*/
        Conta account1 = new Conta(221, "Gabriel Vital", 13.5);
        Conta account2 = new ContaPoupanca(13.5, 221, "Gabriel Vital", 100);
        /*Possuimos 2 objetos do tipo conta porem cada um com a sua sub classe especifica.*/
        account1.saque(3);
        account2.saque(38);
        System.out.println(account1.getSaldo());
        System.out.println(account2.getSaldo());
        /*Então polimorfismo é nada mais do que um classe que existe subclasses com o mesmo metodos que podem ser aplicados e executam
        taferas diferentes.*/
        
    }

}
