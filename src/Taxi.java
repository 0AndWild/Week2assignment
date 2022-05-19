
public class Taxi extends Car {
    public Taxi(int charge, String number , int oil, int nowVelocity, status status, int passengerRideOn,
                String destination, int basicDistance, int destinationDistance, int minimumFare, int chargeForDistance)
    {super(charge, number, oil, nowVelocity, status, passengerRideOn, destination,
            basicDistance, destinationDistance, minimumFare, chargeForDistance);}



    //<운행>
    public status operation() {
        if (getOil() <= 10) {
            System.out.println("주유량을 확인해주세요");
        }
        setStatus(status.START); //운행상태 일반
        return null;
    }

    //택시운행상태 변경
    public void statusChange(){
        if (getOil()==0) {
            setStatus(status.STOP); //기름이 0일 때 탑승 불가처리
        }
    }

    //<승객탑승>
    public void ride (int on) {
        if (getNowPassenger()==0) {     //'일반'일때만
            if (on>1) { //1명이상 탑승할경우
                setNowPassenger(getNowPassenger()+on);
                setStatus(status.START); //운행중으로 전환
                System.out.println("탑승중");
            }
        }else setStatus(status.STOP); // 승객이 1명이상 탑승인 경우 탑승불가로 상태변경
        System.out.println("탑승불가합니다");
    }

    //<속도변경>
    public void changeVelocity (int speed) {
        int curSpeed = getNowVelocity()+speed;
        int curOil= getOil();
        if(curSpeed<0){
            curSpeed = 0;
            setNowVelocity(0);
            System.out.println("운행이 중단됩니다");
            return;
        }
        setNowVelocity(curSpeed);
        setOil(curOil-10);

    }

    //결제요금
    public void totalCharge(){
        if(getBasicDistance()<getDestinationDistance()){ //기본거리보다 목적지거리보다 멀 경우
            for (int i=1;i<=getDestinationDistance()-getBasicDistance();i++){ // 1만큼의 거리마다 추가요금
                setCharge(getChargeForDistance() * i+getMinimumFare()); // 거리당추가요금 * i(추가거리) +기본요금 = 운행요금
                System.out.println("결제하실요금은 "+getCharge()+" 입니다.");
            }
        } else
            setCharge(getMinimumFare()); //목적지가 기본거리랑 같을경우 = 기본요금
    }
    public void showInfo(){
        System.out.println(this.getNumber()+" 택시 목적지는 "+ this.getDestination() +"이다");
        System.out.println("현재 "+this.getNumber()+" 택시는 "+this.getStatus()+" 상태 이고 연료량은 "+this.getOil()+" 현재 속력은 "+this.getNowVelocity()+" 이다 ");
    }
}


