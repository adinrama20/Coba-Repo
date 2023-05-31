/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tri Afirianto
 */

public class PesanPopUp {    
    public static void tampil(String pesan, JenisPesanPopUp jenisPesan) {
        System.out.println(jenisPesan.toString());
        System.out.println(pesan);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(PesanPopUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
