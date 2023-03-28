
public class Test {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo();
        rect.crearRectangulo(); 
        System.out.println("La superficie del rectángulo es: " + rect.calcularSuperficie());
        System.out.println("El perímetro del rectángulo es: " + rect.calcularPerimetro());
        System.out.println("Dibujo del rectángulo:");
        rect.dibujarRectangulo();
    }
}    

