/*Ambos os métodos retornam uma parte específica de uma determinada String, sendo que o método substring retorna uma nova String e o método subSequence retorna um CharSequence. É importante ressaltar que o CharSequence é uma interface e a String é a implementação dessa interface. */

public class substringEsubSequence {
  public static void main(String[] args) {
    String valor = "DEVMEDIA - Java";
    System.out.println(valor.substring(0,5));
    System.out.println(valor.subSequence(0, 5));
  }
}
