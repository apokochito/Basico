package clases;

public class Suzuki extends Automovil {

    public Suzuki() {
    }

    public Suzuki(String model) {
        super(model);
    }

    @Override
    public void llantas() {
        System.out.println(getModel()+" tiene 2 llantas");
    }
}
