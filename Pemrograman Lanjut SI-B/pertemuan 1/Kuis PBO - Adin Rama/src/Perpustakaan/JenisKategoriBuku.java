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
public enum JenisKategoriBuku {
    UMUM("UMUM"),
    FILSAFAT_DAN_TEKNOLOGI("FILSAFAT_DAN_TEKNOLOGI"),
    AGAMA("AGAMA"),
    SOSIAL("SOSIAL"),
    BAHASA("BAHASA"),
    SAINS_DAN_MATEMATIKA("SAINS_DAN_MATEMATIKA"),
    TEKNOLOGI("TEKNOLOGI"),
    SENI_DAN_REKREASI("SENI_DAN_REKREASI"),
    LITERATUR_DAN_SASTRA("LITERATUR_DAN_SASTRA"),
    SEJARAH_DAN_GEOGRAFI("SEJARAH_DAN_GEOGRAFI"),
    FIKSI("FIKSI");

    private String jenis;

    JenisKategoriBuku(String jenis){
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }
}
