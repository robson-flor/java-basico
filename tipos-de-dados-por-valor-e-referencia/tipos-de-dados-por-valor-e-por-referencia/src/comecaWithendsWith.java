public class comecaWithendsWith {
  public static void main(String[] args) {
    String[] nomes = { "iniciado", "iniciando", "finalizado", "finalizando" };

    for (String recebeNomes : nomes) {
      if (recebeNomes.startsWith("in"))
        System.out.printf("\"%s\" inicia com \"in\" \n", recebeNomes);
    }
    
    System.out.println();

    for (String recebeNomes : nomes) {
      if (recebeNomes.startsWith("ici", 2))
        System.out.printf("\"%s\" inicia com \"ici\" na posicao 2 \n", recebeNomes);
    }
    
    System.out.println();

    for (String recebeNomes : nomes) {
      if (recebeNomes.endsWith("ado"))
      System.out.printf("\"%s\" termina com \"ado\" \n", recebeNomes);
    }
  }
}
