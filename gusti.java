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
public class NewClass {
    public static void main(String[] args) {
     int luas,kelilin,diaogonal, keluar, p,l;
     String menu;
     
     Scanner scan=new Scanner (System.in);
        System.out.println("1.menhitung luas");
        System.out.println("2.menhitung keliling");
        System.out.println("3.menhitung diaogonal");
        System.out.println("4.keluar program");
        System.out.println("5.masukan nomber menu");
        System.out.println("6.masukan angka 1-4");
        
        System.out.println("masukan luas");
        p= Integer.parseInt(scan.nextLine());
        System.out.println("masukan keliling");
        l= Integer.parseInt(scan.nextLine());
        System.out.println("masukan menu");
       menu= scan.nextLine();
       
       switch (menu){
           case "1":
               luas=l*p;
               System.out.println("luas adalah"+luas);
               break;
                case "2":
               kelilin=2*p+2*l;
               System.out.println("keliling adalah"+kelilin);
               break;
                case "3":
               diaogonal=(int)(Math.pow (p,2)+Math.pow(l,2));
               System.out.println("dioagonal adalah"+diaogonal);
               break;
                case "4":
               System.exit(0);
               break;
       }
    }
    
}
