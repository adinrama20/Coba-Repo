/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import AplikasiPerpus.*;
import Perpustakaan.*;
import java.util.Scanner;

/**
 *
 * @author Tri Afirianto
 */
public class TransLogin {
    Scanner scn = new Scanner(System.in);
    private String nama, password;
    
    public boolean prosesLogin() {
        //Scanner scn = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        nama = scn.next();
        System.out.println("Masukkan password : ");
        password = scn.next();

        for (Petugas petugas : LisPetugas.getLisPetugas()) {
            if (petugas.getNama().equals(nama) && petugas.getPassword().equals(password)) {
                PesanPopUp.tampil("Selamat Anda berhasil Login", JenisPesanPopUp.SUKSES); // lengkapi: ketika nama petugas sama dengan nama yang dimasukkan
                return true;        
            }
        }
        PesanPopUp.tampil("Maaf, nama petugas tidak ditemukan", JenisPesanPopUp.KESALAHAN);
        return false;
    }

    public boolean cariDataPetugas(){
        //Scanner scn = new Scanner(System.in);
        System.out.print("Masukkan nama petugas yang dicari : ");
        nama = scn.next();
        System.out.print("Masukkan password sesuai dengan nama petugas yang telah diinputkan : ");
        password = scn.next();

        for (Petugas petugas : LisPetugas.getLisPetugas()) {
            if (petugas.getNama().equals(nama) && petugas.getPassword().equals(password)) {
                PesanPopUp.tampil("Data petugas atas nama " + nama + " ditemukan", JenisPesanPopUp.SUKSES); // lengkapi: ketika nama petugas sama dengan nama yang dimasukkan
                return true;
            }
        }
        PesanPopUp.tampil("Maaf, data petugas atas nama " + nama + " tidak ditemukan", JenisPesanPopUp.KESALAHAN);
        return false;
    }

    public boolean cariDataBuku(){
        System.out.print("Masukkan nama buku yang dicari : ");
        scn.nextLine();
        nama = scn.nextLine();
        System.out.print("Masukkan jenis kategori buku : ");
        /*kategori = scn.next();

        for (Buku buku : LisBuku.getLisBuku()){
            if (buku.getJudul().equals(nama) && buku.getKategori().equals(kategori)){
                PesanPopUp.tampil("Data buku dengan judul " + nama + " ditemukan", JenisPesanPopUp.SUKSES); // lengkapi: ketika nama petugas sama dengan nama yang dimasukkan
                return true;
            }
        }
        PesanPopUp.tampil("Maaf, data buku dengan judul " + nama + " tidak ditemukan", JenisPesanPopUp.KESALAHAN);*/
        return false;
    }

    public boolean cariDataAnggota(){
        System.out.print("Masukkan nama anggota yang dicari : ");
        scn.nextLine();
        nama = scn.nextLine();

        for (Anggota anggota : LisAnggota.getLisAnggota()){
            if (anggota.getNama().equals(nama)){
                PesanPopUp.tampil("Data anggota atas nama " + nama + " ditemukan", JenisPesanPopUp.SUKSES); // lengkapi: ketika nama petugas sama dengan nama yang dimasukkan
                return true;
            }
        }
        PesanPopUp.tampil("Maaf, data anggota atas nama " + nama + " tidak ditemukan", JenisPesanPopUp.KESALAHAN);
        return false;
    }
}
