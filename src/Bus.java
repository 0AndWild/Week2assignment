import java.util.Random;

//<버스>
public class Bus extends Car {


    public Bus(int maxPassenger, int nowPassenger, int charge, int Num, int oil, int nowVelocity, status status, int passengerRideOn) {
        super(maxPassenger, nowPassenger, charge, Num, oil, nowVelocity, status, passengerRideOn);
    }

    public void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
    }


    //<운행>


    //버스상태변경
    public void statusStop(){
        setStatus(status.STOP);
        System.out.println("차고지행입니다");
    }
    //버스상태변경
    public void statusGo() {
        setStatus(status.START);
        System.out.println("운행중");
    }

    //<버스시작>
    public status operation () {
        if (getOil() <= 10) {
            System.out.println("주유량을 확인해주세요");
        }
        setStatus(status.START);
        return null;
    }


    //버스운행 시작전
    public void check () {
        if (getOil() < 10) {
            System.out.println("주유가 필요합니다");
        } else if (getOil() == 0) {
            setStatus(status.STOP);
        }
    }

    //<승객탑승>
    public void ride ( int on){
        int passengerOn = getNowPassenger() + on;
        int max = getMaxPassenger() - passengerOn; //초과인원
        int paid = 1000 * on;
        if (getOil() >= 1) {            //'운행중'일때만
            if (passengerOn <= getMaxPassenger()) {    //현재인원이 최대인원 이하일경우
                setNowPassenger(passengerOn);    //
                setCharge(paid); //버스가 벌어들인 수익
            } else { //만차일경우
                setNowPassenger(getMaxPassenger()); // 현재 탑승인원을 최대 탑승인원으로
                setCharge(getCharge() + (on * 1100) - Math.abs(max) * 1100); //탑승인원 * 요금 - 탑승불가인원*요금
                System.out.println("만차입니다 " + Math.abs(max) + " 분은 다음에 탑승해주세요"); // 탑승 불가 인원 표시
            }
        }
    }

    //<속도변경>
    public void changeVelocity ( int speed){
        int curSpeed = getNowVelocity() + speed;
        int curOil = getOil();
        if (curSpeed < 0) {
            curSpeed = 0;
            setNowVelocity(0);
            System.out.println("운행이 중단됩니다");
            return;
        }
        setNowVelocity(curSpeed);
        setOil(curOil - 10);
    }
    //주유량변경
    public void fuel ( int oil){
        setOil(getOil() + oil);
    }





    public void showInfo(){
        System.out.println(getNum()+" 번 버스 현재 승객 수 는 "+this.getNowPassenger()+" 명 이고 수익은 "+this.getCharge()+" 이다");
        System.out.println("현재 버스는 "+this.getStatus()+ " 이고 연료량은 "+this.getOil()+" 이고 현재 속력은 "+this.getNowVelocity()+" 이다");
    }
}















