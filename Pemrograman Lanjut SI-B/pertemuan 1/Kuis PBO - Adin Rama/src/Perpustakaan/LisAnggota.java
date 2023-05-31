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
public class LisAnggota {
    /** 
     * Untuk menyimpan data anggota sebagai <b>pengganti basis data</b>.
     * Bersifat <b>static</b> karena dianggap sebagai sekumpulan data anggota
     * yang <b>dapat diakses oleh kelas manapun dalam sistem</b>.
     */
    private static List<Anggota> lisAnggota; 
    
    /**
     * Constructor untuk membuat beberapa contoh data anggota, 
     * sehingga dalam contoh ini {@link #lisAnggota} sudah berisi beberapa data anggota.
     */
    public LisAnggota() {
        lisAnggota = new ArrayList<>();
        lisAnggota.add(new Anggota("Anton"));
        lisAnggota.add(new Anggota("Budi"));
        lisAnggota.add(new Anggota("Catur"));
        lisAnggota.add(new Anggota("Dewi"));
    }
    
    /**
     * Karena atribut lisAnggota bersifat static, maka perlu dilakukan 
     * pengecekan apakah instance lisAnggota sudah terbentuk atau belum.
     * Jika belum terbentuk maka dilakukan instansiasi terlebih dahulu.
     */
    private static void cekNull() {
        if (lisAnggota == null)
            new LisAnggota();
    }
    
    /**
     * Menampilkan seluruh lis anggota yang sudah tersimpan.
     */
    public static void tampilLis() {
        cekNull();
        for (Anggota anggota : lisAnggota)
            System.out.println(anggota);
    }
    
    /**
     * Mengembalikan lis anggota.
     * 
     * @return lis anggota yang sudah tersimpan
     */
    public static List<Anggota> getLisAnggota() {
        cekNull();
        return lisAnggota;
    }
    
    /**
     * Menambahkan anggota baru berdasarkan nama.
     * 
     * <p> Untuk memastikan bahwa instance lisAnggota sudah terbentuk maka 
     * perlu dicek melalui method {@link #cekNull()}.
     * 
     * @param nama 
     *        nama anggota baru
     */
    public static void tambahAnggota(String nama) {
        cekNull();        
        tambahAnggota(new Anggota(nama));
    }
    
    /**
     * Menambahkan anggota baru berdasarkan object Anggota.
     * 
     * <p> Untuk memastikan bahwa instance lisAnggota sudah terbentuk maka 
     * perlu dicek melalui method {@link #cekNull()}.
     * 
     * <p> Ketika sukses menambahkan anggota, maka akan menampilkan pesan
     * melalui {@code PesanPopUp.tampil()}
     *  
     * @param anggota 
     *        object Anggota baru
     */
    public static void tambahAnggota(Anggota anggota) {
        cekNull();
        lisAnggota.add(anggota);
        PesanPopUp.tampil(anggota.toString() + " berhasil ditambahkan", JenisPesanPopUp.SUKSES);
    }
}
