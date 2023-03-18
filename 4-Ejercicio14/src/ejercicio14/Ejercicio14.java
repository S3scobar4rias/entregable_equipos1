package ejercicio14;
import java.util.Scanner;
public class Ejercicio14 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double vd1, vd2, vd3, salario, total_ventas, porcentaje, salario1, salario2, salario3;
        System.out.println("Ingrese las ventas del departamento 1: ");
        vd1 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        vd2 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        vd3 = input.nextDouble();
        System.out.println("Ingrese el salario del vendedor:");
        salario = input.nextDouble();
        
        total_ventas = vd1+vd2+vd3;
        porcentaje = total_ventas*0.33;
        
        if (vd1 > porcentaje){
            salario1 = salario+0.2*salario;
        }
        else{
            salario1 = salario;
        }
        if (vd2 > porcentaje){
            salario2 = salario+0.2*salario;
        }
        else{
            salario2 = salario;
        }
        if (vd3 > porcentaje){
            salario3 = salario+0.2*salario;
        }
        else{
            salario3 = salario;
        }
        System.out.println("Los salarios de los vendedores son:");
        System.out.println("Salario vendedores departamento 1:" + salario1);
        System.out.println("Salario vendedores departamento 2:" + salario2);
        System.out.println("Salario vendedores departamento 3:" + salario3);                                              
    }    
}
