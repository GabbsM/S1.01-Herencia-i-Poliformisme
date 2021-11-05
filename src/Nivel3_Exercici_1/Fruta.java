package Nivel3_Exercici_1;
/*
Creu una classe basi amb dos mètodes. *
En el primer mètode, invoqui el segon. *
Defineixi una classe que hereti de l'anterior i substitueixi el segon mètode. *
Creu un objecte de la classe derivada, realitzi una generalització (upcasting) al tipus basi i cridi al primer mètode. *
Demostri el que succeeix.
 */



public class Fruta {

    public String metode1() {
        return metode2();
    }
    private String metode2() {
        return "foo";
    }



}

class Limon extends Fruta{

    private String metode2() {
        return "bar";
    }
    public static void main(String[] args) {

        Limon limon = new Limon();

        Fruta fruta = limon;



        System.out.println(limon.metode1());
        System.out.println(fruta.metode1());

    }
}
