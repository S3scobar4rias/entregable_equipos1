package actividad2;

public class rectangulo {
    
    int base, altura;

    rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base*altura;
    }

    double calcularPerimetro() {
        return (base*2) + (altura*2);
    }
}
