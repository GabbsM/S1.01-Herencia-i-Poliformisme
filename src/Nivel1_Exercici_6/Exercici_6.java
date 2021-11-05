package Nivel1_Exercici_6;

/*Crea una classe denominada Amphibian. A partir d'aquesta, defineixi una nova classe denominada Frog que
  hereti de l'anterior. Inclogui una sèrie de mètodes apropiats en la classe basi. En 'main()' creu un objecte Frog
  i relice una generalització a Amphibian, demostrant que tots els mètodes continuen funcionant*/

public class Exercici_6 {

    public static void main(String[] args) {

        //Instancia de clase Frog:
        Frog rana = new Frog("rana","verde");

        // Llamada a método datos:
        System.out.println(rana.datos());

        //Generalización:
        Amphibian rana2 = new Frog("rana","verde");

        //Demostración de que los metodos siguen funcionando.
        System.out.println(rana2.datos());

    }
}

class Amphibian{
    String nombre;
    String color;
    public Amphibian(String nombre,String color){
        this.nombre = nombre;
        this.color = color;
    }

    public String  datos(){
        return "El nombre común de este animal es " + nombre + " y es de color " + color;
    }
}

class Frog extends Amphibian {
    public Frog(String nombre,String color){
        super(nombre, color);

    }
}