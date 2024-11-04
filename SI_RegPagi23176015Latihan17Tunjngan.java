/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg23176015.latihan17.tunjngan;

/**
 *
 * @author Asus
 * NAMA     : Natasya Adillah
 * KELAS    : PBO 06
 * NIM      : 23176015
 * DESKRIPSI PROGRAM : Program ini berisi program yang digunakan untuk  menghitung 
 * tunjangan berdasarkan status perkawinan karyawan.
 */import java.util.Scanner;

public class SI_RegPagi23176015Latihan17Tunjngan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("=====Program Tunjangan=====");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = scanner.next();

        double tunjangan = 0;

        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = gajiPokok * 0.35;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("========Hasil Perhitungan Gaji Anda=========");
        System.out.println("Gaji Pokok   : Rp " + gajiPokok);
        System.out.println("Tunjangan    : Rp " + tunjangan);
        System.out.println("Total Gaji  : Rp " + totalGaji);
       

        scanner.close();
    }
}
    