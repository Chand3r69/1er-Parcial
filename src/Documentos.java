import java.util.List;
public class Documentos {
    String tema;
    String url;
    Index index;
    List<Titulo> titulo;
    Registro registro;


    public Documentos(){

    }

    public Documentos(String tema, String url, Index index, List<Titulo> titulo, Registro registro) {
        this.tema = tema;
        this.url = url;
        this.index = index;
        this.titulo = titulo;
        this.registro = registro;
    }
}
