package chapter03.used;

/*
*Calculator 기능 구현 클래스
* 덧셈 리턴
*/
public class AddCalc implements Calculator{//Calculator interface 상속받아 기능을 구현함
    @Override
    public Integer calc(Integer x, Integer y){
        return x + y;
    }
}
