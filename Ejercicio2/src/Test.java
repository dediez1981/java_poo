
public class Test {
    public static void main(String[] args) {
        Operacion result = new Operacion();
        result.crearOperacion();
        System.out.println("La suma de los números es: " + result.sumar());
        System.out.println("La resta de los números es: " + result.restar());
        System.out.println("La multiplicación de los números es: " + result.multiplicar());
        System.out.println("La división de los números es: " + result.dividir());
    }
}    

