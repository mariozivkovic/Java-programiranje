/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadatak.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name="osobe")
public class Osoba {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sifra;
    @Column(
            name = "imeosobe",
            nullable = false, 
            length = 50
    )
    private String ime;
    private String prezime;
    @Column(columnDefinition = "decimal(18,2)")
    private BigDecimal primanja;
    private Boolean aktivan;
    @Column(columnDefinition = "datetime")
    private Date datumRodenja;

    public Integer getSifra() {
        return sifra;
    }

    public void setSifra(Integer sifra) {
        this.sifra = sifra;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public BigDecimal getPrimanja() {
        return primanja;
    }

    public void setPrimanja(BigDecimal primanja) {
        this.primanja = primanja;
    }

    public Boolean getAktivan() {
        return aktivan;
    }

    public void setAktivan(Boolean aktivan) {
        this.aktivan = aktivan;
    }

    public Date getDatumRodenja() {
        return datumRodenja;
    }

    public void setDatumRodenja(Date datumRodenja) {
        this.datumRodenja = datumRodenja;
    }
    
}
