package clases;

public class Automovil {

    private String model;

    // Constructor por defecto.
    public Automovil(){
    }
    // Inicializar cada automovil con su modelo.
    public Automovil(String model){
        super(); // Llama al anterior contructor, pero agregando un String para inicializar el objeto.
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void llantas(){
        System.out.println( getModel() + " tiene 4 llantas.");
    }
}
