import java.util.Scanner;

public class Main {
    
    public static void main(String[]args ) { 

        Scanner scanner = new Scanner(System.in);
               
    int contador = 0; 
    
    double[] notas =  new double[15];
    
    while (contador < 15  ) { 
        
        System.out.println("Digite a nota do aluno" + (contador + 1) + ": " );
        
        notas[contador] = scanner.nextDouble();
        contador++;
    }
      scanner.close();
  
  System.out.println("\nNotas dos estudantes: ");
 
  }
    }

