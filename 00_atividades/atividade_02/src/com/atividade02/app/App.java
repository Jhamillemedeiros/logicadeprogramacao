package com.atividade02.app;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
      //instancia Scanner
        Scanner leia = new Scanner(System.in);

     //equação de 1º grau: a*x + b=0

     // declaração de variavéis
     double a;
     double b;
     double x;

     // entrada doos coeficientes
        System.out.println("Informe o valor de 'a':");
        a = leia.nextDouble();
         System.out.println("Informe o valor de 'b': ");
        b = leia.nextDouble();
        
        //calcule a equação de ! grau a*x + b = 0
        if (a != 0) {
            x = -b/a;
            System.out.println("x = "+ x);
        }
        else{
            System.out.println("Não exixte raiz real.");
        }

        leia.close();

    }
}
