/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LingkunganAlam;

/**
 *
 * @author ACER
 */
public class Iklim {

    /**
     * @return the Suhu
     */
    protected float getSuhu() {
        return Suhu;
    }

    /**
     * @param Suhu the Suhu to set
     */
    protected void setSuhu(float Suhu) {
        this.Suhu = Suhu;
    }

    /**
     * @return the CurahHujan
     */
    protected float getCurahHujan() {
        return CurahHujan;
    }

    /**
     * @param CurahHujan the CurahHujan to set
     */
    protected void setCurahHujan(float CurahHujan) {
        this.CurahHujan = CurahHujan;
    }

    /**
     * @return the Kelembapan
     */
    protected float getKelembapan() {
        return Kelembapan;
    }

    /**
     * @param Kelembapan the Kelembapan to set
     */
    protected void setKelembapan(float Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    /**
     * @return the Geografis
     */
    protected String getGeografis() {
        return Geografis;
    }

    /**
     * @param Geografis the Geografis to set
     */
    protected void setGeografis(String Geografis) {
        this.Geografis = Geografis;
    }
    private float Suhu;
    private float CurahHujan;
    private float Kelembapan;
    private String Geografis;
}
