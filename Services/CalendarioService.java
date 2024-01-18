package Services;

import Entities.Calendario;

import java.text.SimpleDateFormat;

public class CalendarioService extends Calendario {


    public void validaData(){

        String juncao = getDia() + "/" + getMes() + "/" + getAno();

        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyy");
        formatador.setLenient(false);

        try {
            formatador.parse(juncao);
            System.out.println("Data válida!");
            System.out.println(getDia() + "/" + getMes() + "/" + getAno());

        } catch (Exception ex) {
            System.out.println("Data inválida!");
            System.out.println(getDia() + "/" + getMes() + "/" + getAno());
        }

    }
}
