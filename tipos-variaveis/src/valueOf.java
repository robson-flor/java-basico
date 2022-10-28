/*Este metodo converte diversos tipos (booleano, inteiro, char, double, float, long, Object e etc) para String. */

public class valueOf {
  public static void main(String[] args) {
    //boolean
    boolean myBoolean = true;
    System.out.println(String.valueOf(myBoolean));

    //float 
    float myFloat = -10;
    System.out.println(String.valueOf(myFloat));

    //int
    int myInt = 9;
    System.out.println(String.valueOf(myInt));

    //double
    double myDouble = 10.30;
    System.out.println(String.valueOf(myDouble));
  }
}
