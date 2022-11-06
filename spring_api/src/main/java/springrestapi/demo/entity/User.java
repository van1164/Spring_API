package springrestapi.demo.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

public class User {

    @Id // 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    @Column(length = 10, nullable = false) // 10글자 제한, not null
    private String name;

    @Column(nullable = false) // not null
    private Integer age;

    @Column(nullable = false) // not null
    private String createTime;
}
