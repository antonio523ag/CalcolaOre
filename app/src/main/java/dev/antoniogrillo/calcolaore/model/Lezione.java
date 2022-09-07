package dev.antoniogrillo.calcolaore.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Lezione  implements Comparable<Lezione>{

    private LocalDateTime dataInizio;
    private LocalDateTime dataFine;
    private boolean contienePausaPranzo;

    public Lezione(int giorno, int mese, int anno, int oraInizio,int minutiInizio,int oraFine,int minutiFine,boolean contienePausaPranzo){
        dataInizio=LocalDateTime.of(anno,mese,giorno,oraInizio,minutiInizio);
        dataFine=LocalDateTime.of(anno,mese,giorno,oraFine,minutiFine);
        this.contienePausaPranzo=contienePausaPranzo;
    }

    public Lezione(int giorno, int mese, int anno, int oraInizio,int oraFine,boolean contienePausaPranzo){
        dataInizio=LocalDateTime.of(anno,mese,giorno,oraInizio,0);
        dataFine=LocalDateTime.of(anno,mese,giorno,oraFine,0);
        this.contienePausaPranzo=contienePausaPranzo;
    }

    public LocalDateTime getDataInizio() {
        return dataInizio;
    }

    public void setDataInizio(LocalDateTime dataInizio) {
        this.dataInizio = dataInizio;
    }

    public LocalDateTime getDataFine() {
        return dataFine;
    }

    public void setDataFine(LocalDateTime dataFine) {
        this.dataFine = dataFine;
    }

    public int getDurataInMinuti(){
        int conto= (int)ChronoUnit.MINUTES.between(dataInizio,dataFine);
        return contienePausaPranzo?conto-60:conto;
    }

    @Override
    public String toString() {
        return "Lezione del "+ dataFine.toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" dalle "
                + dataInizio.toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm"))+" alle "
                + dataFine.toLocalTime().format(DateTimeFormatter.ofPattern("hh:mm"));
    }

    @Override
    public int compareTo(Lezione l) {
        int compareInizio=dataInizio.compareTo(l.dataInizio);
        int compareFine=dataFine.compareTo(l.dataFine);
        if(compareInizio!=0&&compareFine!=0)return compareInizio;
        return 0;
    }
}
