/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zivkovic.util;

import com.github.javafaker.Faker;
import java.time.Instant;
import java.util.Date;
import org.hibernate.Session;

import zivkovic.model.Zaposlenik;

/**
 *
 * @author lovre
 */
public class PocetniInsert {
    
    public static void izvedi(){
        Session session =HibernateUtil.getSession();
         Faker faker = new Faker();
        Zaposlenik z;
        session.beginTransaction();
        for(int i=0;i<100;i++){
        z = new Zaposlenik();
            z.setIme(faker.name().firstName());
            z.setPrezime(faker.name().lastName());
            z.setOib(faker.idNumber().invalid());
            z.setEmail(faker.internet().emailAddress());
            z.setRadnoMjesto(faker.job().position());
            
            session.persist(z);
        }
            session.getTransaction().commit();
            
      
             }
            
            
    }
    

