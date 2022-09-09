import java.util.List;

public class Registro {
    int idRegistro;
    List<Documentos> documento;

    public Registro(){

    }

    public Registro(int idRegistro, List<Documentos> documento) {
        this.idRegistro = idRegistro;
        this.documento = documento;
    }
}
