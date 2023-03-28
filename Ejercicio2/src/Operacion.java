
import java.util.Scanner;

public class Operacion {
    private double num1;
    private double num2;
    
    public Operacion(double numero1, double numero2) {
        this.num1 = numero1;
        this.num2 = numero2;
    }
    
    // Constructor sin parámetros que inicializa los números en 0.0
    public Operacion() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }
    
    // Métodos get y set para los atributos numero1 y numero2
    public double getNumero1() {
        return num1;
    }
    
    public void setNumero1(double numero1) {
        this.num1 = num1;
    }
    
    public double getNumero2() {
        return num2;
    }
    
    public void setNumero2(double numero2) {
        this.num2 = num2;
    }
    
    public void crearOperacion() {
        Scanner imput = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num1 = imput.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = imput.nextDouble();
    }
    
    public double sumar() {
        return num1 + num2;
    }
    
    public double restar() {
        return num1 - num2;
    }
    
    public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero.");
            return 0;
        } else {
            return num1 * num2;
        }
    }
    
    // Método para dividir los dos números
    public double dividir() {
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}