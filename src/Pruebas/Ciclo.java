package Pruebas;
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
public class Ciclo {

    //Creamos método ride. Agregamos la conquetación con el método wheels para demostrar el polimorfismo.
    public String ride(){
        return "Soy un objeto de una clase que hereda de Ciclo" ; // + wheels();
    }

    // Creamos constructor con atributo "ruedas" y creamos el método wheels:
    int ruedas;

    public Ciclo(int ruedas){
        this.ruedas = ruedas;
    }

    public Integer wheels(){
        return this.ruedas;
    }

    public static void main(String[] args) {

        // Generalización.
        Ciclo uni = new Monociclo();
        Ciclo bici = new Bicicleta();
        Ciclo tri = new Triciclo();

        //Demostración de la generalización:
        System.out.println("Monociclo: "+ uni.ride());
        System.out.println("Bicicleta: " + bici.ride());
        System.out.println("Triciclo1: " + tri.ride());

        //Llamada a método wheels:
        System.out.println("El monociclo tiene " + uni.wheels() + " rueda") ;
        System.out.println("La bicicleta tiene " + bici.wheels() + " ruedas");
        System.out.println("El triciclo tiene " + tri.wheels() + " ruedas");

        Monociclo uni1 = new Monociclo();
        Bicicleta bici2 = new Bicicleta();
        Triciclo tri2 = new Triciclo();

        Ciclo[] miarray = new Ciclo[]{
                uni,
                bici2,
                tri2,
        };

        //No es posible invocar al método "balance()" en los elementos de la matriz porque el método solo existe en
        // "Monociclo" y en "Bicicleta"



    }

}

class Monociclo extends Ciclo{

    public Monociclo(){
        super(1);
    }

    public String balance(){
        return "La estabilidad es deficiente";
    }

}
class Bicicleta extends Ciclo{
    public Bicicleta(){
        super(2);
    }
    public String balance(){
        return "La estabilidad es media";
    }


}
class Triciclo extends Ciclo{
    public Triciclo(){
        super(3);
    }

}
