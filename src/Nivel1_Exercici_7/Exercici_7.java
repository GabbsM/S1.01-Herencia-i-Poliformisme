package Nivel1_Exercici_7;

public class Exercici_7 {
    /* Modifiqui l'exercici anterior perquè l'objecte Frog substitueixi les definicions de mètodes de la classe basi
       (proporcioni noves definicions utilitzant les mateixes signatures de mètodes). Demostri el que ocorre en 'main()'.
        */
    public static void main(String[] args) {
        Frog rana = new Frog("rana","verde");

        System.out.println(rana.datos());

        Amphibian rana2 = new Frog("rana","verde");

        System.out.println(rana2.datos());

        // Como Frog utiliza un método datos que sobreescribe de Amphibian, utiliza el suyo propio en lugar de el de la clase padre.
    }
}

class Amphibian{
    String nombre;
    String color;
    public Amphibian(String nombre,String color){
        this.nombre = nombre;
        this.color = color;
    }

    public String datos(){
        return "El nombre común de este animal es " + nombre + " y es de color " + color;
    }
}

class Frog extends Amphibian {
    public Frog(String nombre,String color){
        super(nombre, color);

    }

    public String datos(){
        return "El nombre de esta rana es " + nombre + " y es de color " + color;
    }
}
