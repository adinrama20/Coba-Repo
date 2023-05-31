/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import AplikasiPerpus.*;
import Perpustakaan.*;
import java.util.*;

/**
 *
 * @author Tri Afirianto
 */
public class TransAwal {    

    public void tampilHalaman(){
        System.out.println("----------------------------------");
        System.out.println("    0. Login");
        System.out.println("    1. Halaman Awal");
        System.out.println("    2. Halaman Penambahan Data");
        System.out.println("    3. Halaman Ubah Profil");
        System.out.println("    4. Halaman Pencarian Data");
        System.out.println("    5. Halaman Layanan Perpustakaan");
        System.out.println("  999. Logout");
        System.out.println("99999. Keluar Aplikasi");
        System.out.println("----------------------------------");
    }
    
    /** Menampilkan lis seluruh anggota. */
    public void tampilAnggota() {
        System.out.println("Lis anggota : ");  
        System.out.printf("|%10s|%10s|\n", "ID","Nama");      
        LisAnggota.tampilLis();
        System.out.println("----------------------------------");
        Scanner scn = new Scanner(System.in);
        System.out.println("Tekan tombol ENTER...");            
        scn.nextLine();
    }     
    
    /** Menampilkan lis seluruh buku. */
    public void tampilBuku() {        
        // lengkapi
        System.out.println("Lis buku : "); 
        System.out.printf("|%10s|%10s|%10s|\n", "ID","Judul","Kategori");
        LisBuku.tampilLis();
        System.out.println("----------------------------------");
        Scanner scn = new Scanner(System.in);
        System.out.println("Tekan tombol ENTER...");            
        scn.nextLine();
    } 
    
    /** Menampilkan lis seluruh petugas. */
    public void tampilPetugas() {
        // lengkapi
        System.out.println("Lis petugas : "); 
        System.out.printf("|%10s|%10s|%10s|\n", "NIP","Nama","Password");
        LisPetugas.tampilLis();
        System.out.println("----------------------------------");
        Scanner scn = new Scanner(System.in);
        System.out.println("Tekan tombol ENTER...");            
        scn.nextLine();
    } 
    
}
