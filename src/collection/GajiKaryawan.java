/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

/**
 *
 * @author LENOVO
 */
public class GajiKaryawan {
    private double gaji_pokok;
    private double tunjangan;
    private double transportasi;
    private int masa_kerja;
    
    public GajiKaryawan (double gaji_pokok, double tunjangan, double transportasi, int masa_kerja){
        this.gaji_pokok = gaji_pokok;
        this.tunjangan = tunjangan;
        this.transportasi = transportasi;
        this.masa_kerja = masa_kerja;
    }

    public GajiKaryawan(double gaji_pokok, double transportasi, int masa_kerja) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public double getgaji_pokok(){
        return gaji_pokok;
    }
    public void setgaji_pokok(){
        this.gaji_pokok = gaji_pokok;
    }
    public double gettunjangan(){
        return tunjangan;
    }
    public void settunjangan(){
        this.tunjangan = tunjangan;
    }
    public double gettransportasi(){
        return transportasi;
    }
    public void settransportasi(){
        this.transportasi = transportasi;
    }
    public int getmasa_kerja(){
        return masa_kerja;
    }
    public void setmasa_kerja(){
        this.masa_kerja = masa_kerja;
    }
    
    private double hitungtunjangan(int masa_kerja){
        double tunjangan_awal = 500000;
        if (masa_kerja >= 5){
            return tunjangan_awal + (tunjangan_awal * 0.5);  //naik 5% jika masa kerja >= 5 tahun
        } else{
            return tunjangan_awal;
        }
        
    }
}
