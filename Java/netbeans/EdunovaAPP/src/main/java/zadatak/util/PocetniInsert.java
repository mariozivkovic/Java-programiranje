/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadatak.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import zadatak.model.Grupa;
import zadatak.model.Polaznik;
import zadatak.model.Predavac;
import zadatak.model.Smjer;


/**
 *
 * @author lovre
 */
public class PocetniInsert {
    
        private static final int BROJ_SMJEROVA = 15;
        private static final int BROJ_PREDAVACA = 7;
        private Faker faker;
        private List<Smjer> smjerovi;
        private List<Grupa> grupe;
        private List<Polaznik> polaznici;
        private List<Predavac> predavaci;
        private Session session;
              
    
     
      public PocetniInsert(){
          
          faker = new Faker();
          smjerovi = new ArrayList<>();
          grupe = new ArrayList<>();
          polaznici = new ArrayList<>();
          predavaci = new ArrayList<>();
          session = HibernateUtil.getSession();
          session.beginTransaction();
          kreirajSmjerove();
          kreirajPredavace();
          
          session.beginTransaction().commit();
          
      }

    private void kreirajSmjerove() {
        
        Smjer s;
        for(int i =0;i<BROJ_SMJEROVA;i++){
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
        for(int i =0;i<BROJ_PREDAVACA;i++){
            p = new Predavac();
           // p.setOib(Alati.dovuciOib());
           p.setIme(faker.name().firstName());
           p.setPrezime(faker.name().lastName());
           p.setEmail(faker.internet().emailAddress());
           p.setIban(faker.business().creditCardNumber());
           
           session.persist(p);
           predavaci.add(p);
        }
    }
        

}
