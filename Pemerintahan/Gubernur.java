/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pemerintahan;

/**
 *
 * @author ACER
 */
public class Gubernur extends PemerintahanProvinsi {

    /**
     * @return the Kedudukan
     */
    protected String getKedudukan() {
        return Kedudukan;
    }

    /**
     * @param Kedudukan the Kedudukan to set
     */
    protected void setKedudukan(String Kedudukan) {
        this.Kedudukan = Kedudukan;
    }

    /**
     * @return the CaraMemilih
     */
    protected String getCaraMemilih() {
        return CaraMemilih;
    }

    /**
     * @param CaraMemilih the CaraMemilih to set
     */
    protected void setCaraMemilih(String CaraMemilih) {
        this.CaraMemilih = CaraMemilih;
    }

    /**
     * @return the MasaJabatan
     */
    protected int getMasaJabatan() {
        return MasaJabatan;
    }

    /**
     * @param MasaJabatan the MasaJabatan to set
     */
    protected void setMasaJabatan(int MasaJabatan) {
        this.MasaJabatan = MasaJabatan;
    }

    /**
     * @return the Kewajiban
     */
    protected String getKewajiban() {
        return Kewajiban;
    }

    /**
     * @param Kewajiban the Kewajiban to set
     */
    protected void setKewajiban(String Kewajiban) {
        this.Kewajiban = Kewajiban;
    }
    
    private String Kedudukan;
    private String CaraMemilih;
    private int MasaJabatan;
    private String Kewajiban;
    

    
}
