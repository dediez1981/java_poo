
package EJPracticos;
import java.util.Scanner;
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String numPag;
    public Libro(String isbn, String titulo,String autor,String numPag){
                this.isbn = isbn;
                this.titulo = titulo;
                this.autor = autor;
                this.numPag = numPag;
    }
    public Libro() {
    }
    public void cargaLibro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el ISBN: ");
        isbn = input.nextLine();
        System.out.println("Ingrese el titulo: ");
        titulo = input.nextLine();
        System.out.println("Ingrese el autor: ");
        autor = input.nextLine();
        System.out.println("Ingrese el número de pag.: ");
        numPag = input.nextLine();      
    }
    public String mostrarLibro(){
        String unLibro ="ISBN: "+isbn+".\nTitulo: "+titulo+".\nAutor: "+autor+".\nNúm. Pág: "+numPag;
        return unLibro;
    }

}
