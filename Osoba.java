import java.util.Objects;

// Pomocna klasa koja sluzi za cuvanje i dohvatanje podataka o osobama

public final class Osoba {
    private final String ime;
    private final int starost;

    public Osoba(String ime, int starost) {
        Objects.requireNonNull(ime); // Ne sme da se prosledi null kao ime
        this.ime = ime;
        this.starost = starost;
    }

    public int getStarost() {
        return starost;
    }

    public String getIme() {
        return ime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Osoba osoba = (Osoba) o;
        return starost == osoba.starost
                && ime.equals(osoba.ime);
    }

    @Override
    public int hashCode() {
        int rezultat = ime.hashCode();
        rezultat = 31 * rezultat + starost;
        return rezultat;
    }

    @Override
    public String toString() {
        return "Osoba{" + "ime='" + ime + '\'' +
                ", starost=" + starost + '}';
    }
}
