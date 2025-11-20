package Supermarked.model;


public class Vare {

    private String varenummer;
    private String navn;
    private String datoPris;
    private double pris;
    private String enhed;


    public Vare(String varenummer, String navn, double pris) {
        this.varenummer = varenummer;
        this.navn = navn;
        this.datoPris = datoPris;
        this.pris = pris;
        this.enhed = enhed;

    }

    public String getVarenummer(){ return varenummer; }
    public String getNavn(){ return navn; }
    public double getPris() { return pris; }
    public String getDatoPris() { return datoPris; }
    public String getEnhed() { return enhed; }
}