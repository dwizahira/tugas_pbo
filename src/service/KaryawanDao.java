/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import entity.Karyawan;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface KaryawanDao {
    public List<Karyawan> getAllKaryawan();
    public Karyawan getKaryawan(int id);
    void update(Karyawan karyawan);
    void delete(Karyawan karyawan);

    public Object getALLKaryawan();

    public void getkaryawan(int i);

    public Object getallKaryawan();

    public Object getAllkaryawan();
}
