/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import collection.GajiKaryawan;
import entity.Karyawan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import service.KaryawanDao;
import service.KaryawanDaoImp;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
    KaryawanDao dao = new KaryawanDaoImp() {
        @Override
        public Object getALLKaryawan() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void getkaryawan(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object getallKaryawan() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public Object getAllkaryawan() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };

    // Display all Karyawan before update
    System.out.println("Data sebelum diubah:");
    for (Karyawan karyawan : dao.getAllKaryawan()) {
        System.out.println("id = " + karyawan.getId() + "\n" +
                " Name: " + karyawan.getName());
    }

    // Update the first Karyawan's name to "jajang"
    List<Karyawan> allKaryawan = dao.getAllKaryawan();
    if (!allKaryawan.isEmpty()) {
        Karyawan karyawan = allKaryawan.get(0);
        karyawan.setName("jajang");
        dao.update(karyawan);
    }

    // Display the first Karyawan after update
    Karyawan updatedKaryawan = dao.getKaryawan(0);
    System.out.println("Data setelah diubah:");
    System.out.println("id: " + updatedKaryawan.getId() + "\nName: " + updatedKaryawan.getName());
    
    Scanner scanner = new Scanner(System.in);
        List<GajiKaryawan> daftarGaji = new ArrayList<>();

        // Input data gaji karyawan
        System.out.println("\nMasukkan data gaji karyawan (gaji pokok, transportasi, masa kerja):");
        for (int i = 0; i < 1; i++) {
            System.out.println("Karyawan " + (i + 1) + ":");
            System.out.print("Gaji Pokok         : Rp.");
            double gaji_pokok = scanner.nextDouble();
            System.out.print("Biaya Transportasi : Rp.");
            double transportasi = scanner.nextDouble();
            System.out.print("Masa Kerja         : ");
            int masa_kerja = scanner.nextInt();

            GajiKaryawan karyawan = new GajiKaryawan(gaji_pokok, transportasi, masa_kerja);
            daftarGaji.add(karyawan);
        }

        // Menampilkan data gaji karyawan
        System.out.println("\nData Gaji Karyawan:");
        for (int i = 0; i < daftarGaji.size(); i++) {
            GajiKaryawan karyawan = daftarGaji.get(i);
            System.out.println("Karyawan " + (i + 1));
            System.out.println("Masa Kerja  : " + karyawan.getmasa_kerja() + " tahun");
            System.out.println("Gaji Pokok  : Rp. " + karyawan.getgaji_pokok());
            System.out.println("Tunjangan   : Rp. " + karyawan.gettunjangan());
            System.out.println("Transportasi: Rp. " + karyawan.gettransportasi());
 }

 }
}