package Nivel2_Exercici_1;
/*
Creu una classe Cycle, amb subclasses Unicycle, Bicycle i Tricycle. *
    Demostri que es pot generalitzar una instància de cada tipus a Cycle mitjançant un mètode 'ride()'. *
Afegeixi un mètode 'wheels()' a Cycle, que retorni el nombre de rodes. *
    Modifiqui 'ride()' per a invocar 'wheels()' i verifiqui que funciona el polimorfisme.*
Afegeixi un mètode 'balance()' a Unicycle i a Bicycle, però no a Tricycle. *
    Creu instàncies de tres tipus i generalitzi-les per a formar una matriu d'objectes Cycle. *
    Tracti d'invocar 'balance()' en cada element de la matriu. *
    Realitzi una especialització i invoqui 'balance()' demostrant el que ocorre.
 */
public class Cycle {

    int wheels;

    public Cycle(int wheels) {
        this.wheels = wheels;
    }

    public Integer wheels(){
        return this.wheels;
    }

    public String ride(){
        return "Brum brum: " + wheels();
    }

    public static void main(String[] args) {

        //Generalización
        Cycle uniciclo = new Unicycle();
        Cycle bici = new Bicycle();
        Cycle triciclo = new Tricycle();

        //Demostramos generalización:
        System.out.println(uniciclo.ride());
        System.out.println(bici.ride());
        System.out.println(triciclo.ride());

        //Número de ruedas:
        System.out.println(uniciclo.wheels());
        System.out.println(bici.wheels());
        System.out.println(triciclo.wheels());

        //Ultimo paso:
        Unicycle uniciclo1 = new Unicycle();
        Bicycle bici1 = new Bicycle();
        Tricycle triciclo1 = new Tricycle();

        Cycle[] miarray = new Cycle[] {
                uniciclo1,
                bici1,
                triciclo1
        };

        //Tracti d'invocar 'balance()' en cada element de la matriu: No es posible porque balance() no existe en Cycle.
        // miarray[0].balance(); // ERROR
          ((Unicycle) miarray[0]).balance(); // OK
          ((Bicycle) miarray[1]).balance(); // OK
//        ((Tricycle) miarray[2].balance()); // ERROR
    }





}

class Unicycle extends Cycle{
     public Unicycle() {
             super(1);
     }

     public String balance(){
         return "nulo";
     }
}

class Bicycle extends Cycle{
    public Bicycle() {
        super(2);
    }
    public String balance(){
        return "poco";
    }
}

class Tricycle extends Cycle{
    public Tricycle() {
        super(3);
    }
}