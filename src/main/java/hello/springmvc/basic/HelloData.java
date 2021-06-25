package hello.springmvc.basic;

import lombok.Data;

/**
 * @Data mean:
 * getter, setter, toString, hashcode, requiredArgsConstructor
 */
@Data
public class HelloData  {
    private String username;
    private int age;
}
