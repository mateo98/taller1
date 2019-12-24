import patos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Hierro ironDuck = new Hierro();
        Hierro bionico = new Hierro();
        Hierro tesla = new Hierro();
        Madera hoodPato = new Madera();
        Madera superPato = new Madera();
        Madera woody = new Madera();
        Silvestre donaldPato = new Silvestre();
        Silvestre lucas = new Silvestre();
        Silvestre patula = new Silvestre();
        Hule base20Pato = new Hule();
        Hule Patito = new Hule();
        Hule jeff = new Hule();
        WarnerDuck donald = new WarnerDuck(); //no hacer instancias de clases abstractas

        ArrayList<Pato> allDuck = new ArrayList<>();

        allDuck.add(donald);
        allDuck.add(ironDuck);
        allDuck.add(bionico);
        allDuck.add(tesla);
        allDuck.add(hoodPato);
        allDuck.add(superPato);
        allDuck.add(woody);
        allDuck.add(donaldPato);
        allDuck.add(lucas);
        allDuck.add(patula);
        allDuck.add(base20Pato);
        allDuck.add(Patito);
        allDuck.add(jeff);

        for(Pato pato:allDuck){
            System.out.println(pato);
        }

        ArrayList<Swimable> swimDuck = new ArrayList<>();

        swimDuck.add(lucas);
        swimDuck.add(woody);
        swimDuck.add(jeff);
        swimDuck.add(hoodPato);
        swimDuck.add(superPato);
        swimDuck.add(donaldPato);
        swimDuck.add(patula);
        swimDuck.add(Patito);
        swimDuck.add(base20Pato);

        for(Swimable pato:swimDuck){
            pato.doSwim();
        }

        ArrayList<Cuackable> cuackDuck = new ArrayList<>();
        cuackDuck.add(donaldPato);
        cuackDuck.add(lucas);
        cuackDuck.add(patula);
        cuackDuck.add(base20Pato);
        cuackDuck.add(Patito);
        cuackDuck.add(jeff);

        for(Cuackable pato:cuackDuck){
            pato.doCuack();
        }


    }

}
