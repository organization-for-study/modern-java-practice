## Modern Java in Action practice repository

### What is this repository?

> [Modern Java in Action](https://product.kyobobook.co.kr/detail/S000001810171) 책을 읽고 실습한 내용을 정리하는 저장소입니다.<br>
> 테스트 코드를 통해 실습한 내용을 정리하고, 이를 통해 Java 8 이후의 기능을 익히고자 합니다.<br>

----

### 실행 환경

아래의 환경에서 작업하길 바랍니다.

- JDK 17
- IntelliJ IDEA ( Ultimate Edition )
- Gradle 8.0 +

----

# Runtime

코드의 실행은 어플리케이션을 시작하는 것이 아닌 테스트 코드의 단위로 실행합니다.

### example

```java
public void parallelStreamLoop(List<String> list) {
    Time start = new Time(System.currentTimeMillis());
    list.parallelStream()
            .forEach(System.out::println);
    Time end = new Time(System.currentTimeMillis());
    System.out.println("소요시간: " + (end.getTime() - start.getTime()) + "ms");
}

@Test
void 여러건을_병렬적으로_반복할_수_있다() {
    private List<String> stringList = new LinkedList<>();
    for (int i = 0; i < 50000; i++)
        stringList.add("B" + new Random().nextInt());

    refactorClass.loop(stringList);
}
```

각 테스트의 단위는 설명의 목적이 될 수도 있고

특정 기능의 실행 결과를 확인하는 목적이 될 수도 

혹은 문제를 제공하는 형태도 가능합니다.


#문제를 제공하는 형태도 가능합니다.

```java
@Test
void 여러건을_병렬적으로_반복할_수_있다() {
    private List<String> stringList = 여러건의_데이터를_제공하는_메서드();
    
    //이떄 병렬적으로 LIST를 DTO로 변환하는 코드를 작성해보세요
    // DTO의 형태는 test/ch05/parallelStreamLoop/DTO.java를 참고하세요
    
}
```
