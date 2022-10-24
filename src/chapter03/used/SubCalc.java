package chapter03.used;

/*
*뺄셈 기능 구현
*/

public class SubCalc implements Calculator{
    @Override
    public Integer calc(Integer x, Integer y){
        return x-y;
    }

}
