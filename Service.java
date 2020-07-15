/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author hp
 */
public class Service {
    private static int id=0;
    private String libelle;
    private ArrayList<Employe> employe= new ArrayList<>();

    public ArrayList<Employe> getEmploye() {
        return employe;
    }

    public void addEmploye(Employe e){
    employe.add(e);
    }


    public Service() {
        id=++id;
        
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Service{" + "id=" + id + ", libelle=" + libelle + '}';
    }


 
    
    
    
}
