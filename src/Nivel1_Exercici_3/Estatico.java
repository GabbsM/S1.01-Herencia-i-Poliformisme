package Nivel1_Exercici_3;

public class Estatico {

    public Estatico(){
        System.out.println("Mi Constructor");
    }
    static{
        System.out.println("bloque estatico 1");
    }
    {
        System.out.println("bloque de inicializacion");
    }
    static{
        System.out.println("bloque estatico 2");
    }
    public static void main(String[] args) {
        System.out.println("main");
        new Estatico();
    }

}
