package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instancia do objeto leia
        Scanner leia = new Scanner(System.in);
        // Declaração de variaveis
        String nome;
        String email;
        int idade;
        double altura;

        // entrada de dados
        System.out.println("Informe seu nome:");
        nome= leia.nextLine();
        System.out.println ("Informe sua idade:");
        idade = leia.nextInt();
        System.out.println("Informe sua altura:");
        altura = leia.nextDouble();

        // limpeza de buffer
        leia.nextLine();

        System.out.println("Informe seu email:");
        email = leia.nextLine ();

        // saida de dados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + " m");
        System.out.println("E-mail:" + email);

        // fechar objeto close
        leia.close();


    }
}
