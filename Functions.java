/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Functions implements  IService{
    ArrayList<Service> bdS= new ArrayList<>();  
    ArrayList<Employe> bdE = new ArrayList<>();


    @Override
    public void addService(Service s) {
                bdS.add(s);

    }

    @Override
    public void listService(Service s) {
    }

    @Override
    public void addEmploye(Employe e) {
        bdE.add(e);
    }
    
}
