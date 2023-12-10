/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author LENOVO
 */

public class Karyawan {

    private int id;
    private String name;
    private int tgl_masuk;

    public Karyawan(int id, String name, int tgl_masuk) {
        this.id = id;
        this.name = name;
        this.tgl_masuk = tgl_masuk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTglMasuk() {
        return tgl_masuk;
    }

    public void setTglMasuk(int tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }

    public int getid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

