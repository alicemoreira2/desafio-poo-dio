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
