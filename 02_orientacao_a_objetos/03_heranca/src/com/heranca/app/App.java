package com.heranca.app;

import com.heranca.models.Pessoa;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.nome = "Jhamille Medeiros";
        usuario.cpf = "123.456.789-12";
        usuario.email = "jhamille@gmail.com";
        usuario.telefone = "(61) 98165-4558";
        usuario.idade = 32;

        empresa.razaoSocial = "Jhamille LTDA";
        empresa.nomeFantasia = "Cyberdyne Systems";
        empresa.cnpj = "55.897.554/0001-64";
        empresa.email = "ciberdyne@gmail.com";
        empresa.telefone = "(61)95446-5440";

        System.out.println("E-mail do usuário: " + usuario.email);
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("CPF do usuário: " + usuario.cpf);
        System.out.println("Idade do usuário: " + usuario.idade + " anos.");
        System.out.println("\n_________________________________________________________________________________________________________________________\n");
        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("E-mail da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);

    }
}
