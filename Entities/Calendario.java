package Entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;

public class Calendario {
    private String dia;
    private String mes;
    private String ano;

    public String getDia(){
        return dia;
    }

    public void setDia(String dia){
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}


