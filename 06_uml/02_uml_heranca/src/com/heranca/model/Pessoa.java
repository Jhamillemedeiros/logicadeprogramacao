package com.heranca.model;

public class Pessoa {
    //atributos
    public String email;
    public String telefone;
    public long idPessoa;

    public Pessoa(String email, String telefone, long idPessoa) {
        this.email = email;
        this.telefone = telefone;
        this.idPessoa = idPessoa;
    }

    public void exibirDados() {
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("idPessoa: " + this.idPessoa);
    }

}
