package main;

import clases.Automovil;
import clases.Jeep;
import clases.Suzuki;

public class Main {

    public static void main(String[] args){

        // Hago un primer auto de la clase Automovil(base) de nombre Mini Cooper (usando constructor por default).
        Automovil auto1 = new Automovil();
        // Seteo el modelo.
        auto1.setModel("Mini Cooper C5");
        // Llamo al numero de llantas que tiene.
        auto1.llantas();
        /*
         No tengo color.
         auto1.setModel("Lara"); //Puedo volver a cambiarle el modelo.

         HERENCIA: El hijo es un tipo concreto de lo que es el padre.
         Una bicicleta de carretera es siempre una bicicleta, pero sin embargo, una bicicleta no tiene por qué ser siempre de carretera.
         Diferenciar entre 'ser' y 'tener' en la herencia para usarla de forma correcta, yo no soy un runner de por vida, por lo que
         no debería de ser una superClasse.
         En un desarrollo donde todo cambia, la herencia puede dejar de cumplirse en cualquier momento.
         Problemas:  “la fiesta de los override”
                     “el aluvión de métodos heredados inservibles”
                     “la herencia de 7 niveles”
                     “el quiero heredar y no puedo porque estoy sujeto a otra herencia”
         Relación 1:1

         COMPOSICIÓN: Las ruedas de hecho son una pieza modular e intercambiable que tiene interacción con el coche por medio de una interfaz.
         Se utiliza la clase carro que se compone de dichas otras características como volante, llantas, cinturones.
         Delega sus responsabilidades en colaboradores designados para cada responsabilidad.
         El carro no está atado a un tipo de ruedas, sino a diferentes tipos modulares de todas ellas.
         Relación 0,1,N tipos con los qué interactuar.
         No es polimorfica, pero...
          Con el uso de interfaces, podemos hacer que nuestros objetos compuestos se hagan pasar por la forma que nos venga bien.
          Y lo que es mejor, puedes implementar varias interfaces en cualquier momento o dejar de implementarlas con muchas más versatilidad
          que en la herencia, sin estar atado a nada más que los métodos que implemente esa interfaz concreta.

          https://devexperto.com/herencia-vs-composicion/

        */
        System.out.println();

        // Hago un segundo auto de la clase Automovil(base) de nombre Mazda (usando constructor custom).
        Automovil auto2 = new Automovil("Mazda A2");
        // Llamo al numero de llantas que tiene.
        auto2.llantas();
        // No tengo color
        // auto2.setModel("Lara"); //Puedo volver a cambiarle el modelo.

        System.out.println();

        // Hago un primer auto de la clase Jeep de nombre Jeep Cross (usando constructor por default de Automovil).
        Jeep auto3 = new Jeep();
        // Seteo color.
        auto3.setColor("Rojo");
        // Seteo el modelo.
        auto3.setModel("Jeep Cross");
        // Imprimo color.
        auto3.imprimirColor();
        // Llamo al numero de llantas que tiene.
        auto3.llantas();
        // auto2.setModel("Lara"); //Puedo volver a cambiarle el modelo.

        System.out.println();

        // Hago un segundo auto de la clase Jeep de nombre Jeep Lift (usando constructor custom de Automovil).
        Jeep auto4 = new Jeep("Jeep Lift");
        // Pongo color.
        auto4.setColor("Gray");
        // Imprimo color.
        auto4.imprimirColor();
        // Llamo al numero de llantas que tiene.
        auto4.llantas();
        // Podría simplificar con un constructor de modelo y color como parametros.

        System.out.println();

        System.out.println("-------------------------------------------------------");
        // Polimorfismo objeto Jeep() constructor custom.
        Automovil polimorf1 = new Jeep("JEEP MILITAR");
        // No tengo color.
        polimorf1.llantas();

        Automovil polimorf2 = new Suzuki("AK2B");
        polimorf2.llantas();

        // Polimorfismo objeto Automovil() no se puede.
        // Jeep polimorf2 = new Automovil("Mazda");
        // Jeep polimorf2 = new Automovil();

        // Un tipo hijo tiene que castear a él un tipo padre.
        Jeep j = (Jeep) auto1;
        // Un tipo padre no necesita castear a él un tipo hijo.
        Automovil m = auto4;

        // Polimorfismo es usar sólo el método de la clase heredada que tiene en común con la clase padre.
        // Utilidad:
    }

        // Polimorfismo hacer referencia desde una clase a padre a objetos de clase hijo.

    // Puedo obtener cada método llantas, diferente de cada clase en un sólo método usando la Clase Padre.
    // Oculta / Encapsulación una jerarquía de clases completa.
    public static void revisadoDeLlantas(Automovil a){
        a.llantas();
    }
}