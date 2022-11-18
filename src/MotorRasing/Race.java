package MotorRasing;

public class Race {
    public static void main(String[] args) {

        MotorCars car1= new MotorCars("Lada","2109", 1.7);
        MotorCars car2= new MotorCars("Ford","Mustang", 3.5);
        MotorCars car3= new MotorCars("Mazda","RX-7", 1.3);
        MotorCars car4= new MotorCars("Toyota","Supra", 2.0);


        Truck truck1= new Truck("KAMAZ","4326-9",17);
        Truck truck2= new Truck("Tatra","Phoenix",12.5);
        Truck truck3= new Truck("Renault","Phoenix",14.5);
        Truck truck4= new Truck("Iveco","Valtr Racing",13.8);


        Bus bus1= new Bus("AEC","Routemaster",9.6);
        Bus bus2= new Bus("KAMAZ","6282",0);
        Bus bus3= new Bus("Göppel ","Extra Grant",9.3);
        Bus bus4= new Bus("MAZ","215",8.2);

        DriverB alex= new DriverB("Alex",'B',10, car1);
        DriverC vasiliy= new DriverC("Vasiliy",'C',2,truck3);
        DriverD ivan= new DriverD("Ivan",'D',7,bus3);

        System.out.println(alex);
        alex.driveInfo();

        System.out.println(vasiliy);
        vasiliy.driveInfo();

        System.out.println(ivan);
        ivan.driveInfo();
    }
}
