package numberperfect;
import java.util.Scanner;


public class NumberPerfect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i, suma = 0;
        Scanner sc = new Scanner(System.in);
        
     
        long empiezaTiempo = System.currentTimeMillis();
        
        System.out.print("Ingrese numero perfecto: ");
        int numero = sc.nextInt();
      
        for (i = 1; i < numero; i++) {                             
            if (numero % i == 0) {
                suma = suma + i;   
            }
        }

        if (suma == numero) {
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es Perfecto");
        }
        
        
        long finTiempo = System.currentTimeMillis();
        
        
        long duracion = finTiempo - empiezaTiempo;
        
       
         System.out.println("Tiempo de ejecucion: " + duracion + " ms");
        
       
        }
    }


