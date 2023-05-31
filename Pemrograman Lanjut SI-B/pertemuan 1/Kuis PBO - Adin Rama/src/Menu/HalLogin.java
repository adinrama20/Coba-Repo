/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/** Segala halaman tidak boleh mengakses package {@code Perpustakaan} */
import AplikasiPerpus.*;
import java.util.Scanner;
/**
 *
 * @author Tri Afirianto
 */
public class HalLogin {        
    /** Untuk menampilkan judul halaman ini. */
    private String judulHalaman;
    /** Untuk menu-menu yang ada pada halaman ini. */
    private String[] menuPilihan;
    /** Untuk memproses segala transaksi yang ada di halaman ini. */
    private TransLogin transLogin;
    
    /**
     * Mengisi nilai judul halaman beserta menu-menu yang ada di dalamnya.
     * 
     * <p> Nomor urut menu disesuaikan dengan nomor urut halaman.
     */ 
    HalLogin() {
        judulHalaman = ".#MENU LOGIN#.";
        menuPilihan = new String[10];
        menuPilihan[0] = "    0. Login;";
    }
    
    /**
     * Mengisi halaman awal dan menampilkan judul halaman beserta 
     * menu-menu yang ada di dalamnya.
     * 
     * <p> Ketika memilih halaman lain, maka akan diarahkan ke object
     * halaman tersebut. Ketika memilih 99999, maka akan keluar dari
     * sistem (seperti halnya ketika menutup peramban).
     * 
     * <p> Ketika memilih menu yang ada di halaman ini, 
     * karena hanya untuk menampilkan informasi saja maka tidak perlu
     * membuat object baru namun cukup menampilkan data tersebut.
     * Pilihan nomor menu disesuaikan dengan nomor menu yang sudah
     * ditentukan di constructor.
     */
    public void tampil() {        
        int pilihanScanner;
        while (Aplikasi.runApps) {
            Aplikasi.clearConsole();
            tampilJudul();
            System.out.println("----------------------------");
            System.out.println("99999. Keluar Aplikasi;");
            System.out.println("----------------------------");
            tampilMenuPilihan();
            System.out.println("#########################################");
            Scanner scn = new Scanner(System.in);
            System.out.print("Pilih menu: ");
            pilihanScanner = scn.nextInt();
            switch (pilihanScanner) {
                case 99999:   
                    Aplikasi.runApps = false;
                    break;
            }           
            
            switch (pilihanScanner) {
                case 0 :
                    if (transLogin == null)
                        transLogin = new TransLogin();
                    if (transLogin.prosesLogin()) {
                        HalAwal halAwal = new HalAwal(); // lengkapi dengan instansiasi objek
                        halAwal.tampil();
                    }
                    
                    break;
            }
        }
    }
    
    /** Menampilkan judul halaman. */
    private void tampilJudul() {
        System.out.println(judulHalaman);
    }
    
    /** Menampilkan seluruh menu yang ada pada halaman ini. */
    private void tampilMenuPilihan() {
        for (String menu : menuPilihan) 
            if (menu != null)
                System.out.println(menu);
    }
    
}
