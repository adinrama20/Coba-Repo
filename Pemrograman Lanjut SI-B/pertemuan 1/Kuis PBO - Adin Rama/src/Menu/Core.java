/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Perpustakaan.*;

/**
 *
 * @author Tri Afirianto
 */
public class Core {
    public static void main(String[] args) {
        new LisAnggota();
        new LisBuku();
        new LisPetugas();

        HalLogin login = new HalLogin();
        login.tampil();
    }
}
