/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tri Afirianto
 */
public class LisBuku {
    private static List<Buku> lisBuku;

    public LisBuku() {
        lisBuku = new ArrayList<>();
        lisBuku.add(new Buku("Buku Fisika", JenisKategoriBuku.UMUM));
        lisBuku.add(new Buku("Buku Indo", JenisKategoriBuku.BAHASA));
    }
    
    private static void cekNull() {        
        // lengkapi
        if (lisBuku == null)
            new LisBuku();
    }
    
    public static void tampilLis() {
        // lengkapi
        cekNull();
        for (Buku buku : lisBuku)
            System.out.println(buku);
    }

    public static List<Buku> getLisBuku() {
        // lengkapi
        cekNull();
        return lisBuku;
    }

    public static void tambahBuku(String nama, JenisKategoriBuku kategori) {        
        // lengkapi
        cekNull();
        tambahBuku(new Buku(nama, kategori));
    }
    
    public static void tambahBuku(Buku buku) {
        // lengkapi
        cekNull();
        lisBuku.add(buku);
        PesanPopUp.tampil(buku.toString() + " berhasil ditambahkan", JenisPesanPopUp.SUKSES);
    }
}
