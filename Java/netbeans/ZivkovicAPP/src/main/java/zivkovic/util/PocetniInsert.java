/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zivkovic.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import zivkovic.model.Busotina;
import zivkovic.model.NaftnoPolje;
import zivkovic.model.Posao;
import zivkovic.model.Zaposlenik;

import org.hibernate.Session;
import zivkovic.model.Busotina;
import zivkovic.model.NaftnoPolje;
import zivkovic.model.Odrzavanje;
import zivkovic.model.Posao;
import zivkovic.model.PosaoBusotina;
import zivkovic.model.Zaposlenik;


/**
 *
 * @author lovre
 */
public class PocetniInsert {
    
    
    private static final int BROJ_ZAPOSLENIKA =100;
    private static final int BROJ_POSLOVA =5000;
    private static final int BROJ_NAFTNIH_POLJA = 10;
    private static final int BROJ_BUSOTINA =300;
    private static final int BROJ_POSLOVA_BUSOTINA =10000;
    private static final int BROJ_ODRZAVANJA =16800;
    
    
    private Faker faker;
    private List<Zaposlenik> zaposlenici;
    private List<Posao> poslovi;
    private List<NaftnoPolje> naftnaPolja;
    private List<Busotina> busotine;
    private List<PosaoBusotina> posloviBusotine;
    private List<Odrzavanje> odrzavanja;
    
    private Session session;
    
    public PocetniInsert() {
        
        faker = new Faker();
        zaposlenici = new ArrayList<>();
        poslovi = new ArrayList<>();
        naftnaPolja = new ArrayList<>();
        busotine = new ArrayList<>();
        posloviBusotine  = new ArrayList<>();
        odrzavanja = new ArrayList<>();
       
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajZaposlenike();
        kreirajPoslove();
        kreirajNaftnaPolja();
        kreirajBusotine();
        kreirajPosloviBusotine();
        kreirajOdrzavanja();
        
        session.getTransaction().commit();
      
    }

    private void kreirajZaposlenike() {
        
        Zaposlenik z;
        for(int i= 0;i<BROJ_ZAPOSLENIKA;i++ ){
            z = new Zaposlenik();
            z.setIme(faker.name().firstName());
            z.setPrezime(faker.name().lastName());
            //z.setOib(Alati.dovuciOib());
            z.setEmail(faker.internet().emailAddress());
            z.setRadnoMjesto(faker.job().position());
            
            session.persist(z);
            zaposlenici.add(z);
        }
    }

    private void kreirajPoslove() {
        
        Posao p;
        for(int i=0;i<BROJ_POSLOVA;i++){
            p = new Posao();
            p.setNaziv(faker.app().name());
            session.persist(p);
            poslovi.add(p);
        }
        
    }

    private void kreirajNaftnaPolja() {
        
        NaftnoPolje np;
        for(int i =0;i< BROJ_NAFTNIH_POLJA;i++){
            np = new NaftnoPolje();
            np.setNaziv(faker.country().name());
            session.persist(np);
            naftnaPolja.add(np);
        }
    }

    private void kreirajBusotine() {
        
        Busotina b;
        List<NaftnoPolje> np;
        for(int i =0;i<BROJ_BUSOTINA;i++){
            b = new Busotina();
            b.setNaziv(faker.country().countryCode2());
            b.setAktivna(faker.bool().bool());
            np = new ArrayList<>();
            
            for(int j=1;j<=1;j++){
                np.add(naftnaPolja.get(sb(0, BROJ_NAFTNIH_POLJA-1)));
            }
            
            b.setNaftnaPolja(np);
            session.persist(b);
            busotine.add(b);
        }
    }
    private void kreirajPosloviBusotine() {
             
             PosaoBusotina pb;
             for(int i =0;i<BROJ_POSLOVA_BUSOTINA;i++){
                 pb = new PosaoBusotina();
                 pb.setPosao(poslovi.get(sb(0, BROJ_POSLOVA-1)));
                 pb.setBusotina(busotine.get(sb(0, BROJ_BUSOTINA-1)));
                 pb.setNapomena(faker.book().title());
                 pb.setTlakTubinga(new BigDecimal(faker.number().randomDouble(2, 8, 15)));
                 pb.setTlakNaftovoda(new BigDecimal(faker.number().randomDouble(2, 8, 15)));
                 pb.setTlakCasinga(new BigDecimal(faker.number().randomDouble(2, 10, 50)));
                 
                 session.persist(pb);
                 posloviBusotine.add(pb);
             }
    }
        private void kreirajOdrzavanja() {
            
            Odrzavanje o;
            List<Zaposlenik> z;
            List<PosaoBusotina> pb;
            for(int i =0;i<BROJ_ODRZAVANJA;i++){
                o = new Odrzavanje();
                o.setDatum(faker.date().birthday());
                z = new ArrayList<>();
                for(int j=1;j<=1;j++){
                    z.add(zaposlenici.get(sb(0, BROJ_ZAPOSLENIKA-1)));
                }
                o.setZaposlenici(z);
                
                pb = new ArrayList<>();
                for(int a = 0;a<sb(10, 20);i++){
                   
                    pb.add(posloviBusotine.get(sb(0, BROJ_POSLOVA_BUSOTINA-1)));
                }
                o.setPosloviBusotine(pb);
                session.persist(o);
                
            }
            
    }
         
    
    
    
    private int sb(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 177 out of bounds for length 0
//	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
//	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
//	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
//	at java.base/java.util.Objects.checkIndex(Objects.java:359)
//	at java.base/java.util.ArrayList.get(ArrayList.java:427)
//	at zivkovic.util.PocetniInsert.kreirajPosloviBusotine(PocetniInsert.java:138)
//	at zivkovic.util.PocetniInsert.<init>(PocetniInsert.java:68)
//	at zivkovic.Start.main(Start.java:20)

    
            
    }
    

