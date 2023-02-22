/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zivkovic.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "zaposlenici")
public class Zaposlenik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sifra;
    @Column(name = "ime",
            nullable = false, 
            length = 50
    )
    private String ime;
     @Column(name = "prezime",
            nullable = false, 
            length = 50
    )
    private String prezime;
      @Column(columnDefinition = "char(11)",
             length = 11
    )
    private String oib;
       @Column(name = "email",
         length = 50
    )
    private String email;
        @Column(name = "radnoMjesto",
            nullable = false, 
            length = 50
    )
    private String radnoMjesto;

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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRadnoMjesto() {
        return radnoMjesto;
    }

    public void setRadnoMjesto(String radnoMjesto) {
        this.radnoMjesto = radnoMjesto;
    }
    
    
}
