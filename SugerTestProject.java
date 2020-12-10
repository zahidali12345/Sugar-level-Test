/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sugertestproject;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class SugerTestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
DateTimeFormatter timeDate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
 
         
    try{
         
      
              String fileName= "Notes.doc";
              PrintWriter notes= new PrintWriter(fileName);
              notes.println("========================================");
    
        Timer timSet = new Timer();
        timSet.schedule(new TimerTask() {
            

            @Override
            public void run() {
                 LocalDateTime getcurrenttime = LocalDateTime.now();  
                try {
                    Random randInteger=new Random();
                    int length =5;
                    for(int i=0;i<=length;i++){
                        int tst=randInteger.nextInt(5);
                        if( tst>=0 && tst<2){
                            System.out.println("Patient needs some sugar and eat some sweet");
                         
                        
                            notes.println("Patient needs some sugar and eat some sweet23\n Your Suger Level is: "+tst);
                            notes.println(timSet);
                            notes.println("\n################################\n");
                            
                           
                          notes.flush();
                            break;
                            
                        }
                        else if( tst>=3 &&  tst<=5){
                            System.out.println("Patient sugar level is very high inject insuline");
                         
                        
                            notes.println("Your Suger Level is High\n Your Suger Level is: "+ tst);
                             notes.println(timSet);
                            notes.println("\n################################\n");
                           
                                notes.flush();
                                break;

                     }
                        else if( tst==2){
                            System.out.println("Normal sugar Level");
                         
                        
                            notes.println("Your Suger Level is normal\n Your Suger Level is: "+ tst);
                             notes.println(timSet);
                            notes.println("\n################################\n");
                            
                             notes.flush();

                                break;

                            
                        }
                    }  
                    System.out.println("first time completed ");
                } catch (Exception ex) {
                    Logger.getLogger(SugerTestProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }  
       },
     new Date(),
        1800
        );  
    }  
       catch(Exception ex){System.out.println(ex);
           
           }  
}}

    
    

