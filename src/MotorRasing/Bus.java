package MotorRasing;

public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engine){

        super(brand, model, engine);
    }

    @Override
    public void start(){
        System.out.println("Залесть в салон и завести двигатель");
    }

    @Override
    public  void finish(){
        System.out.println("Выключить двигатель и выйти из салона");
    }

    @Override
    public String toString(){
        return "Автобус: "+ super.toString();
    }

    public void pitStop() {
        System.out.println("Заехать в боксы");
        System.out.println("Заправить автобус и сменить резину");
    }

    @Override
    public void lapTime(){
        System.out.println("Лучшая скорость круга у автобуса");
    }

    @Override
    public  void  maxSpeed(){
        System.out.println("Максимальная скорость у автобуса");
    }
}
