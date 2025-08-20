/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seni;

/**
 *
 * @author ACER
 */
public class Musik extends Suara {

    /**
     * @return the Melodi
     */
    protected String getMelodi() {
        return Melodi;
    }

    /**
     * @param Melodi the Melodi to set
     */
    protected void setMelodi(String Melodi) {
        this.Melodi = Melodi;
    }

    /**
     * @return the Ritme
     */
    protected String getRitme() {
        return Ritme;
    }

    /**
     * @param Ritme the Ritme to set
     */
    protected void setRitme(String Ritme) {
        this.Ritme = Ritme;
    }

    /**
     * @return the Genre
     */
    protected String getGenre() {
        return Genre;
    }

    /**
     * @param Genre the Genre to set
     */
    protected void setGenre(String Genre) {
        this.Genre = Genre;
    }

    /**
     * @return the Lirik
     */
    protected String getLirik() {
        return Lirik;
    }

    /**
     * @param Lirik the Lirik to set
     */
    protected void setLirik(String Lirik) {
        this.Lirik = Lirik;
    }
    private String Melodi;
    private String Ritme;
    private String Genre;
    private String Lirik;
    
}
