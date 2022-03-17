package com.example.orlando_txt;

import java.io.Serializable;

public class Brano implements Serializable
{
    private String titolo;
    private String autore;
    private String genere;
    private String durata;

    
    public Brano(String titolo, String autore, String genere, String durata)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.genere = genere;
        this.durata = durata;
    }

    @Override
    public String toString() {
        return
                "" + titolo +
                "\n" + autore +
                " | " + genere +
                " | " + durata + "\n";
    }
}
