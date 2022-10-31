public class indexOfelastIndexOf {
  public static void main(String[] args) {
    String letras = "abcjdefdfjalsjflasjflasjfalseklmncbbc";
    //TESTA indexOf PARA LOCALIZAR UM CARACTERE EM UMA STRING
    System.out.printf("ultimo 'c' esta localizado no index %d\n", letras.indexOf('c'));
    System.out.printf("ultimo 'a' esta localizado no index %d\n", letras.indexOf('a', 7));
    
    //-1 NAO EXISTE
    System.out.printf(" '$' esta localizado no index %d\n\n", letras.indexOf('$'));

    //TESTA lastIndexOf PARA LOCALIZAR UM CARACTER EM UMA STRING
    System.out.printf("ultimo 'c' esta localizado no index %d\n", letras.lastIndexOf('c'));
    System.out.printf("ultimo 'a' esta localizado no index %d\n", letras.lastIndexOf('a',36));
    System.out.printf("ultimo '$' esta localizado no index %d\n", letras.lastIndexOf('$'));

    //TESTA indexOf PARA LOCALIZAR UMA SUBSTRING EM UMA STRING
    System.out.printf("\"def\" esta localizado no index %d\n", letras.indexOf("def"));

    //2 argumento string e outro o ponto inicial que comecara a pesquisa
    System.out.printf("\"def\" esta localizado no index %d\n", letras.indexOf("def", 7));
    System.out.printf("\"hello\" esta localizado no index %d\n\n", letras.indexOf("hello"));
  }
}
