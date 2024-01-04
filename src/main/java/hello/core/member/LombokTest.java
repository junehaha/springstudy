package hello.core.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LombokTest {
    private String name;
    private int age;

    public static void main(String[] args) {
        LombokTest lombokTest = new LombokTest();

        lombokTest.setAge(10);
        System.out.println(lombokTest);
    }
}
