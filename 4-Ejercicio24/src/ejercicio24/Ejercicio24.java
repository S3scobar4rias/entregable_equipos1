package ejercicio24;
import java.util.Scanner;
public class Ejercicio24 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Ingrese el peso de la esfera A:");
        a = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        b = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        c = input.nextDouble();
        String mayor;
        
        if (a > b && a > c){
            mayor = "A";
        }
        else if (b > a && b > c){
            mayor = "B";
        }
        else{
            mayor = "C";
        }
        System.out.println("La esfera de mayor peso es la " + mayor);                
    }
}
