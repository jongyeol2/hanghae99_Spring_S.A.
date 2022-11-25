package prac;

public class Taxi {
    int num;  // 택시번호
    int fuel;  //주유량
    int speed;   // 현재속도
    int destination;   // 목적지
    int distance;     //기본거리
    int distanceToDestination;  //목적지까지 거리
    int basicCharge;  // 기본요금
    int distanceCharge;   // 거리당요금
    int state;   // 상태  운행중 = 0 , 일반 = 1, 운행불가 = 2

    public Taxi() {
        //Bus랑 동일하게 진행 ㄱ
    }

}
