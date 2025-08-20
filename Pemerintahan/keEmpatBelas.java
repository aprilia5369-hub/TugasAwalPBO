/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemerintahan;

/**
 *
 * @author ACER
 */
public class keEmpatBelas extends Gubernur {

    /**
     * @return the PeriodeJabatan
     */
    protected String getPeriodeJabatan() {
        return PeriodeJabatan;
    }

    /**
     * @param PeriodeJabatan the PeriodeJabatan to set
     */
    protected void setPeriodeJabatan(String PeriodeJabatan) {
        this.PeriodeJabatan = PeriodeJabatan;
    }

    /**
     * @return the PartaiPendukung
     */
    protected String getPartaiPendukung() {
        return PartaiPendukung;
    }

    /**
     * @param PartaiPendukung the PartaiPendukung to set
     */
    protected void setPartaiPendukung(String PartaiPendukung) {
        this.PartaiPendukung = PartaiPendukung;
    }

    /**
     * @return the Visi
     */
    protected String getVisi() {
        return Visi;
    }

    /**
     * @param Visi the Visi to set
     */
    protected void setVisi(String Visi) {
        this.Visi = Visi;
    }
    private String PeriodeJabatan;
    private String PartaiPendukung;
    private String Visi;
public static void main(String[] args){
    keEmpatBelas Khofifah = new keEmpatBelas();
    Khofifah.setWilayahKerja("Jawa Timur");
    Khofifah.setPemimpin("Gubernur dan Wakil Gubernur");
    Khofifah.setFungsi("Memimpin penyelenggaraan pemerintahan daerah jawa timur");
    Khofifah.setKedudukan("Gubernur Jawa Timur");
    Khofifah.setCaraMemilih("Dipilih langsung oleh rakyat melalui pilgub serentak");
    Khofifah.setMasaJabatan(5);
    Khofifah.setKewajiban("Pembangunan berjalan, masyarakat sejahtera, dan ketertiban umum");
    
    System.out.println("Wilayah Kerja : " + Khofifah.getWilayahKerja());
    System.out.println("Pemimin : " + Khofifah.getPemimpin());
    System.out.println("Fungsi : " + Khofifah.getFungsi());
    System.out.println("Kedudukan Ibu Khofifah : " + Khofifah.getKedudukan());
    System.out.println("Cara Memilih : " + Khofifah.getCaraMemilih());
    System.out.println("Masa jabatan : " + Khofifah.getMasaJabatan());
    System.out.println("Kewajiban : " + Khofifah.getKewajiban() );
}
    
}
