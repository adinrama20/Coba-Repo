/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

/**
 *
 * @author Tri Afirianto
 */
public class Anggota extends Data {
    private static int autoIncrement = 1;

    /** 
     * Untuk mendapatkan id anggota secara auto increment 
     * sebagai pengganti belum adanya basis data.
     */

    /**
     * Membuat anggota baru dengan nilai id otomatis
     * berdasarkan atribut {@link #autoIncrement}.
     * 
     * @param nama 
     *        nama anggota baru
     */
    public Anggota(String nama) {
        super(nama);
        this.id = autoIncrement++;
    }

    /**
     * Mengambil id anggota.
     * 
     * @return id anggota dari object ini
     */

    /**
     * Mengambil nama anggota.
     * 
     * @return nama anggota dari object ini
     */

    /**
     * Menampilkan info yang berisi id dan nama anggota
     * 
     * @return info dari object ini
     */
    @Override
    public String toString() {
        return String.format("|%10d|%10s|", id,nama);
    }    
}
