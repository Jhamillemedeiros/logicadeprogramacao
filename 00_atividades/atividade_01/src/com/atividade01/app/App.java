package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner leia = new Scanner (System.in);

        //variáveis 
         String nome;
         String data;
         String cpf;
         String email;
         double telefone;


        // entrada de dados
        System.out.println("Informe seu nome:");
        nome= leia.nextLine();
        System.out.println ("Informe sua data:");
        data = leia.nextLine();
        System.out.println("Informe sua cpf:");
        cpf = leia.nextLine();
        System.out.println("Informe seu telefone:");
        telefone = leia.nextDouble();
        
        // limpeza de buffer
        leia.nextLine();

        System.out.println("Informe seu email:");
        email = leia.nextLine ();

         // saida de dados
        System.out.println("Nome: " + nome);
        System.out.println("Data: " + data);
        System.out.println("Cpf: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);

        // fechar objeto close
        leia.close();



    }
}
