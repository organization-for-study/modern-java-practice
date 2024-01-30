package app.practice.modernjavapractice;

import app.practice.modernjavapractice.ch5.domain.Crew;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class ModernJavaPracticeApplicationTests {

    List<String> list;
    List<Crew> crews;

    @BeforeEach
    void setUp() throws Exception {
        list = asList("1m", "2m", "3m", "4m", "5m", "6m", "7m", "8m");
        crews = asList(
                Crew.of("이은x", 30, "팀장"),
                Crew.of("이예x", 30, "팀원"),
                Crew.of("김현x", 27, "팀장"),
                Crew.of("전다x", 29, "팀원")
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

}
