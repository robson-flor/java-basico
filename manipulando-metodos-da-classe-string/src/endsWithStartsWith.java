/*O método endsWith verifica se a String termina com o valor especificado, por outro lado o startsWith verifica se a String começa com o valor especificado. Sendo que o método startsWith tem duas variações: uma com o parâmetro “int toffset” e outra sem, onde o método que contém o parâmetro “int toffset” serve para dizer de onde deve começar a verificação do inicio da String.*/


public class endsWithStartsWith {
  public static void main(String[] args) {
    String valor = "DEVMEDIA - Java";

    System.out.println(valor.endsWith("Java"));
    System.out.println(valor.startsWith("DEV"));
    System.out.println(valor.startsWith("ME", 3));
  }
}
