import java.util.Date;

public class Index {
    Boolean hash;
    int tamaño;
    Date decha;
    Documentos documentos;
    public Index(){

    }

    public Index(Boolean hash, int tamaño, Date decha, Documentos documentos) {
        this.hash = hash;
        this.tamaño = tamaño;
        this.decha = decha;
        this.documentos = documentos;
    }
}
