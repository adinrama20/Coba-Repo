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
public class Petugas extends Data {
    private int nip;
    private String password;
    private static int autoIncrement = 1;

    public Petugas(String nama, String password) {
        super(nama);
        this.password = password;
        this.nip = autoIncrement++;
    }

    public int getNip(){
        return nip;
    }

    public String getPassword(){
        return password;
    }

    @Override
    public String toString() {
        return String.format("|%10d|%10s|%10s|", nip,nama,password);
    }
}
