/*
 * Ambos fazem comparação de duas Strings, sendo que o primeiro (compareTo)
 * considera letras maiúsculas e minúsculas na comparação e o segundo
 * (compareToIgnoreCase) ignora qualquer diferença de minúsculas ou maiúsculas.
 * Ambos também retornam a quantidade de diferenças, sendo que nos importa
 * saber, no momento, que quando o retorno for igual a zero significa que não há
 * diferenças entre a String.
 */
public class compareTocompareToIgnoreCase {
  public static void main(String[] args) {
    String valor = "DEVMEDIA - Java";

    System.out.println(valor.compareTo("DEVMEDIA - Java") == 0 ? true : false);
    System.out.println(valor.compareTo("DEVMEDIA - JAVA") == 0 ? true : false);
    System.out.println(valor.compareToIgnoreCase("DEVMEDIA - JAVA") == 0 ? true : false);
  }
}
