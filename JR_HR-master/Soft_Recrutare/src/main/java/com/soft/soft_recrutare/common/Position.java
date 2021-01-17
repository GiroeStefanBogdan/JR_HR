/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soft.soft_recrutare.common;

/**
 *
 * @author Admin
 */
public enum Position {
    
   
         ADMIN("Admin"),  //valori ca stringuri care apar atat in FE cat si in baza de date
         VIEWER("Viewer"),
         DIRECTOR_GENERAL("Director General"),
         DIRECTOR_DE_DEPARTAMENT("Director de Departament"),
         HR("HR"),
         RECRUITER("Recruiter"),
         DEFAULT("Candidat");  //l-am facut candidat ca aceasta pozitie sa nu fie nula
         
         private String position;
         
     Position(String position)
    {
        this.position=position;
    }
    
     
     public String getPosition(){
         return position;
     }
    
    
}
