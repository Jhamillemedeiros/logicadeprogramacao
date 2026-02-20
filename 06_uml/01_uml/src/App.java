import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
      Usuario usuario = new Usuario(
        1L,
        "João Silva",
        new Date(),
        "joao@email.com");
      String resultado = usuario.fazerLogin("joao@email.com", "1234");
      System.out.println(resultado);
    }
}
