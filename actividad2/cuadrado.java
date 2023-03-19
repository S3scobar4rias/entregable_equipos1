package actividad2;

public class cuadrado {
    
    int lado;

    public cuadrado(int lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado*lado;
    }

    double calcularPerimetro() {
        return (lado*4);
    }
}
