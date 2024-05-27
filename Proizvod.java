package k0_kolekcije;

public class Proizvod {
    private final String ime;
    private final int tezina;

    public Proizvod(String ime, int tezina){
        this.ime = ime;
        this.tezina = tezina;
    }

    public String getIme() {
        return ime;
    }

    public int getTezina(){
        return tezina;
    }

    @Override
    public String toString(){
        return "Proizvod{" +
            "ime='" + ime + '\'' +
            ", tezina=" + tezina +
            '}';
    }
}
