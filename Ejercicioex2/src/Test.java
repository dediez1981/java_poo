public class Test {
    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        puntos.crearPuntos();
        double distancia = puntos.calcularDistancia();
        System.out.println("La distancia entre los dos puntos es: " + distancia);
    }
}