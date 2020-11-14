/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan49.biayaemaskawin;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung biaya emas
 *                     kawin.
 */
public class BiayaEmasKawin {
    private double beratEmas, harga;
    private String nama;
    
    public BiayaEmasKawin(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }
     public double getBeratEmas() {
        return this.beratEmas;
    }
    
    public void setBeratEmas(double beratEmas) {
        this.beratEmas = beratEmas;
    }
    
    public double getHarga() {
        return this.harga;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double totalBayar(double beratEmas, double harga) {
        return beratEmas * harga;
    }
}
    

