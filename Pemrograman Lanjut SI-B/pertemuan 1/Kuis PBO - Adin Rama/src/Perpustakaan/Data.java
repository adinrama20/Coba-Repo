package Perpustakaan;

public class Data {
    
    protected int id;
    protected String nama;

    public Data(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return "";
    }
}
