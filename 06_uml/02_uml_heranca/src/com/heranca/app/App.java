package com.heranca.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//classe Java importada
import java.util.Scanner;

//classes criadas por mim
import com.heranca.model.PessoaFisica;
import com.heranca.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(
                null,
                null,
                LocalDate.now(),
                null,
                null,
                1);
        PessoaJuridica corp = new PessoaJuridica(
                null,
                null,
                null,
                null,
                null,
                2);
        // entrada de dados
        System.out.println("INFORME OS DADOS DO USUÁRIO:\n");
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o e-mail: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a data de Nascimento (dd/MM/yyyy): ");
        usuario.dataNascimento = LocalDate.parse(leia.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        // Limpeza de buffer
        leia.nextLine();

        // entrada de dados da empresa
        System.out.println("\nINFORME OS DADOS DA EMPRESA:\n");
        System.out.println("Informe o nome da empresa: ");
        corp.nomeFantasia = leia.nextLine();
        System.out.println("Informe a razão social: ");
        corp.razaoSocial = leia.nextLine();
        System.out.println("Informe o CNPJ: ");
        corp.cnpj = leia.nextLine();
        System.out.println("Informe o e-mail: ");
        corp.email = leia.nextLine();
        System.out.println("Informe o telefone: ");
        corp.telefone = leia.nextLine();

        // saida de dados
        System.out.println("\nDADOS DO USUÁRIO:\n");
        usuario.exibirDados();
        System.out.println("\nDADOS DA EMPRESA:\n");
        corp.exibirDados();

        // fecha objeto leia
        leia.close();

    }
}
