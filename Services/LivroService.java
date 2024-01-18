package Services;

import Entities.Livro;

public class LivroService extends Livro {

    public String toString(){
        return "INFORMAÇÕES: Titulo - "
                + getTitulo()
                + "| Autor - "
                + getAutor()
                + "| Publicação - "
                + getAno();
    }

}
