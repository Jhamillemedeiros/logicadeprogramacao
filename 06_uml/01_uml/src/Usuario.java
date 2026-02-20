import java.util.Date;

public class Usuario {
    private long idUsuario;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String senha;

    //Construtor
    public Usuario(long udUsuario, String nome, Date dataNascimento, String email) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
    }

    //Método fazerLongin

public String fazerLogin(String Login, String senha) {
    if (Login.equals(this.email) && senha.equals("1234")) {
        return "Login realizado com sucesso!";
    }
    else {
        return "Login ou senha incorreta!";
    }
}
}
