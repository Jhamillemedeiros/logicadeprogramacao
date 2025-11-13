package com.atividademodels.app;

public class Pessoa {
    // Atributos privados (encapsulamento)
    private String nome;
    private double peso;
    private double altura;

    // Construtor
    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Método para classificar o resultado do IMC
    public String classificarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5)
            return "Abaixo do peso";
        else if (imc < 25)
            return "Peso normal";
        else if (imc < 30)
            return "Sobrepeso";
        else if (imc < 35)
            return "Obesidade";
        else if (imc < 40)
            return "Está com obesidade nivel 2";
        else
            return " está com obesidade morbida";

    }
}
