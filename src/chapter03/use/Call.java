package chapter03.use;

import chapter03.used.AddCalc;
import chapter03.used.Calculator;
import chapter03.used.SubCalc;

/**
 * 인터페이스 의존성 확인 클래스
 */

public class Call {
    public static void main(String[] args) {
        Calculator calculator = new SubCalc();
        //사용되는 객체 클래스를 변경 시에는 인터페이스의 의존을 사용했기 때문에 한곳만 수정하면 기능을 변경할 수 있다.
        Integer result = calculator.calc(10,5);

        System.out.println("계산된 결과는 (" + result +")입니다.");
    }
}
