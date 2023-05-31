/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/** Segala halaman tidak boleh mengakses package {@code Perpustakaan} */
import AplikasiPerpus.*;
import Perpustakaan.*;
import java.util.Scanner;
/**
 *
 * @author Tri Afirianto
 */
public class HalAwal {        
    /** Untuk menampilkan judul halaman ini. */
    private String judulHalaman;
    /** Untuk menu-menu yang ada pada halaman ini. */
    private String[] menuPilihan;
    //private JenisKategoriBuku[] jenisKategori;
    /** Untuk memproses segala transaksi yang ada di halaman ini. */
    // private TransAwal transAwal;
    // private HalLogin halLogin;
    
    /**
     * Mengisi nilai judul halaman beserta menu-menu yang ada di dalamnya.
     * 
     * <p> Nomor urut menu disesuaikan dengan nomor urut halaman.
     */ 
    HalAwal() {
        judulHalaman = ".#MENU HOME#.";
        menuPilihan = new String[10];
        menuPilihan[0] = "   11. Tampil Lis Petugas;";
        menuPilihan[1] = "   12. Tampil Lis Buku;";
        menuPilihan[2] = "   13. Tampil Lis Anggota;";
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
        String nama;
        int pilihanScanner;
        int pilih = 0;
        boolean temuData = false;
        
        while (Aplikasi.runApps) {
            TransAwal transAwal = new TransAwal();
            TransLogin transLogin = new TransLogin();
            HalLogin halLogin = new HalLogin();

            Aplikasi.clearConsole();
            tampilJudul();
            Aplikasi.showMenu();
            transAwal.tampilHalaman();
            tampilMenuPilihan();
            System.out.println("#########################################");
            Scanner scn = new Scanner(System.in);
            System.out.print("Pilih menu: ");
            pilihanScanner = scn.nextInt();

            switch (pilihanScanner) {
                case 0  :
                    halLogin.tampil();
                    break;
                case 1  :
                    transAwal.tampilPetugas();
                    transAwal.tampilBuku();
                    transAwal.tampilAnggota();
                    break;
                case 2  :
                    /*String passwd, jenis;

                    System.out.println("Pilih bagian yang ingin ditambahkan datanya :");
                    System.out.println("1. Petugas");
                    System.out.println("2. Buku");
                    System.out.println("3. Anggota");
                    System.out.print("Masukkan pilihan Anda = ");
                    pilih = scn.nextInt();

                    switch (pilih){
                        case 3 :
                            System.out.print("Masukkan nama anggota : ");
                            scn.nextLine();
                            nama = scn.nextLine();
                            LisAnggota.tambahAnggota(nama);
                            break;
                        case 1 :
                            System.out.print("Masukkan nama petugas : ");
                            scn.nextLine();
                            nama = scn.nextLine();
                            System.out.print("Masukkan password untuk petugas baru : ");
                            passwd = scn.nextLine();
                            LisPetugas.tambahPetugas(nama, passwd);
                            break;
                        case 2 :
                            System.out.print("Masukkan nama buku : ");
                            scn.nextLine();
                            nama = scn.nextLine();

                            jenisKategori = JenisKategoriBuku.values();
                            System.out.println("Jenis Kategori Buku :");
                            for (JenisKategoriBuku jenisKB : jenisKategori){
                                if (jenisKB != null)
                                    System.out.println(jenisKB.getJenis());
                            }

                            System.out.print("Masukkan jenis kategori buku : ");
                            jenis = scn.nextLine();
                            LisBuku.tambahBuku(nama, JenisKategoriBuku.valueOf(jenis));
                            break;
                    }*/
                case 3  :
                    break;
                case 4  :
                    /*System.out.println("Data apa yang ingin dicari ?");
                    System.out.println("1. Data Petugas \n2. Data Buku \n3. Data Anggota");
                    System.out.print("Masukkan pilihan Anda = ");
                    pilih = scn.nextInt();

                    switch (pilih){
                        case 1 :
                            transLogin.cariDataPetugas();
                            break;
                        case 2 :
                            transLogin.cariDataBuku();
                            break;
                        case 3 :
                            transLogin.cariDataAnggota();
                            break;
                    }*/
                case 5  :   
                    break;
                case 999  :   
                    halLogin.tampil();
                    break;
                case 99999:   
                    Aplikasi.runApps = false;
                    break;
            }
            
            switch (pilihanScanner) {
                case 13 :
                    // lengkapi dengan mengakses method tampilAnggota pada class TransAwal
                    transAwal.tampilAnggota();
                    break;
                case 12 :
                    // lengkapi dengan mengakses method tampilBuku pada class TransAwal
                    transAwal.tampilBuku();
                    break;
                case 11 :
                    // lengkapi dengan mengakses method tampilPetugas pada class TransAwal
                    transAwal.tampilPetugas();
                    break;
            }
        }
    }
    
    /** Menampilkan judul halaman. */
    // lengkapi
    private void tampilJudul(){
        System.out.println(judulHalaman);
    }
    
    /** Menampilkan seluruh menu yang ada pada halaman ini. */
    // lengkapi
    private void tampilMenuPilihan(){
        for (String menu : menuPilihan)
            if(menu != null)
                System.out.println(menu);
    }
    
}
