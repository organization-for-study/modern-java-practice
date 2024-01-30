package app.practice.modernjavapractice.ch5.domain;

import lombok.Getter;

@Getter
public class Crew {
    String name;
    Integer age;
    String job;

    public static Crew of(String name, Integer age, String job) {
        Crew crew = new Crew();
        crew.name = name;
        crew.age = age;
        crew.job = job;
        return crew;
    }

    public static Crew of(String name, Integer age) {
        Crew crew = new Crew();
        crew.name = name;
        crew.age = age;
        crew.job = "팀원";
        return crew;
    }
}
