import java.util.List;

public class Titulo {
    String nombre;
    List<Documentos> Documentos;

    public Titulo(){

    }

    public Titulo(String nombre, List<Documentos> documentos) {
        this.nombre = nombre;
        Documentos = documentos;
    }
}
