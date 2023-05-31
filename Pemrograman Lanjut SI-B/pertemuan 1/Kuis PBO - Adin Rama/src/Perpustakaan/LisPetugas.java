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
public class LisPetugas {
    private static List<Petugas> lisPetugas;
    
    public LisPetugas() {
        // lengkapi
        lisPetugas = new ArrayList<>();
        lisPetugas.add(new Petugas("Adin", "adin$345"));
        lisPetugas.add(new Petugas("Rama", "rama$345"));
    }
    
    private static void cekNull() {
        // lengkapi
        if (lisPetugas == null)
            new LisPetugas();
    }
    
    public static void tampilLis() {
        // lengkapi
        cekNull();
        for (Petugas petugas : lisPetugas)
            System.out.println(petugas);
    }

    public static List<Petugas> getLisPetugas() {
        // lengkapi
        cekNull();
        return lisPetugas;
    }

    public static void tambahPetugas(String nama, String password) {        
        // lengkapi
        cekNull();        
        tambahPetugas(new Petugas(nama, password));
    }
    
    public static void tambahPetugas(Petugas petugas) {
        // lengkapi
        cekNull();
        lisPetugas.add(petugas);
        PesanPopUp.tampil(petugas.toString() + " berhasil ditambahkan", JenisPesanPopUp.SUKSES);
    }
}
