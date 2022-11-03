public class toCharrArray {
  public static void main(String[] args) {
    String s1 = "ola";
    String s2 = "TCHAU";
    String s3 = "             espacos          ";

    System.out.println("s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3);

    // METODO REPLACE
    System.out.printf("Replace 'l' por 'L' no s1: %s\n\n", s1.replace('l', 'L'));

    // METODO UPPER E LOWERCASE
    System.out.printf("s1.toUpperCase() = %s\n", s1.toUpperCase());
    System.out.printf("s1.toLowerCase() = %s\n", s1.toLowerCase());

    // METODO TRIM - REMOVE OS ESPACOS
    System.out.printf("s3 depois do trim = \"%s\"\n\n", s3.trim());

    //CONVERTEU O ola PARA CHAR
    char[] charArray = s1.toCharArray();
    System.out.printf("s1 como um caracter array =\n");

    for (char caracter : charArray) {
      System.out.println(caracter);
    }
  }
}
