/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seni;

/**
 *
 * @author ACER
 */
public class Pop extends Musik{

    /**
     * @return the Era
     */
    protected String getEra() {
        return Era;
    }

    /**
     * @param Era the Era to set
     */
    protected void setEra(String Era) {
        this.Era = Era;
    }
    private String Era;
    public static void main(String[] args){
        Pop Rock = new Pop();
        Rock.setSuara("Vokal dan Alat Musik");
        Rock.setIrama("Pitch");
        Rock.setPertunjukan("Bernyanyi dan memainkan alat musik");
        Rock.setMelodi("Catchy");
        Rock.setRitme("Stabil");
        Rock.setGenre("Pop");
        Rock.setLirik("Kehidupan Sehari-hari");
        
        System.out.println("Suara yang dihasilkan dari : " + Rock.getSuara());
        System.out.println("Irama yang dihasilkan : " + Rock.getIrama());
        System.out.println("Pertunjukkan yang ditampilkan adalah : " + Rock.getPertunjukan());
        System.out.println("Melodi Musik : " + Rock.getMelodi());
        System.out.println("Ritme Musik : " + Rock.getRitme());
        System.out.println("Genre Musik : " + Rock.getGenre());
        System.out.println("Lirik : " + Rock.getLirik());
    }
}
