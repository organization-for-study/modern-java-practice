package app.practice.modernjavapractice;

import app.practice.modernjavapractice.ch5.domain.Crew;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.asList;

class ModernJavaPracticeApplicationTests {

    List<Crew> crews;

    @BeforeEach
    void setUp() throws Exception {
        crews = asList(
                Crew.of(1, "이은x", 30, "팀장"),
                Crew.of(2, "이은x", 30, "팀장"),
                Crew.of(2, "이예x", 30, "팀원"),
                Crew.of(3, "김현x", 27, "팀장"),
                Crew.of(4, "전다x", 29, "팀원"),
                Crew.of(5, "황X성", 29, "지원팀"),
                Crew.of(6, "김민x", 29, "팀장"),
                Crew.of(7, "이민x", 29, "팀원")
        );
    }

    @Test
    @DisplayName("팀장만 출력")
    void test_1() {
        Integer sum = crews.stream()
                .filter(crew -> "팀장".equals(crew.getJob()))
                .mapToInt(Crew::getAge)
                .sum();
        System.out.println(sum);
    }

}
