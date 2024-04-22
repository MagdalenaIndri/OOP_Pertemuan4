/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import java.util.Scanner;

/**
 *
 * @author Indri
 * tgl:2024-04-22
 */
public class ArrayDim {
    int jdta = 5;
    String[] dteman = new String[5];
    Scanner dtIN = new Scanner(System.in);
    
   public void storedata(){
        System.out.println("Isikan Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        
        //perualangan menggunakan for atau while
        int num=0;
        for (int i=0; i<jdta;i++) {
            num++;
        
        System.out.println("Data ke-"+num+": ");
        dteman[i] = dtIN.nextLine();
        
        }
        
/**    
        System.out.println("Data ke 2 :");
        dteman[0] = dtIN.nextLine();
          
        System.out.println("Data ke 3:");
        dteman[0] = dtIN.nextLine();
       
        System.out.println("Data ke 4:");
        dteman[0] = dtIN.nextLine();
        
        System.out.println("Data ke 5:");
        dteman[0] = dtIN.nextLine();
* */
        
        
        dteman[0] = ("Adit");
        dteman[1] = ("Asop");
        dteman[2] = ("Lisra");
        dteman[3] = ("Kinan");
        dteman[4] = ("Alsdin");
   }
    
    public void viewdata(){
        System.out.println("Daftar Teman");
         System.out.println("~~~~~~~~~~~~");
         int no = 0;
         for(int i=0; i<jdta; i++) {
             no++;
             System.out.println(no+". "+dteman[i]);
             
         }
    
    }
    public void editdata(){
        System.out.println("Ubah Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Index Daata Yang Di Ubah");
        int idx = dtIN.nextInt();
        System.out.println("Data Yang Di Ubah: "+dteman[idx]);
        System.out.print("Diubah Menjadi");
        String newdt = dtIN.nextLine();
        dteman[idx] = newdt;
        System.out.println("Data index ke-"+idx+"telah di Ubah");
        
    }
    public void destorydata() {
        System.out.println("Hapus Data Teman");
        System.out.println("~~~~~~~~~~~~~~~");
        System.out.println("Index Daata Yang Di Hapus");
        String id = dtIN.nextLine();
        int idx = Integer.parseInt(id);
        dteman[idx]="";
        System.out.println("Data index ke-"+idx+"telah di Hapus");
        
    
    }
}
