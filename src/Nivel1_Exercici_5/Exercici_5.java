package Nivel1_Exercici_5;

/*Exercici 5. Crea una classe amb un mètode sobrecarregat tres vegades. Defineixi una nova classe que hereti de
  l'anterior i afegeixi una nova versió sobrecarregada del mètode. Mostri que els quatre mètodes estan disponibles
  en la classe  derivada.*/

public class Exercici_5 {
    public static void main(String[] args) {

        // Instanciamos los objetos de la clase y de lal clase que hereda:
        Robot2 robot2 = new Robot2();

        robot2.saludar();
        robot2.saludar("Pepito");
        robot2.saludar("Pepito","Dani");
        robot2.saludar("Pepito","Dani",300);

    }
}

class Robot{
    //Constructor
    public Robot(){

    }

    // Método 1
    public void saludar(){
        System.out.println("Hola humano, soy un robot");
    }

    // Primero método sobrecargado
    public void saludar(String nombre){
        System.out.println("Hola humano, mi nombre es " + nombre + " y soy un robot");
    }

    // Segundo método sobrecargado
    public void saludar(String nombre,String nombrePersona){
        System.out.println("Hola "+ nombrePersona +  " mi nombre es " + nombre + " y soy un robot");
    }

}

class Robot2 extends Robot {

    int edad;

    //Constructor que hereda del principal
      public Robot2(){
        super();

    }
    //Cuarto método sobrecargado.
    public void saludar(String nombre, String nombrePersona,int edad){
        System.out.println("Hola "+ nombrePersona +  " mi nombre es " + nombre + " ,soy un robot y tengo " + edad + " años");
    }
}
