import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        Bus bus1 = new Bus(30,0,0,300,100,0,status.START,0);
        Bus bus2 = new Bus(30,0,0,100,100,0,status.START,0);

        Taxi taxi1 = new Taxi("12가2345",100,0,status.START,0,"",
                1,2,3000,1000);
        Taxi taxi2 =new Taxi("14보2342",100,0,status.START,0,"",
                1,2,3000,1000);

        System.out.println(bus1);
        System.out.println(bus2);

        bus1.statusGo();
        bus1.operation();
        bus1.ride(2);
        bus1.showInfo();
        bus1.fuel(-50);
        bus1.showInfo();
        bus1.statusStop();
        bus1.fuel(10);
        bus1.showInfo();
        bus1.statusGo();
        bus1.ride(45);
        bus1.showInfo();
        bus1.fuel(-55);
        bus1.operation();
        bus1.showInfo();





//        System.out.println(taxi1);
//        System.out.println(taxi2);
//
//        taxi1.operation();
//        taxi1.statusChange();
//        taxi1.ride(2);
//        taxi1.destination("서울역");
//        taxi1.distance(2);
//        taxi1.changeVelocity(10); //속력 증가시 연료감소
//        taxi1.fuel(-50);
//        taxi1.totalCharge(); //토탈 요금
//        taxi1.ride(5);
//        taxi1.showInfo();

//        System.out.println(status.STOP.compareTo(status.START)); //.compareTo 는 좌우 비교하여 좌 값이 크면 1 우는 -1



    }
}
