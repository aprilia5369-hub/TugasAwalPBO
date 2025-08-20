/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LingkunganAlam;

/**
 *
 * @author ACER
 */
public class Kalimantan extends Tropis{

    /**
     * @return the LuasWilayah
     */
    protected int getLuasWilayah() {
        return LuasWilayah;
    }

    /**
     * @param LuasWilayah the LuasWilayah to set
     */
    protected void setLuasWilayah(int LuasWilayah) {
        this.LuasWilayah = LuasWilayah;
    }

    /**
     * @return the HewanEndemik
     */
    protected String getHewanEndemik() {
        return HewanEndemik;
    }

    /**
     * @param HewanEndemik the HewanEndemik to set
     */
    protected void setHewanEndemik(String HewanEndemik) {
        this.HewanEndemik = HewanEndemik;
    }

    /**
     * @return the SumberDayaAlam
     */
    protected String getSumberDayaAlam() {
        return SumberDayaAlam;
    }

    /**
     * @param SumberDayaAlam the SumberDayaAlam to set
     */
    protected void setSumberDayaAlam(String SumberDayaAlam) {
        this.SumberDayaAlam = SumberDayaAlam;
    }
    private int LuasWilayah;
    private String HewanEndemik;
    private String SumberDayaAlam;
    public static void main(String[] args){
        Kalimantan Tengah = new Kalimantan();
        Tengah.setSuhu(30);
        Tengah.setCurahHujan(4000);
        Tengah.setKelembapan(70);
        Tengah.setGeografis("Di Khatulistiwa");
        Tengah.setMusim("Hujan Panjang dan Kemarau");
        Tengah.setTumbuhanKhas("Meranti");
        Tengah.setKeanekaragamanHayati("Flora dan Fauna tropis melimpah");
        
        System.out.println("Suhu : " + Tengah.getSuhu());
        System.out.println("Curah Hujan : " + Tengah.getCurahHujan());
        System.out.println("Kelembapan : " + Tengah.getKelembapan());
        System.out.println("Letak Geografis : " + Tengah.getGeografis());
        System.out.println("Musim di Kalimantan Indonesi : " + Tengah.getMusim());
        System.out.println("Tumbuhan khas : " + Tengah.getTumbuhanKhas());
        System.out.println("Keanekaragaman Hayati : " + Tengah.getKeanekaragamanHayati());
    }
}
