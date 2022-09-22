package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Gipsz Jakab","1988-1-12","Budapest" );
        Ember e2 = new Ember("Tamás Márton","1988-1-12","Pécs" );
        Ember e3 = new Ember("Péter Öcsi","1988-1-12","Szeged" );

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

}
