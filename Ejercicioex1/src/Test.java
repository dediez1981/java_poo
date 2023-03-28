
public class Test {
public static void main(String[] args) {
        Cancion cancion1 = new Cancion("Dale Alegría a mi corazón", "Fito Paez");
        Cancion cancion2 = new Cancion();
        
        cancion2.setTitulo("Persiana Americana");
        cancion2.setAutor("Soda Stereo");
        
        System.out.println("Canción 1: " + cancion1.getTitulo() + " - " + cancion1.getAutor());
        System.out.println("Canción 2: " + cancion2.getTitulo() + " - " + cancion2.getAutor());
    }
}    

