public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus(30,0,0,100,
                100,0,status.START,0);

        Taxi taxi = new Taxi(0,"경기32가2423",100,0,status.START,
                0,"서울",10,10,3000,150);


        bus.operation();
        bus.statusChange();
        bus.changeVelocity(40);
        bus.ride(7);
        bus.ride(28);
        bus.changeVelocity(0);
//        bus.ride(-3); //-일 때 수익이 변하지 않게 수정 필요

        bus.showInfo();


        taxi.operation();
        taxi.statusChange();
        taxi.ride(1);
//        taxi.ride(-1);
        taxi.changeVelocity(10);
        taxi.totalCharge(); //토탈 요금


        taxi.showInfo();

//        System.out.println(status.STOP.compareTo(status.START)); //.compareTo 는 좌우 비교하여 좌 값이 크면 1 우는 -1



    }
}
