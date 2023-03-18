package ejercicio22;
import java.util.Scanner;
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario_horas, horas, salario_mensual;
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = input.nextLine();
        System.out.println("Ingrese el salario basico por hora:");
        salario_horas = input.nextDouble();
        System.out.println("Ingrese las horas trabajadas en el mes:");
        horas = input.nextDouble();
        
        salario_mensual = salario_horas*horas;
        System.out.println(nombre);
        if (salario_mensual > 450000){
            System.out.println("El salario mensual es:" + salario_mensual);
        }
    }    
}
