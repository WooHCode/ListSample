package chapter02;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        //String 타입을 저장할 List를 준비
        List<String> names = new ArrayList<>();
        //<Generic>은 List에 넣을 수 있는 형태를 제한한다.

        //String 타입의 데이터 넣기
        names.add("홍길동");
        names.add("김선비");
        names.add("James");
        names.add("James");
        //List는 중복을 허용한다. Queue 들어오는 순서대로 저장된다.
        //index는 0번부터 시작

        //for문으로 데이터를 하나씩 출력
        for(String name : names){
            System.out.println(name);
        }
    }
}
