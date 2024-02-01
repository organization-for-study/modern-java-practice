package app.practice.modernjavapractice;

import app.practice.modernjavapractice.ch5.domain.Crew;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

class ModernJavaPracticeApplicationTests {

    List<String> list;
    List<Crew> crews;

    @BeforeEach
    void setUp() throws Exception {
        list = asList("1m", "2m", "3m", "4m", "5m", "6m", "7m", "8m");
        crews = asList(
                Crew.of(1, "이은x", 30, "팀장"),
                Crew.of(2, "이예x", 30, "팀원"),
                Crew.of(3, "김현x", 27, "팀장"),
                Crew.of(4, "전다x", 29, "팀원"),
                Crew.of(5, "황X성", 29, "지원팀"),
                Crew.of(6, "김민x", 29, "팀장"),
                Crew.of(7, "이민x", 29, "팀원")
        );
    }

    @Test
    @DisplayName("Noting to test")
    void contextLoads() {
        System.out.println("Nothing to test");
    }

    @Test
    @DisplayName("스트림을 사용한 순회")
    void stream_1() {
        list.forEach(
                (v) -> {
                    System.out.println("Hello" + v);
                }
        );
    }

    @Test
    @DisplayName("스트림을 사용한 순회2")
    void stream_2() {
        list.stream()
                .filter(v -> Integer.parseInt(v.substring(0, 1)) % 2 == 0)
                .forEach(
                        System.out::println
                );
    }

    @Test
    @DisplayName("동시성을 확인하는 프로그래밍")
    void stream_3() {
        //원래 출력 순서
        crews.forEach(
                (v) -> {
                    if (v.getAge() < 31) {
                        System.out.println(v);
                    }
                });

        System.out.println("=====================================");

        crews.parallelStream()
                .filter(v -> v.getAge() < 31)
                .forEach(
                        System.out::println
                );

        System.out.println("=====================================");

        crews.stream()
                .filter(v -> v.getAge() < 31)
                .forEach(
                        System.out::println
                );
    }

    @Test
    @DisplayName("스트림을 사용한 순회3")
    void stream_4() {
        List<Map<String, String>> teamRoles = Arrays.asList(
                Map.of("Alice", "Developer", "Bob", "Designer"),
                Map.of("Charlie", "Manager", "Dave", "Analyst"),
                Map.of("Eve", "Tester", "Frank", "Developer")
        );

        List<String> roles = teamRoles.stream()
                .flatMap(map -> map.entrySet().stream())
                .map(entry -> entry.getKey() + " is a " + entry.getValue())
                .collect(Collectors.toList());
        System.out.println(roles);
    }
}
