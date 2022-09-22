package hu.petrik.emberekoop;

import java.time.LocalDate;
import java.util.Date;

public class Ember {
    private String nev;
    private String szulDatum;
    private String szulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        this.szulDatum = szulDatum;
        this.szulHely = szulHely;
    }

    public int getSzuletesiEv(){
        int szuletesiEv = Integer.parseInt(this.szulDatum.substring(0, 4));
        return  szuletesiEv;
    }

    public int getSzuletesiHonap(){
        String[] szuletesiAdtok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdtok[1]);
    }

    public int getSzuletesiNap(){
        String[] szuletesiAdtok = this.szulDatum.split("-");
        return Integer.parseInt(szuletesiAdtok[2]);
    }

    public  int getEletKor(){
        return LocalDate.now().getYear() - this.getSzuletesiEv();
    }

    @Override
    public String toString() {
        return String.format("%30s %10s (%3d év) %20s", this.nev, this.szulDatum, this.getEletKor() ,this.szulHely);
    }
}
