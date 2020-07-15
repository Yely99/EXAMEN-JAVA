/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examjava;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ExamJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
             ArrayList<Service> services= new ArrayList<>();
             ArrayList<Employe> employes= new ArrayList<>();
             Service service = new Service();
             String nomservice;
             int choice ;
        // TODO code application logic here

  do{
      
        System.out.println("1-Ajout Service \n"
                + "2-lister Service\n"
                + "3-Affecter un Employe à service \n"
                + "4-Lister les employes d'un service\n"   
                + "4-Afficher les qui doivent partir à la retraite d'un service\n"  

        + "5-Quitter\n");
             choice = sc.nextInt();


       switch (choice) {
  case 1:
    System.out.println("Veuillez entrer le nom du service");
    sc.nextLine();
     nomservice = sc.nextLine();
    service.setLibelle(nomservice);
  services.add(service);

    break;
  case 2:
    System.out.println("Welcome "); 
    System.out.println("Lister Service");
        for(Service elem: services)
       {
                System.out.println (elem);
       }
    break;
  case 3:
    System.out.println("Veuillez entrer le nom de l'employe");
    sc.nextLine();
    String nomComplet = sc.nextLine();
    System.out.println("Veuillez entrer l'annee d'embauche ");
        int dateE = sc.nextInt();
    Employe employe = new Employe(nomComplet);
    employe.setDateEmbauche(dateE);
     System.out.println("Veuillez entrer le nom du service");
    sc.nextLine();
     nomservice = sc.nextLine();
    service.setLibelle(nomservice);
    service.addEmploye(employe);
  services.add(service);
        
    break;
     case 4:
    System.out.println("Au revoir");
    break;
   case 5:
    System.out.println("Au revoir");
    break;
    case 6:
    System.out.println("Au revoir");
    break;
  default:
     System.out.println("Choix impossible");
     break;

}

  }while(choice!=5);
 
        
    }
    
}
