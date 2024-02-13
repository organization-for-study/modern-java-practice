package app.practice.modernjavapractice.ch9;

import java.sql.Time;
import java.util.List;

public class RefactorClass {

    public void loop(List<String> list) {
        //반복 시작 초기록
        Time start = new Time(System.currentTimeMillis());

        for (String s : list) {
            System.out.println(s);
        }

        //반복 종료 초기록
        Time end = new Time(System.currentTimeMillis());

        //반복 소요시간 출력
        System.out.println("소요시간: " + (end.getTime() - start.getTime()) + "ms");
    }


    public void parallelStreamLoop(List<String> list) {
        //반복 시작 초기록
        Time start = new Time(System.currentTimeMillis());

        list.parallelStream()
                .forEach(System.out::println);

        //반복 종료 초기록
        Time end = new Time(System.currentTimeMillis());

        //반복 소요시간 출력
        System.out.println("소요시간: " + (end.getTime() - start.getTime()) + "ms");
    }
}
