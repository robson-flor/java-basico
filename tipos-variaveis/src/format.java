/**
 * format
 */
public class format {

  public static void main(String[] args) {
    String result = String.format("Hoje nós processamos %, d transações", 1000);
    System.out.println(result);

    result = String.format("10/3=%.2f", 10.0 / 3.0);
    System.out.println(result);
  }
}