/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.utility;

/**
 *
 * @author Edunova
 */
public class GegerirajOperatere {
    
    public static void main(String[] args) {
        
        String naredba = "insert into operater(ime,prezime, korisnik,lozinka) values ";
        System.out.print(naredba);
        int i=0;
        for(i=0;i<99999;i++){
            System.out.print( "('Tomislav " + i + "','Jakopec','tjakopec" + i + "',md5('t')),");
            if(i%10000==0){
                i++;
                System.out.println("('Tomislav " + i + "','Jakopec','tjakopec" + i + "',md5('t'));");
                System.out.println(naredba);
            }
            
        }
        
        i++;
         System.out.println("('Tomislav " + i + "','Jakopec','tjakopec" + i + "',md5('t'));");
    }
    
}
