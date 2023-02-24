/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.util;

import com.github.javafaker.Faker;
import edunova.model.Grupa;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import org.hibernate.Session;


public class PocetniInsert {

    private static final int BROJ_SMJEROVA = 15;
    private static final int BROJ_PREDAVACA = 7;
    private static final int BROJ_POLAZNIKA = 3000;
    private static final int BROJ_GRUPA = 220;

    private Faker faker;
    private List<Smjer> smjerovi;
    private List<Polaznik> polaznici;
    private List<Predavac> predavaci;
    private Session session;

    public PocetniInsert() {
        faker = new Faker();
        smjerovi = new ArrayList<>();
        polaznici = new ArrayList<>();
        predavaci = new ArrayList<>();
        session = HibernateUtil.getSession();
        session.beginTransaction();
        kreirajSmjerove();
        kreirajPredavace();
        kreirajPolaznike();
        kreirajGrupe();
        session.getTransaction().commit();
    }

    private void kreirajSmjerove() {
        Smjer s;
        for (int i = 0; i < BROJ_SMJEROVA; i++) {
            s = new Smjer();
            s.setNaziv(faker.app().name());
            s.setCertificiran(faker.bool().bool());
            s.setCijena(new BigDecimal(faker.number().numberBetween(800, 1200)));
            s.setUpisnina(new BigDecimal(faker.number().numberBetween(70, 90)));
            s.setTrajanje(faker.number().numberBetween(90, 230));
            session.persist(s);
            smjerovi.add(s);
        }
    }

    private void kreirajPredavace() {
        Predavac p;
        for (int i = 0; i < BROJ_PREDAVACA; i++) {
            p = new Predavac();
            p.setOib(Alati.dovuciOib());
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setEmail(faker.internet().emailAddress());
            p.setIban(faker.business().creditCardNumber());
            session.persist(p);
            predavaci.add(p);
        }
    }
    
    private void kreirajPolaznike() {
        Polaznik p;
        for (int i = 0; i < BROJ_POLAZNIKA; i++) {
            p = new Polaznik();
            p.setOib(Alati.dovuciOib());
            p.setIme(faker.name().firstName());
            p.setPrezime(faker.name().lastName());
            p.setEmail(faker.internet().emailAddress());
            p.setBrojUgovora(faker.business().creditCardNumber());
            session.persist(p);
            polaznici.add(p);
        }
    }
    
    private void kreirajGrupe(){
        Grupa g;
        List<Polaznik> p;
        for(int i=0;i<BROJ_GRUPA;i++){
            g = new Grupa();
            g.setNaziv(faker.beer().name() + " " + (i+1));
            g.setDatumPocetka(faker.date().birthday(1, 10));
            g.setSmjer(smjerovi.get(sb(0,BROJ_SMJEROVA-1)));
            g.setPredavac(predavaci.get(sb(0,BROJ_PREDAVACA-1)));
            p = new ArrayList<>();
            
            for(int j=0;j<sb(10,20);j++){
                p.add(polaznici.get(sb(0,BROJ_POLAZNIKA-1)));
            }
            
            g.setPolaznici(p);
            
            session.persist(g);
            
            
        }
    }
    
    private int sb(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

}
