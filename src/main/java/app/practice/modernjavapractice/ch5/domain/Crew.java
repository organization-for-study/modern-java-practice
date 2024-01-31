package app.practice.modernjavapractice.ch5.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(of = {"order","name", "age", "job"})
public class Crew {
    Integer order;
    String name;
    Integer age;
    String job;

    public static Crew of(Integer order, String name, Integer age, String job) {
        Crew crew = new Crew();
        crew.order = order;
        crew.name = name;
        crew.age = age;
        crew.job = job;
        return crew;
    }

    public static Crew of(String name, Integer age) {
        Crew crew = new Crew();
        crew.order = 0;
        crew.name = name;
        crew.age = age;
        crew.job = "팀원";
        return crew;
    }
}
