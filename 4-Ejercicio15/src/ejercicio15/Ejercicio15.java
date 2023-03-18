package ejercicio15;
import java.util.Scanner;
public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pesoA, pesoB, pesoC, pesoD, peso_diferente;
        System.out.println("Ingrese el peso de la esfera A:");
        pesoA = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        pesoB = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        pesoC = input.nextDouble();
        System.out.println("Ingrese el peso de la esfera D:");
        pesoD = input.nextDouble();
        
        String esf_diferente = "La esfera A es la diferente";
        peso_diferente = pesoA;
        String may_men = " y es la de mayor peso.";
        
        if (pesoB != peso_diferente && pesoB != pesoC){
            peso_diferente = pesoB;
            esf_diferente = "La esfera B es la diferente";
            if (peso_diferente < pesoC){
                may_men = " y es la de menor peso.";
            }
        } 
        else if (pesoC != peso_diferente && pesoC != pesoD){
            peso_diferente = pesoC;
            esf_diferente = "La esfera C es la diferente";
            if (peso_diferente < pesoD){
                may_men = " y es la de menor peso.";
            }
        }
        else if (pesoD != peso_diferente && pesoD != pesoB){
            peso_diferente = pesoD;
            esf_diferente = "La esfera D es la diferente";
            if (peso_diferente < pesoB){
                may_men = " y es la de menor peso.";
            }
        }
        else{
            if (pesoA < pesoB){
                may_men = " y es la de menor peso.";
            }
        }
        System.out.println(esf_diferente+may_men);
    }   
}
