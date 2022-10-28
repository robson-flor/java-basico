public class splitLimit {
  public static void main(String[] args) {
    /* Uso do split com o LIMIT */

    String valor = "DEVMEDIA - Java - Engenharia - Software";
    String[] valorComSplit = valor.split("-", 2);

    for (String s : valorComSplit) {
      System.out.println(s);
    }
  }
}
