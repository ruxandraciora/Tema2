package Problema4;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Locale;

import static java.lang.Integer.parseInt;

public class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp)
    {
        this.nume=nume;
        this.cnp=cnp;
    }

    public void afisare() throws ParseException {
        System.out.println("Nume: "+nume);
        System.out.println("CNP: "+cnp);
        System.out.println("Varsta: "+getVarsta());
    }

    public int getVarsta() throws ParseException {
        String an = cnp.substring(1,3);
        String data = cnp.substring(1,7);
        if(2000+(parseInt(an)) > LocalDate.now().getYear())
            data = "19" + data;
        else
            data = "20" + data;
        String data_format = data.substring(0,4) + "-" + data.substring(4,6) + "-" + data.substring(6,8);
        LocalDate data_actuala = LocalDate.now();
        //SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-mm-dd");
        //String data_formatata = newFormat.format(data);
        LocalDate data_nasterii = LocalDate.parse(data_format);
        int varsta = Period.between(data_nasterii,data_actuala).getYears();
        return varsta;
    }
}
