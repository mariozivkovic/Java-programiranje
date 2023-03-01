/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author lovre
 */
public class ObradaSmjer extends Obrada<Smjer>{

    @Override
    public List<Smjer> read() {
        return session.createQuery("from Smjer", Smjer.class).list();
               
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        
    }
    
}
