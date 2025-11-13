package com;

import javax.swing.JOptionPane;

import com.atividademodels.app.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       
        // declaração de variáveis
        String nome;
        double peso;
        double altura;
        double imc;
        String resultado;

        // Entrada de dados via JOptionPane
        nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso (kg):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura (m):"));

        // Cria o objeto da classe Pessoa
        Pessoa pessoa = new Pessoa(nome, peso, altura);

        // Processamento
        imc = pessoa.calcularIMC();
        resultado = pessoa.classificarIMC();

        // Saída de dados
        JOptionPane.showMessageDialog(null,
            "Nome: " + pessoa.getNome() +
            "\nPeso: " + pessoa.getPeso() + " kg" +
            "\nAltura: " + pessoa.getAltura() + " m" +
            "\nIMC: " + String.format("%.2f", imc) +
            "\nClassificação: " + resultado
        );
    }
}

