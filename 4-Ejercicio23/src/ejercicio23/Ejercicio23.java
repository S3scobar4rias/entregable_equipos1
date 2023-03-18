package ejercicio23;
import java.util.Scanner;
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, cuadratica_pos, cuadratica_neg;
        System.out.println("Ingrese el valor de a:");
        a = input.nextDouble();
        System.out.println("Ingrese el valor de b:");
        b = input.nextDouble();
        System.out.println("Ingrese el valor de c:");
        c = input.nextDouble();
        
        
        if (Math.pow(b, 2) - 4*a*c < 0){
            System.out.println("La ecuacion de segundo grado no tiene solucion en los reales.");
        }
        else{
            cuadratica_pos = (-b + (Math.sqrt((Math.pow(b, 2)) - 4*a*c)))/(2*a); 
            cuadratica_neg = (-b - (Math.sqrt((Math.pow(b, 2)) - 4*a*c)))/(2*a);
            if (cuadratica_pos == cuadratica_neg){
                System.out.println("La ecuacion de segundo grado solo tiene una solucion real y es " + cuadratica_pos);
            }
            else{
               System.out.println("Las soluciones de la ecuacion de segundo grado son " + cuadratica_pos + " y " + cuadratica_neg); 
            }    
        }    
    }    
}
