package ejercicio13;
import java.util.Scanner;
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double descuento;
        
        System.out.println("Ingrese el valor de la compra:");
        double val_comp = input.nextDouble();
        input.nextLine();
        
        System.out.println("Ingrese el color de la bolita:");
        String bolita = input.nextLine();
        
        if (bolita.equals("blanca")){
            descuento = 0;
        }
        else if (bolita.equals("verde")){
            descuento = val_comp*0.1;
        }
        else if (bolita.equals("amarilla")){
            descuento = val_comp*0.25;
        }
        else if (bolita.equals("azul")){
            descuento = val_comp*0.5;
        }
        else{
            descuento = val_comp;
        }
        System.out.println("El valor a pagar es: " + (val_comp-descuento));
    }    
}
