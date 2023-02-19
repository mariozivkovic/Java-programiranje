/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package zadatak;

import com.github.javafaker.Faker;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lovre
 */
public class Zivkovic01 {

    private String myDriver = "org.mariadb.jdbc.Driver";
    private String myUrl = "jdbc:mariadb://localhost/edunovajp27";
    private Connection conn;
    private Statement st;
    private Faker faker;

    public Zivkovic01() {
        faker = new Faker(new Locale.Builder().setLanguage("hr").
                setRegion("HR").build());
        spojiSeNaBazu();
     //   primjerSelect();
     long pocetak = System.currentTimeMillis();
     //   unesiSmjerBrze(10000);
         unesiOsobu(10000);
     long kraj = System.currentTimeMillis();
 
        System.out.println((kraj-pocetak)/(float)1000);
        odspojiSeSBaze();
        try {
            System.out.println(conn.getMetaData().getCatalogTerm());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void spojiSeNaBazu() {
        try {
            Class.forName(myDriver);
            conn = DriverManager.getConnection(myUrl, "root", "");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new Zivkovic01();

    }

    private void primjerSelect() {
        System.out.println("****** Podaci u tablici smjer");
        String query = "select * from smjer;";
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("naziv"));
            }
            rs.close();
            st.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void odspojiSeSBaze() {

        try {
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void unesiSmjer(int komada) {

        try {
            st = conn.createStatement();
            for (int i = 0; i < komada; i++) {
                st.executeUpdate("insert into smjer(naziv) values('Smjer iz jave " + i + "')");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void unesiSmjerBrze(int komada) {

        try {
            st = conn.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("insert into smjer(naziv) values ");
            for (int i = 0; i < komada; i++) {
                sb.append("('Smjer iz jave ");
                sb.append( faker.book().title().replace("'", "\\'"));
                sb.append("'),");
            }
                sb.deleteCharAt(sb.length() - 1);

                st.executeUpdate(sb.toString());
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void unesiOsobu(int komada) {
         
        try {
            st = conn.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("insert into osoba(ime,prezime,email) values ");
            for (int i = 0; i < komada; i++) {
                sb.append("('");
                sb.append(faker.name().firstName());
                 sb.append("','");
                sb.append(faker.name().lastName());
                 sb.append("','");
                sb.append(faker.internet().emailAddress());
                sb.append("'),");
            }
           
           sb.deleteCharAt(sb.length()-1);
            
            st.executeUpdate(sb.toString());

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    }

   

