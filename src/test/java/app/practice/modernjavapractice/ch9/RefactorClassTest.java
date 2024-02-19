package app.practice.modernjavapractice.ch9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

class RefactorClassTest {
    private RefactorClass refactorClass;
    private List<String> stringList = new LinkedList<>();

    @BeforeEach
    void setUp() {
        refactorClass = new RefactorClass();
        for (int i = 0; i < 50000; i++) {
            stringList.add("B" + i);
        }
        List<Integer> list = asList(1, 2, 3);
        list.add(1);
    }

    @Test
    void 여러건을_반복할_수_있다() {
        refactorClass.loop(stringList);
    }

    @Test
    void 여러건을_병렬로_반복할_수_있다() {
        refactorClass.parallelStreamLoop(stringList);
    }

    @Test
    void 여러건을_병렬로_반복할_수_있다2() {

    }
}