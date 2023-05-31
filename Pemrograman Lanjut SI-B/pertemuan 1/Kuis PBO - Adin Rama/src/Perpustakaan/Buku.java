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
public class Buku extends Data {
    private JenisKategoriBuku kategori;
    private static int autoIncrement = 1;

    public Buku(String judul, JenisKategoriBuku kategori) {
        super(judul);
        this.kategori = kategori;
        this.id = autoIncrement++;
    }

    public JenisKategoriBuku getKategori() {
        return kategori;
    }

    @Override
    public String toString() {
        return String.format("|%10d|%10s|%10s|", id,nama,kategori);
    }
    
}
