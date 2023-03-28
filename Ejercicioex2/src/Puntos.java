import java.util.Scanner;

public class Puntos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    
    // Constructor sin parámetros que inicializa todas las coordenadas en 0.0
    public Puntos() {
        this.x1 = 0.0;
        this.y1 = 0.0;
        this.x2 = 0.0;
        this.y2 = 0.0;
    }
    
    // Constructor que recibe las coordenadas de los dos puntos como parámetros
    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    // Métodos get y set para las coordenadas de los dos puntos
    public double getX1() {
        return x1;
    }
    
    public void setX1(double x1) {
        this.x1 = x1;
    }
    
    public double getY1() {
        return y1;
    }
    
    public void setY1(double y1) {
        this.y1 = y1;
    }
    
    public double getX2() {
        return x2;
    }
    
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    public double getY2() {
        return y2;
    }
    
    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    // Método para pedir al usuario las coordenadas de los dos puntos y guardarlas en el objeto
    public void crearPuntos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la coordenada x del primer punto: ");
        x1 = sc.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        y1 = sc.nextDouble();
        System.out.print("Ingrese la coordenada x del segundo punto: ");
        x2 = sc.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        y2 = sc.nextDouble();
    }
    
    // Método para calcular y devolver la distancia entre los dos puntos
    public double calcularDistancia() {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}