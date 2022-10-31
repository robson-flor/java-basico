public class iguaisIgnoraCase {
  public static void main(String[] args) {
    String nome1 = "Carlos";
    String nome2 = "carlos";

    if(nome1.equalsIgnoreCase(nome2)) {
      System.out.println("Os nomes sao iguais!");
    }
  }
}
