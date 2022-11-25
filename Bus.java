package prac;
public class Bus {
    int maxPassenger = 30;   //최대승객수
    static int nowPassenger;        //현재승객수
    int charge;              //요금
    static int num;              //버스번호
    static int fuel;                //주유량
    int nowSpeed = 30;            //현재속도
    int state;               //상태   0 = 운행, 1 = 차고지행

    //버스 번호
     Bus(int fuel) {
        this.num = num + 1;
        this.fuel = fuel;
        if (fuel < 10) {
            state = 1;
            System.out.println(num + "번 버스 주유량 : " + fuel + " 주유가 필요합니다.");
        } else System.out.println(num + "번 버스 주유량 : " + fuel + " 운행 시작합니다.");
    }
    //운행
     void drive() {
        if (state == 0) {
            System.out.println("상태 = 운행중");
        } else System.out.println("상태 = 차고지행");
    }
    //주유 증감
     void fuelChange(int a) {
        fuel += a;
        if (fuel > 100) {
            fuel = 100;
            System.out.println("기름이 가득 차 있습니다.");
        }
        if (fuel < 10) {
            state = 1;
            System.out.println("주유가 필요합니다.");
        }
    }
    //승객 탑승
     void passengerPlus(int a) {
        nowPassenger += a;
        if (state == 0) {
            if (nowPassenger > 30) {
                nowPassenger = 30;
                System.out.println("정원 초과 입니다.");
            } else System.out.println("현재 승객은 " + nowPassenger + "명 입니다.");
        } else System.out.println("현재 버스가 운행중이 아닙니다");
    }
    //속도
     void speedPlus(int a) {
        nowSpeed += a;
        if (nowSpeed > 0) {
        if (fuel < 10) {
            System.out.println("주유량을 확인해 주세요");
        } else System.out.println("현재 속도는 " + nowSpeed + "km/h 입니다");
        } else {
            nowSpeed = 0;
            System.out.println("현재 속도는 " + nowSpeed + "km/h 입니다");
        }
    }
}
