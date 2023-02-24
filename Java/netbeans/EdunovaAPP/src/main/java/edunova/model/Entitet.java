package edunova.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Entitet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sifra;

    public Entitet() {
        super();
    }

    public Entitet(int sifra) {
        super();
        this.sifra = sifra;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

}
