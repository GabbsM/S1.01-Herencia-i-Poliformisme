package Nivel1_Exercici_1;

/*Exercici 1. Crea una classe amb 3 mètodes: un constructor, un main i un mètode, que es invocat pel 'main()'.
 Demostri la seqüència d'execució dels mètodes de la classe.
 */

// Método constructor
class Persona {

    String nombre;
    String apellido;
    int edad;

    public Persona(String nombre,String apellido,int edad){
        System.out.println("en el constructor");
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Método para ser llamado desde main y devolver datos.
    public String dameDatos(){
        System.out.println("en el metodo dameDatos");
        return  "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad;
    }

    public static void main(String[] args) {

        //Instancia de objetos:
        Persona persona1 = new Persona("Gabriel","Moreno",40);

        //llamada al método
        System.out.println(persona1.dameDatos());

    }
}
