package Nivel1_Exercici_4;

//Crea una classe amb un camp static final i un camp final. Demostri la diferència entre els dos.


class Numero{

    //Creación variable número "final"
    final int numero;

    //Creación variable número "final static"
    final static int numero2 = 9;

    // Creación de final, al que asignaremos valor al instanciar el objeto.
    public Numero(int numero){
        this.numero = numero;
    }

    public static void main(String[] args) {

      /* La diferencia entre "static final" y "final" es que mientras ambos atributos son constantes y se han
        declarar en el momento de su creación, el "static final" puede ser invocado desde el nombre de la clase
        sin ser necesario instanciar un objeto para ello.*/


        //Instancia y llamada para variable final:

        Numero number = new Numero(6);
        System.out.println("Final: El número es " + number.numero);

        //Llamada para variable static final:

        System.out.println("Final static: El número es " + Numero.numero2);


    }
}

