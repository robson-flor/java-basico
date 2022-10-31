public class substring {
  public static void main(String[] args) {
    String nome = "Jose Silveira";
    System.out.println("String : " + nome);

    String substring = nome.substring(5);
    System.out.println("String depois da 5ª index: " + "[" + substring + "]");
    
    substring = nome.substring(1, 8);
    System.out.println("Substring (1,6): " + "["+substring+"]");
  }
}
