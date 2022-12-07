package QuantidadeNecessaria;

import java.util.Scanner;

public class Quantidade {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);  
      
        int NAmigos = scanner.nextInt(); 
          
        for (int i = 1; i <= NAmigos; i++) {
      
           double amigos = scanner.nextInt() * NAmigos;
      
           double npizzas = Math.ceil(amigos/SLICE);
      
           System.out.println((int)npizzas); 
      
        }
      
          scanner.close();
      
    }
}

/*   REVISAR CÓDIGO; ESSE FOI APRESENTADO COMO CORRETO, SENDO QUE O MEU APRESENTOU O RESULTADO CORRETO NO RUN

    public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int NAmigos = scanner.nextInt(); // NAmigos = quantidade de testes



    for (int i = 1; i <= NAmigos; i++) {

      double amigos = scanner.nextInt()*scanner.nextInt();

      double npizzas = Math.ceil(amigos/SLICE);

       System.out.println((int)npizzas); // (int) -> conversão do double para int

    }

    scanner.close();
        
    } */
