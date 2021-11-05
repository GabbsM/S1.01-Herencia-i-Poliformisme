package Nivel1_Exercici_2;

/* Exercici 2. Crea una classe amb dos mètodes: un static (a part del main) i un altre no-static. Demostri com invocar
   el mètode static i el no-static des del main.
 */

public class Coche {

    String color;

    public Coche(String color){
        this.color = color;
    }

    public String getColor(){
        return "El coche es de color " + color;
    }

    public static String staticMetodo() {
        return "Soy un metodo estatico";
    }

    public static void main(String[] args) {
        // Aquí se llama al método  no estático
        Coche coche = new Coche("azul");
        System.out.println(coche.getColor());

        // Aquí se llama al método estático.
        System.out.println(Coche.staticMetodo());


    }

}
