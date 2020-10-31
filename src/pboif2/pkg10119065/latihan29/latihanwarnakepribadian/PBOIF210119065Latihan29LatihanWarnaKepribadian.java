package pboif2.pkg10119065.latihan29.latihanwarnakepribadian;

import java.util.Scanner;


/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program warna kepribadian
 */
public class PBOIF210119065Latihan29LatihanWarnaKepribadian {
    public static final String BLACK = "\u001b[30m";
    public static final String RED = "\u001b[31m";
    public static final String GREEN = "\u001b[32m";
    public static final String YELLOW = "\u001b[33m";
    public static final String BLUE = "\u001b[34m";
    public static final String MAGENTA = "\u001b[35m";
    public static final String CYAN = "\u001b[36m";
    
    public static void wMerah(String nama){
        System.out.println(RED + "MERAH");
        System.out.println("1. Periang,");
        System.out.println("2. Pemberani,");
        System.out.println("3. Berani memiliki risiko dalam setiap langkah,");
        System.out.println("4. Menyukai tantangan,");
        System.out.println("5. Kurang sabar,");
        System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol,");
        System.out.println("7. Memiliki energi kehangatan dan cinta.");
    }
    public static void wBiru(String nama){
        System.out.println(BLUE + "BIRU");
        System.out.println("1. Menyenangkan,");
        System.out.println("2. Bijaksana,");
        System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
        System.out.println("4. Dinamis,");
        System.out.println("5. Senang Berbagi,");
        System.out.println("6. Bersahabat,");
        System.out.println("7. Tidak terlalu suka menjadi sorot banyak orang,");
        System.out.println("7. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
    }
    public static void wHijau(String nama){
        System.out.println(GREEN + "HIJAU");
        System.out.println("1. Romantis,");
        System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
        System.out.println("3. Teguh pada prinsip,");
        System.out.println("4. Menginginkan kesempurnaan,");
        System.out.println("5. Mudah cemburu,");
        System.out.println("6. Mudah merasa iri,");
        System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
    }
    public static void wKuning(String nama){
        System.out.println(YELLOW + "KUNING");
        System.out.println("1. Optimis,");
        System.out.println("2. Suka bergaul,");
        System.out.println("3. Periang,");
        System.out.println("4. Senang menolong,");
        System.out.println("5. Lincah dan aktif,");
        System.out.println("6. Tidak suka meremehkan kekurangan orang lain,");
        System.out.println("7. Loyal,");
        System.out.println("8. Hangat,");
        System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak sekali,");
        System.out.println("10. Cenderung penakut.");
    }
    public static void wMagenta(String nama){
        System.out.println(MAGENTA + "UNGU");
        System.out.println("1. Optimis,");
        System.out.println("2. Tidak pernah ragu,");
        System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
        System.out.println("4. Memiliki ambisi yang besar,");
        System.out.println("5. Memiliki empati yang besar,");
        System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
        System.out.println("7. Terkadang bersikap keras dan angkuh.");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pilihanWarna, nama;
        
        System.out.println(RED + "YUK "+ GREEN + "CEK "+YELLOW + "KEPRIBADIAN " + CYAN + "DARI " + MAGENTA + "WARNA "+ BLUE + "FAVORITMU \n");
        System.out.println(RED + "MERAH");
        System.out.println(GREEN + "HIJAU");
        System.out.println(YELLOW + "KUNING");
        System.out.println(BLUE + "BIRU");
        System.out.println(MAGENTA + "UNGU");
        
        System.out.print(BLACK+"\nPilih Warna Favoritmu : ");
        pilihanWarna = sc.next();
        pilihanWarna = pilihanWarna.toUpperCase();
        System.out.print("Nama : ");
        nama = sc.next();
        
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama+"===");
        switch(pilihanWarna) {
            case "MERAH": 
                System.out.print("Warna Favoritmu adalah ");
                wMerah(nama);
              break;
            case "BIRU":
                System.out.print("Warna Favoritmu adalah ");
                wBiru(nama);
              break;
            case "HIJAU":
                System.out.print("Warna Favoritmu adalah ");
                wHijau(nama);
              break;
            case "KUNING":
                System.out.print("Warna Favoritmu adalah ");
                wKuning(nama);
              break;
            case "UNGU":
                System.out.print("Warna Favoritmu adalah ");
                wMagenta(nama);
              break;
            default:
              System.out.println("Oops.. Belum terindentifikasi");
          }
        
        
    }
    
}
