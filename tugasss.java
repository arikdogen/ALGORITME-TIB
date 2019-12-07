/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;
public class tugasss {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean ulang= true;
        while (ulang){
            
            System.out.println("masukan nama kota:");
            String masukan = input.nextLine();
            switch ("masukan"){
                case ("padang"):
                    System.out.println("kode pos adalah: 25000");
                    break;
                      case ("bandung"):
                    System.out.println("kode pos adalah:40100");
                    break;
                      case ("solo"):
                    System.out.println("kode pos adalah:51000");
                    break;
                      case ("denpasar"):
                    System.out.println("kode pos adalah:72000");
                    break;
                      case ("palu"):
                    System.out.println("kode pos adalah:92300");
                    break;
                      case (""):
                          ulang=true;
                        
            }
                    
                    
            
             
            }
        }
    }
    

