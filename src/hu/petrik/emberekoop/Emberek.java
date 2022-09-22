package hu.petrik.emberekoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Emberek {
    private List<Ember> emberek;

    public Emberek(Ember[] emberTomb) {
        emberek = new ArrayList<>();
        this.emberek.addAll(Arrays.asList(emberTomb));

    }

    public  Emberek(String fajlNev) throws IOException {
        FileReader fr = new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);

        br.close();
        fr.close();
    }
    @Override
    public String toString() {
        String s = String.format("%30s %10s (%3d év) %20s",
        "Név", "Szül.dátum", "kor","Szül.hely");
        for (int i = 0; i < this.emberek.size(); i++) {
                s += System.lineSeparator() + this.emberek.get(i);
        }
        return  s.toString();
    }
}