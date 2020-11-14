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
public class PBOIF210119058Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BiayaEmasKawin biayaemaskawin = new BiayaEmasKawin("Hendi");
        
        biayaemaskawin.setBeratEmas(15.7);
        biayaemaskawin.setHarga(570000.0);
        double beratEmas = biayaemaskawin.getBeratEmas();
        double harga = biayaemaskawin.getHarga();
        System.out.println("Jumlah Emas yang akan di beli : " + beratEmas + " gram");
        System.out.println("Harga Emas Per/Gram : Rp. " + harga);
        System.out.println("Total Bayar : Rp. "  + biayaemaskawin.totalBayar(beratEmas, harga));
    }
    
}

