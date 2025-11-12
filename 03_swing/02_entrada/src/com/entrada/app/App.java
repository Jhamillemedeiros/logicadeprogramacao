package com.entrada.app;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome;
        int idade;
        String resultado;

        // entrada de dados
        nome = JOptionPane.showInputDialog(" Informe seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

        // saida de dados
        /* if (idade >= 18) {
            JOptionPane.showMessageDialog(null, nome + " é maior de idade. ");
        } else {
            JOptionPane.showMessageDialog(null, nome + " é menor de idade. ");
        } */

        //verifica maioridade
        resultado = (idade >= 18) ? "é maior de idade" : "é menor de idade";

        //saida de dados
        JOptionPane.showMessageDialog(null, nome + " " + resultado + ".");


    }
}
