package hu.petrik.emberekoop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Gipsz Jakab", "1988-1-12", "Budapest");
        Ember e2 = new Ember("Tamás Márton", "1999-10-12", "Pécs");
        Ember e3 = new Ember("Péter Öcsi", "1988-12-12", "Szeged");
        Ember e4 = new Ember("Kovács Béla", "1960-1-12", "Miskolc");
        Ember e5 = new Ember("Lakatos József", "2005-1-12", "Debrecen");
        Ember[] emberTomb = new Ember[]{e1, e2, e3, e4, e5};
        Emberek ek = new Emberek(emberTomb);
        String fajlNev = "sajt.txt";
        try {
            Emberek ek2 = new Emberek("jozsi.txt");
        } catch (FileNotFoundException e){
            System.out.printf("A(z) %s nem található\n",fajlNev);
        } catch (IOException e){
            System.out.println("Ismeretlen hiba történt");
        }


    }

}
