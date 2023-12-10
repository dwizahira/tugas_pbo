/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Karyawan;
import java.util.ArrayList;
import java.util.List;

public abstract class KaryawanDaoImp implements KaryawanDao { 
    List<Karyawan> ky;

    public KaryawanDaoImp() {
        ky = new ArrayList<>();
        ky.add(new Karyawan(1, "budi", 2008));
        ky.add(new Karyawan(2, "andi haryanto", 2012));
        ky.add(new Karyawan(3, "wawan", 2017));
    }

    @Override
    public List<Karyawan> getAllKaryawan() {
        return ky;
    }

    @Override
    public Karyawan getKaryawan(int id) {
        return ky.get(id);
    }

    @Override
    public void update(Karyawan karyawan) {
        Karyawan existingKaryawan = ky.get(karyawan.getId());
        if (existingKaryawan != null) {
            existingKaryawan.setName(karyawan.getName());
            System.out.println("id pegawai = " + karyawan.getId() + " diubah pada database");
        } else {
            System.out.println("Karyawan with id " + karyawan.getId() + " not found.");
        }
    }

    @Override
    public void delete(Karyawan karyawan) {
        ky.remove(karyawan);
        System.out.println("hapus id = " + karyawan.getId() + " dihapus dari database");
    }
}
