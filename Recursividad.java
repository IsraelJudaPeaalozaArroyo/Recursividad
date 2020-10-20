package recursividad;
import java.util.*;


public class Recursividad {

    public static void main(String[] args) {
        Recursividad  metodo = new Recursividad  ();
        Scanner leer = new Scanner (System.in);
        int opc, x;
        
         do {

            System.out.println(" INGRESE LA OPCION QUE QUIERAS REALIZAR");
            System.out.println(" 1 - Sucesión de Fibonacci ");
            System.out.println(" 2 - Mostrar del 1 al 10 ");
            System.out.println(" 3 - Factorial ");
            System.out.println(" 4 - Números en escalera ");
            System.out.println(" 5 - Salir del programa ");
            opc=leer.nextInt();
            
            switch (opc){
                case 1:
                    System.out.println("Ingrese el tamaño: ");
                    x=leer.nextInt();
                    for (int i=0; i<x; i++) {
                        System.out.println(metodo.fibonacci(i));
                    }
                    
                    break;
                case 2:
                    metodo.muestra(1);
                    break;
                case 3: 
                    System.out.println("Ingrese el numero a factorizar: ");
                    x = leer.nextInt();
                    System.out.println("El factorial es: "+metodo.factorial(x));
                    break;
                case 4:
                    metodo.escalera(10);
                    break;
                     
                    default:
             }
                    } while (opc != 5);

                      }

                       public void muestra(int x){
                           if (x<=10){
                               System.out.println(x + " ");
                               muestra(x+1);
                           }
                           
                       }
        
                            public int fibonacci(int i){
                     if (i>1){
                        return fibonacci(i-1) + fibonacci(i-2);  
                     }
                     else if (i==1) { 
                         return 1;
                     }
                     else if (i==0){ 
                         return 0;
                     }
                     else{
                         System.out.println("No es correcto el valor.....");
                         System.out.println("Ingresa un numero mayor a uno");
                         return -1;       

                     }

                 }
                public double factorial(int n){

                        if (n==0||n==1){
                                return 1;
                            } else{
                                return n * factorial(n-1);
                            }
                       }   
                
        public void escalera (int f){
                if (f > -1) {
              for (int i = 0; i <= f; i++) {
                  System.out.print(" "+i);
              }
                    System.out.println(" ");
              escalera(f - 1);
          }
       }
    }
