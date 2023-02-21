/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zadatak.util;

import com.github.javafaker.Faker;
import java.math.BigDecimal;
import org.hibernate.Session;
import zadatak.model.Osoba;

/**
 *
 * @author lovre
 */
public class PocetniInsert {
    
      public static void izvedi(){
        Session session = HibernateUtil.getSession();
        Faker faker = new Faker();
        
          Osoba o;
        session.beginTransaction();
        for(int i=0;i<100;i++){
            o = new Osoba();
            o.setIme(faker.name().firstName());
            o.setPrezime(faker.name().lastName());
            o.setPrimanja(new BigDecimal(faker.number().randomNumber()));
            o.setDatumRodenja(faker.date().birthday());
            o.setAktivan(faker.bool().bool());
            
            session.persist(o);
            
        }
        session.getTransaction().commit();
        
}
}
