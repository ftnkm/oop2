// Izuzetak koji se baca kada se pokusa uzimanje elementa sa praznog steka

public class PotkoracenjeStekaIzuzetak extends RuntimeException {

    public PotkoracenjeStekaIzuzetak(){ }

    public PotkoracenjeStekaIzuzetak(String s){
        super(s);
    }
}
