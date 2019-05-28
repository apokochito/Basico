package clases;

public class Jeep extends Automovil {

    private String color;

    // Constructor por defecto.
    public Jeep() {
        super();
    }
    // Inicializar cada Jeep con su modelo usando el contructor de la clase padre que tenga
    // como parametro un String
    // Constructor custom
    public Jeep(String model){
        super(model);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Sobrescribir el método del padre
    @Override
    public void llantas(){
        System.out.println(getModel()+ " tiene 5 llantas.");
    }

    public void imprimirColor(){
        System.out.println("Color: "+getColor()+ ".");
    }

}
