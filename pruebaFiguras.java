package actividad2;

public class pruebaFiguras {

    public static void main(String[] args) {
        
        circulo figura1 = new circulo(2);
        rectangulo figura2 = new rectangulo(1, 2);
        cuadrado figura3 = new cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);

        System.out.println("El area del circulo es = " + figura1.calcularArea());
        System.out.println("El perimetro del circulo es = " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es = " + figura2.calcularArea());
        System.out.println("El perimetro del rectangulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El area del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perimetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El area del triangulo es = " + figura4.calcularArea());
        System.out.println("El perimetro del triangulo es = " + figura1.calcularPerimetro());
        figura4.determinarTipoTriangulo();

    }
    
}
