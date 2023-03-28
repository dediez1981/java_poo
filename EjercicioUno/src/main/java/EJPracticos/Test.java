
package EJPracticos;

public class Test {
    public static void main(String[] args) {
        Libro unLibro = new Libro();
        unLibro.cargaLibro();
        System.out.println("*******************************************************************");
        String mostrar = unLibro.mostrarLibro();
        System.out.println(mostrar);
        System.out.println("*******************************************************************");
    }
}
