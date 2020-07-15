/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava;

import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author hp
 */
public class Employe {
    private static int id;
    private String nomComplet;
    private int dateEmbauche;

    public Employe(String nomComplet) {
        this.nomComplet = nomComplet;
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
     * @return the nomComplet
     */
    public String getNomComplet() {
        return nomComplet;
    }

    /**
     * @param nomComplet the nomComplet to set
     */
    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
    public boolean isRetraite(){
        int anciennete=this.anciennete();
        if(anciennete>65){
        return true;
        }
       return false;
    }  
    public int anciennete(){
        int year = Calendar.getInstance().get(Calendar.YEAR);
         int duree =this.dateEmbauche -  year;
         return duree;
    }


    @Override
    public String toString() {
        return "Employe{" + "id=" + id + ", nomComplet=" + nomComplet + '}';
    }

    public int getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(int dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    
}
