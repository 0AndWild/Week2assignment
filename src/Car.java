//주유량
//현재속도

public class Car {
    private int maxPassenger; //최대인원                 //<필드값 영역!>
    private int nowPassenger;  //현재인원
    private int charge; // 요금
    private int Num;  //버스번호
    private int oil;    //주유량
    private int nowVelocity;   //현재속도
//    private int changeVelocity;   //변경속도
    private status status; // 운행상태

    private int passengerRideOn; //탑승인원
    private String destination; //목적지
    private int basicDistance; //기본거리
    private int destinationDistance; //목적지까지거리
    private int minimumFare; //기본요금
    private int chargeForDistance; //거리당요금

    private String number; //택시번호


    ///버스
    public Car(int maxPassenger, int nowPassenger, int charge, int Num, int oil, int nowVelocity, status status,int passengerRideOn) {
        this.maxPassenger = maxPassenger;
        this.nowPassenger = nowPassenger;
        this.oil = oil;
        this.charge = charge;
        this.Num = Num;
        this.nowVelocity = nowVelocity;
        this.status =status;
        this.passengerRideOn =passengerRideOn;

    }
    //택시
    public Car(int charge, String number, int oil, int nowVelocity, status status, int passengerRideOn, String destination, int basicDistance, int destinationDistance, int minimumFare, int chargeForDistance) {
        this.charge = charge;
        this.number = number;
        this.oil = oil;
        this.nowVelocity = nowVelocity;
        this.status = status;
        this.passengerRideOn = passengerRideOn;
        this.destination = destination;
        this.basicDistance = basicDistance;
        this.destinationDistance = destinationDistance;
        this.minimumFare = minimumFare;
        this.chargeForDistance = chargeForDistance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getBasicDistance() {
        return basicDistance;
    }

    public void setBasicDistance(int basicDistance) {
        this.basicDistance = basicDistance;
    }

    public int getDestinationDistance() {
        return destinationDistance;
    }

    public void setDestinationDistance(int destinationDistance) {
        this.destinationDistance = destinationDistance;
    }

    public int getMinimumFare() {
        return minimumFare;
    }

    public void setMinimumFare(int minimumFare) {
        this.minimumFare = minimumFare;
    }

    public int getChargeForDistance() {
        return chargeForDistance;
    }

    public void setChargeForDistance(int chargeForDistance) {
        this.chargeForDistance = chargeForDistance;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public int getPassengerRideOn() {
        return passengerRideOn;
    }

    public void setPassengerRideOn(int passengerRideOn) {
        this.passengerRideOn = passengerRideOn;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {this.maxPassenger = maxPassenger;}

    public int getNowPassenger() {return nowPassenger;}

    public void setNowPassenger(int nowPassenger) {this.nowPassenger = nowPassenger;}

    public int getCharge() {return charge;}

    public void setCharge(int charge) {this.charge = charge;}

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {Num = num;}

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getNowVelocity() {
        return nowVelocity;
    }

    public void setNowVelocity(int nowVelocity) {
        this.nowVelocity = nowVelocity;
    }

}
