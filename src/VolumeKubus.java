import java.util.Scanner;

/**
 * Kelas VolumeKubus digunakan untuk menghitung volume kubus berdasarkan panjang sisi yang diberikan.
 */
public class VolumeKubus {
    /**
     * Metode utama yang akan dijalankan saat program dimulai.
     * Metode ini meminta pengguna memasukkan panjang sisi kubus dan kemudian menghitung dan mencetak volume kubus.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        // Menghitung volume kubus
        double volume = sisi * sisi * sisi;

        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volume);

        input.close();
    }
}
