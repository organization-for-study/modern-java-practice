package app.practice.modernjavapractice.ch5.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Objects;

@Getter
@ToString(of = {"order", "name", "age", "job"})
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Crew crew)) return false;
        return  Objects.equals(name, crew.name) && Objects.equals(age, crew.age) && Objects.equals(job, crew.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, name, age, job);
    }
}
