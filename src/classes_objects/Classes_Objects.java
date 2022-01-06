package classes_objects;

public class Classes_Objects {

    public static void main(String[] args) {

        Park_Lots lot = new Park_Lots("West Wing", 4);
        Car VW = new Car("VW");
        Car BMW = new Car("BMW");
        Car KIA = new Car("KIA");
        Car Changan = new Car("Changan");
        Car Infiniti = new Car("Infiniti");
        Car Audi = new Car("Audi");

        System.out.println(lot.getParkLotSize());
        System.out.println(lot);
        System.out.println(lot.getLimit());

        System.out.println();

        lot.removeCars(KIA);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

        System.out.println();

        lot.addCars(VW);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

        System.out.println();

        lot.addCars(BMW);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

        System.out.println();

        lot.addCars(KIA);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

        System.out.println();

        lot.addCars(BMW);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

        System.out.println();

        lot.addCars(Changan);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

        System.out.println();

        lot.addCars(Infiniti);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

        System.out.println();

        lot.addCars(Audi);
        System.out.println(lot.getParkLotSize());
        System.out.println(lot);

    }

}
