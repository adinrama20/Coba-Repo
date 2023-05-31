package AplikasiPerpus;

public class Aplikasi {
    public static boolean runApps = true;
    private static String[] menuPilihan;

    public Aplikasi(){
        menuPilihan = new String[10];
        menuPilihan[0] = "   0. Halaman Login";
        menuPilihan[1] = "   1. Halaman Tampil Data";
        menuPilihan[2] = "   2. Halaman Cari Data";
        menuPilihan[3] = "   3. Halaman Tambah Data";
    }

    public static void clearConsole(){}

    public static void showMenu(){}
}
