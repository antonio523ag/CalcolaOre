package dev.antoniogrillo.calcolaore.model;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Corso {
    private String nomeCorso;
    private Set<Lezione> lezioni;

    public Corso(String nomeCorso) {
        this.nomeCorso = nomeCorso;
        lezioni=new TreeSet<>();
    }

    public void aggiungiLezione(Lezione l){
        lezioni.add(l);
    }

    public void aggiungiLezione(int giorno, int mese, int anno, int oraInizio,int minutiInizio,int oraFine,int minutiFine,boolean pausaPranzo){
        lezioni.add(new Lezione(giorno, mese, anno, oraInizio,minutiInizio,oraFine,minutiFine,pausaPranzo));
    }

    public void aggiungiLezione(int giorno, int mese, int anno, int oraInizio,int oraFine,boolean pausaPranzo){
        lezioni.add(new Lezione(giorno, mese, anno,oraInizio,oraFine,pausaPranzo));
    }

    public int getDurataCorsoInMinuti(){
        return lezioni.stream().mapToInt(Lezione::getDurataInMinuti).sum();
    }
}
